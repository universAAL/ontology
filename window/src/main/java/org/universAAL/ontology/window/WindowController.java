/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung 
	
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

package org.universAAL.ontology.window;

import java.util.Hashtable;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.owl.Restriction;

/**
 * Ontological service that controls a window. Methods included in this class
 * are the mandatory ones for representing an ontological service in Java
 * classes for uAAL.
 * 
 * @author Steeven Zeiss
 * @since 26.11.2009
 * 
 */
public class WindowController extends Service {
    public static final String MY_URI;
    public static final String PROP_CONTROLS;
    private static Hashtable windowServicesRestrictions = new Hashtable(1);
    static {
	MY_URI = Window.WINDOW_NAMESPACE + "WindowServices";
	PROP_CONTROLS = Window.WINDOW_NAMESPACE + "controls";
	register(WindowController.class);
	addRestriction(Restriction.getAllValuesRestriction(PROP_CONTROLS,
		Window.MY_URI), new String[] { PROP_CONTROLS },
		windowServicesRestrictions);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (propURI == null)
	    return null;
	Object r = windowServicesRestrictions.get(propURI);
	if (r instanceof Restriction)
	    return (Restriction) r;
	return Service.getClassRestrictionsOnProperty(propURI);
    }

    public static String getRDFSComment() {
	return "The class of services controling windows.";
    }

    public static String getRDFSLabel() {
	return "WindowServices";
    }

    public WindowController() {
	super();
    }

    public WindowController(String uri) {
	super(uri);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.persona.ontology.Service#getClassLevelRestrictions()
     */
    protected Hashtable getClassLevelRestrictions() {
	return windowServicesRestrictions;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType
     * (java.lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return PROP_CONTROLS.equals(propURI) ? PROP_SERIALIZATION_FULL
		: PROP_SERIALIZATION_OPTIONAL;
    }

    public boolean isWellFormed() {
	return true;
    }
}
