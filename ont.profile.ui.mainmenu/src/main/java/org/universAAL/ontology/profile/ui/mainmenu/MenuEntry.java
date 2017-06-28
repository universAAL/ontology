/*
	Copyright 2007-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
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
package org.universAAL.ontology.profile.ui.mainmenu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.UnmodifiableResourceList;

public class MenuEntry extends ManagedIndividual {

	public static final String MY_URI = MenuProfileOntology.NAMESPACE + "MenuEntry";
	public static final String PROP_VENDOR = MenuProfileOntology.NAMESPACE + "hasVendor";
	public static final String PROP_SERVICE_CLASS = MenuProfileOntology.NAMESPACE + "hasServiceClass";
	public static final String PROP_PATH = MenuProfileOntology.NAMESPACE + "hasPath";

	public MenuEntry(String uri) {
		super(uri);
	}

	/** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return Resource.PROP_SERIALIZATION_FULL;
	}

	public Resource getVendor() {
		return (Resource) getProperty(PROP_VENDOR);
	}

	public void setVendor(Resource vendor) {
		if (vendor != null)
			setProperty(PROP_VENDOR, vendor);
	}

	public Resource getServiceClass() {
		return (Resource) getProperty(PROP_SERVICE_CLASS);
	}

	public void setServiceClass(Resource serviceClass) {
		if (serviceClass != null)
			setProperty(PROP_SERVICE_CLASS, serviceClass);
	}

	public List getPath() {
		Object o = getProperty(PROP_PATH);
		if (o == null)
			return new ArrayList();
		if (o instanceof List)
			return new UnmodifiableResourceList((List) o);
		if (o instanceof Resource) {
			ArrayList al = new ArrayList();
			al.add((Resource) o);
			return new UnmodifiableResourceList(al);
		}
		return null;
	}

	/**
	 * Set the path for this menu entry in the main menu. The path is a list of
	 * {@link Resource}s. Each Resource corresponds to a subfolder, the last
	 * element in the list is the name of the menu entry (the name of the
	 * application). Each Resource should have a non-anonymous URI that can be
	 * used to find translations of this folder/menu entry name in different
	 * languages. A default language can be set as label of the Resource.
	 *
	 * @param path
	 */
	public void setPath(Resource[] path) {
		if (path == null || path.length == 0)
			return;
		List l = new ArrayList();
		Collections.addAll(l, path);
		setProperty(PROP_PATH, l);
	}

	public boolean isEquivalent(MenuEntry e) {
		if (e == null)
			return false;

		if (!testEquivalent(getVendor(), e.getVendor()))
			return false;
		if (!testEquivalent(getServiceClass(), e.getServiceClass()))
			return false;
		return true;
	}

	private boolean testEquivalent(Object o1, Object o2) {
		if (o1 == null) {
			if (o2 != null)
				return false;
		} else {
			if (o2 == null)
				return false;
			else if (!o1.equals(o2))
				return false;
		}
		return true;
	}
}
