/*	
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */

package org.universAAL.ontology.reasoner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.serialization.MessageContentSerializer;
import org.universAAL.ontology.reasoner.Persistent;

/**
 * It is a pattern for the Reasoner that its elements need to be saved/loaded
 * and added/removed/returned. To encapsulate the redundant parts this class
 * provides the basic methods to hold object of type P during runtime and
 * save/load them from the file-system using the capabilite of the middlewares
 * serializer.
 * 
 * @author amarinc
 * 
 * @param <P>
 *            Class the be manged. Need to be a sibling of Persistent
 */
public class ElementModel<P extends Resource> {
    private static final String FILENAME_POSTFIX = ".owl";

    private final static Random random = new Random();

    /**
     * Creates a random postfix for a file based on the current date and a
     * random integer. This is to make nearly sure that their is no filename
     * twice on one site and avoid a complicated file-name managing at the other
     * side.
     * 
     * @return Postfix with date and random number
     */
    private static String getFilePostfix() {
	DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	Date date = new Date();
	int randInt = random.nextInt();
	randInt = randInt < 0 ? randInt * -1 : randInt;
	return dateFormat.format(date) + "_" + randInt;
    }

    static {
	random.setSeed(System.currentTimeMillis());
    }

    private MessageContentSerializer serializer = null;

    /**
     * Maps between the URI of an object and the filename to save it
     */
    private HashMap<String, String> mapFileElements = new HashMap<String, String>();

    /**
     * Saves the objects of the type P, where we separate between objects to be
     * saved at the file-system and the one that are not saved
     */
    private ArrayList<P> persistentElements = new ArrayList<P>();
    private ArrayList<P> tmpElements = new ArrayList<P>();

    private String className = null;
    private File elementHome = null;

    /**
     * Creates a new model to manage objects of type P
     * 
     * @param elementClass
     *            Class object of type P
     * @param serializer
     *            serializer to be used for the classes of type P
     * @param rootPath
     *            Absolute path to the root of the bundle-config-home (without
     *            ending "/")
     */
    public ElementModel(Class<P> elementClass,
	    MessageContentSerializer serializer, String rootPath) {
	this.serializer = serializer;
	className = elementClass.getSimpleName();
	elementHome = new File(rootPath + "/" + className);
	elementHome.mkdirs();
    }

    public boolean saveElements() {
	for (P element : this.persistentElements)
	    if (!this.save(element))
		return false;
	return true;
    }

    public boolean save(P element) {
	String existingElement = mapFileElements.get(element.getURI());
	String filename = existingElement != null ? existingElement : className
		+ getFilePostfix() + FILENAME_POSTFIX;

	File file = new File(elementHome, filename);
	if (saveObject(element, file)) {
	    mapFileElements.put(element.getURI(), filename);
	}
	return false;
    }

    private boolean saveObject(P element, File file) {
	try {
	    if (!file.exists() && !file.createNewFile())
		return false;

	    BufferedWriter bw;

	    bw = new BufferedWriter(new FileWriter(file, false));
	    bw.write(serializer.serialize(element));

	    bw.close();

	    return true;
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return false;
    }

    public int getPersistentElementIndex(P element) {
	for (int i = 0; i < persistentElements.size(); i++)
	    if (persistentElements.get(i).getURI().equals(element.getURI()))
		return i;
	return -1;
    }

    public void loadElements() {
	this.persistentElements.clear();
	for (File file : elementHome.listFiles())
	    add(load(file));
    }

    @SuppressWarnings("unchecked")
    public P load(File file) {
	if (!file.exists())
	    return null;
	try {
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    StringBuilder content = new StringBuilder();
	    String line = null;
	    while ((line = br.readLine()) != null) {
		content.append(line);
		content.append(System.getProperty("line.separator"));
	    }
	    br.close();

	    P savedElement = (P) serializer.deserialize(content.toString());
	    if (savedElement != null && savedElement.isWellFormed()) {
		this.mapFileElements.put(savedElement.getURI(), file.getName());
		return savedElement;
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return null;
    }

    public P add(P element) {
	if (element == null)
	    return null;
	P existingElement = getElement(element.getURI());
	if (existingElement != null)
	    return existingElement;
	existingElement = getElement(element);
	if (existingElement != null)
	    return existingElement;

	if (!(element instanceof Persistent)
		|| (element instanceof Persistent && ((Persistent) element)
			.isPersistent())) {
	    persistentElements.add(element);
	    save(element);
	} else {
	    tmpElements.add(element);
	}

	return element;
    }

    public boolean remove(P dElement) {
	if (!(dElement instanceof Persistent)
		|| (dElement instanceof Persistent && ((Persistent) dElement)
			.isPersistent())) {
	    for (P element : this.persistentElements) {
		if (dElement.getURI().equals(element.getURI())) {
		    String filename = mapFileElements.get(element.getURI());
		    File fileToDelete = new File(elementHome, filename);
		    fileToDelete.delete();
		    this.persistentElements.remove(element);
		    return true;
		}
	    }
	} else {
	    for (P element : this.tmpElements) {
		if (dElement.getURI().equals(element.getURI())) {
		    this.tmpElements.remove(element);
		    return true;
		}
	    }
	}
	return false;
    }

    public P getElement(String uri) {
	for (P element : this.tmpElements)
	    if (element.getURI().equals(uri))
		return element;
	for (P element : this.persistentElements)
	    if (element.getURI().equals(uri))
		return element;
	return null;
    }

    public P getElement(P compareElement) {
	for (P element : this.tmpElements)
	    if (compareElement.equals(element))
		return element;
	for (P element : this.persistentElements)
	    if (compareElement.equals(element))
		return element;
	return null;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<P> getElements() {
	ArrayList<P> result = (ArrayList<P>) this.tmpElements.clone();
	for (P element : this.persistentElements)
	    result.add(element);
	return result;
    }
}
