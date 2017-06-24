/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion
	Avanzadas - Grupo Tecnologias para la Salud y el
	Bienestar (TSB)
	Copyright 2008-2014 Forschungszentrum Informatik FZI, http://www.fzi.de
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
package org.universAAL.ontology.profile;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Ontological representation of a root profile. Methods included in this class
 * are the mandatory ones for representing an ontological concept in Java
 * classes for universAAL. Usually it includes getters and setters for most of its
 * properties.
 *
 * @author Carsten Stockloew
 * @author Alvaro Fides
 * @author Peter Wolf
 */
public abstract class Profile extends ManagedIndividual {

	/** Class URI */
	public static final String MY_URI = ProfileOntology.NAMESPACE + "Profile";

	/** http://ontology.universAAL.org/Profile.owl#hasSubProfile */
	public static final String PROP_HAS_SUB_PROFILE = ProfileOntology.NAMESPACE + "hasSubProfile";

	protected Profile() {
		super();
	}

	public Profile(String uri) {
		super(uri);
	}

	public boolean isWellFormed() {
		return true;
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isClosedCollection(String propURI) {
		return false;
	}

	public SubProfile[] getSubProfile() {
		Object propList = getProperty(PROP_HAS_SUB_PROFILE);
		if (propList instanceof List)
			return (SubProfile[]) ((List) propList).toArray(new SubProfile[0]);
		else if (propList != null)
			return new SubProfile[] { (SubProfile) propList };
		return new SubProfile[0];
	}

	public void addSubProfile(SubProfile newValue) {
		Object propList = getProperty(PROP_HAS_SUB_PROFILE);
		List newList;
		if (propList instanceof List)
			newList = (List) propList;
		else {
			newList = new ArrayList();
			if (propList != null)
				newList.add(propList);
		}
		newList.add(newValue);
		changeProperty(PROP_HAS_SUB_PROFILE, newList);
	}

	public void setSubProfile(SubProfile[] propertyValue) {
		List propList = new ArrayList(propertyValue.length);
		for (int i = 0; i < propertyValue.length; i++) {
			propList.add(propertyValue[i]);
		}
		changeProperty(PROP_HAS_SUB_PROFILE, propList);
	}

}