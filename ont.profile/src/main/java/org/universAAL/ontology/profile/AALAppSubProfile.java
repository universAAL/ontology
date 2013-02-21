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


public class AALAppSubProfile extends SubProfile {

    public static final String MY_URI = ProfileOntology.NAMESPACE
	    + "AALAppSubProfile";

    public static final String PROP_ARTIFACT_FILE_URL = ProfileOntology.NAMESPACE
	    + "hasArtifactFileID";
    public static final String PROP_ARTIFACT_ID = ProfileOntology.NAMESPACE
	    + "hasArtifactID";
    public static final String PROP_ARTIFACT_DESCRIPTION = ProfileOntology.NAMESPACE
	    + "hasArtifactDescription";
    public static final String PROP_DEVELOPER_USER_ID = ProfileOntology.NAMESPACE
	    + "hasDeveloperUserID";
    public static final String PROP_ARTIFACT_GROUP_ID = ProfileOntology.NAMESPACE
	    + "hasArtifactGroupID";
    public static final String PROP_HARDWARE_REQUIREMENTS = ProfileOntology.NAMESPACE
	    + "hasHardwareRequirements";
    public static final String PROP_IS_FREE = ProfileOntology.NAMESPACE
	    + "isFree";
    public static final String PROP_SOFTWARE_LICENSE = ProfileOntology.NAMESPACE
	    + "hasSoftwareLicense";
    public static final String PROP_MAVEN_DESCRIPTOR = ProfileOntology.NAMESPACE
	    + "hasMavenDescriptor";
    public static final String PROP_SOFTWARE_REQUIREMENTS = ProfileOntology.NAMESPACE
	    + "hasSoftwareRequirements";
    public static final String PROP_ARTIFACT_VERSION = ProfileOntology.NAMESPACE
	    + "hasArtifactVersion";
    public static final String PROP_APP_PROPERTIES = ProfileOntology.NAMESPACE
	    + "hasAppProperties";
    public static final String PROP_REALIZED_ONTOLOGIES = ProfileOntology.NAMESPACE
	    + "hasRealizedOntologies";

    protected AALAppSubProfile() {
	super();
    }

    public AALAppSubProfile(String uri) {
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
