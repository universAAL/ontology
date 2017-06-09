/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	
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

public class HWSubProfile extends SubProfile {

	public static final String MY_URI = ProfileOntology.NAMESPACE + "HWSubProfile";

	public static final String PROP_HW_CATEGORY = ProfileOntology.NAMESPACE + "hasHWCategory";
	public static final String PROP_HW_DESCRIPTION = ProfileOntology.NAMESPACE + "hasHWDescription";
	public static final String PROP_HW_PICTURE_URL = ProfileOntology.NAMESPACE + "hasHWPicture";
	public static final String PROP_HW_PROPERTIES = ProfileOntology.NAMESPACE + "hasHWProperties";
	public static final String PROP_HW_IDENTIFIER = ProfileOntology.NAMESPACE + "hasHWIdentifier";
	public static final String PROP_HW_MANUFACTURER = ProfileOntology.NAMESPACE + "hasHWManufacturer";
	public static final String PROP_HW_NAME = ProfileOntology.NAMESPACE + "isHWName";
	public static final String PROP_HW_RELATED_DEVICES = ProfileOntology.NAMESPACE + "hasRelatedDevices";

	protected HWSubProfile() {
		super();
	}

	public HWSubProfile(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public boolean isWellFormed() {
		return true;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}
}
