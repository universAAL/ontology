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

/**
 * Ontology class representing an AAL Service Profile
 *
 * @author Peter Wolf
 * @author Alvaro Fides
 */

public class AALServiceProfile extends Profile {

	/** Class URI */
	public static final String MY_URI = ProfileOntology.NAMESPACE + "AALServiceProfile";
	public static final String PROP_APPLICATION_SUBPROFILE = ProfileOntology.NAMESPACE + "hasApplicationSubprofile";
	public static final String PROP_CERTIFICATE = ProfileOntology.NAMESPACE + "hasCertificate";
	public static final String PROP_CHARGING_MODEL = ProfileOntology.NAMESPACE + "hasChargingModel";
	public static final String PROP_HARDWARE_SUBPROFILE = ProfileOntology.NAMESPACE + "hasHarwareSubprofile";
	public static final String PROP_DESCRIPTION = ProfileOntology.NAMESPACE + "hasServiceDescription";
	public static final String PROP_HUMAN_RESOURCE_SUBPROFILE = ProfileOntology.NAMESPACE
			+ "hasHumanResourceSubprofile";
	public static final String PROP_PAYMENT_MODEL = ProfileOntology.NAMESPACE + "hasPaymentModel";
	public static final String PROP_HOST = ProfileOntology.NAMESPACE + "HasHost";
	public static final String PROP_PRICE = ProfileOntology.NAMESPACE + "hasPrice";
	public static final String PROP_SERVICE_PROVIDER_ID = ProfileOntology.NAMESPACE + "hasServiceProviderID";
	public static final String PROP_SLA = ProfileOntology.NAMESPACE + "hasServiceLevelAgreement";
	public static final String PROP_SERVICE_OWNER = ProfileOntology.NAMESPACE + "serviceOwnedBy";

	protected AALServiceProfile() {
		super();
	}

	public AALServiceProfile(String uri) {
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
