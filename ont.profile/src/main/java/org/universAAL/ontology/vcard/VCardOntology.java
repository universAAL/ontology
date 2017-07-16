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
package org.universAAL.ontology.vcard;

import javax.xml.datatype.XMLGregorianCalendar;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.VCardFactory;

public class VCardOntology extends Ontology {

	private static VCardFactory factory = new VCardFactory();
	public static final String NAMESPACE = "http://www.w3.org/2006/vcard/ns#";
	public static final int TEL = 1;
	public static final int EMAIL = 2;
	public static final int BBSCOMM = 3;
	public static final int CAR = 4;
	public static final int CELL = 5;
	public static final int FAX = 6;
	public static final int ISDNCOMM = 7;
	public static final int MODEM = 8;
	public static final int MSG = 9;
	public static final int PAGER = 10;
	public static final int PCSCOMM = 11;
	public static final int VIDEO = 12;
	public static final int VOICE = 13;
	public static final int INET = 14;
	public static final int X400MAIL = 15;
	public static final int NAME = 16;
	public static final int ORG = 17;
	public static final int VCARD = 18;

	public VCardOntology(String ontURI) {
		super(ontURI);
		Resource r = getInfo();
		r.setResourceComment("This ontology models and represents vCards in RDF using current best practices.");
		r.setResourceLabel("An Ontology for vCards");

		addImport(DataRepOntology.NAMESPACE);
	}

	public VCardOntology() {
		super(NAMESPACE);
		Resource r = getInfo();
		r.setResourceComment("This ontology models and represents vCards in RDF using current best practices.");
		r.setResourceLabel("An Ontology for vCards");

		addImport(DataRepOntology.NAMESPACE);
	}

	public void create() {

		OntClassInfoSetup oci;

		// Tel
		oci = createNewOntClassInfo(Tel.MY_URI, factory, TEL);
		oci.setResourceComment("Resources that are vCard Telephony communication mechanisms");
		oci.setResourceLabel("Telephone");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(Tel.PROP_VALUE);

		// Email
		oci = createNewOntClassInfo(Email.MY_URI, factory, EMAIL);
		oci.setResourceComment("Resources that are vCard Email Addresses");
		oci.setResourceLabel("Email");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(Email.PROP_VALUE);

		// BBS
		oci = createNewOntClassInfo(BBS.MY_URI, factory, BBSCOMM);
		oci.setResourceComment("Bulletin Board System Communications");
		oci.setResourceLabel("Bulletin Board System");
		oci.addSuperClass(Tel.MY_URI);

		// Car
		oci = createNewOntClassInfo(Car.MY_URI, factory, CAR);
		oci.setResourceComment("Car Telephone");
		oci.setResourceLabel("Care Telephone");
		oci.addSuperClass(Tel.MY_URI);

		// Cell
		oci = createNewOntClassInfo(Cell.MY_URI, factory, CELL);
		oci.setResourceComment("Cellular or Mobile Telephone");
		oci.setResourceLabel("Cellular Telephone");
		oci.addSuperClass(Tel.MY_URI);

		// Fax
		oci = createNewOntClassInfo(Fax.MY_URI, factory, FAX);
		oci.setResourceComment("Fax Communications");
		oci.setResourceLabel("Fax");
		oci.addSuperClass(Tel.MY_URI);

		// ISDN
		oci = createNewOntClassInfo(ISDN.MY_URI, factory, ISDNCOMM);
		oci.setResourceComment("ISDN Communications");
		oci.setResourceLabel("ISDN");
		oci.addSuperClass(Tel.MY_URI);

		// Modem
		oci = createNewOntClassInfo(Modem.MY_URI, factory, MODEM);
		oci.setResourceComment("Modem Communications");
		oci.setResourceLabel("Modem");
		oci.addSuperClass(Tel.MY_URI);

		// Msg
		oci = createNewOntClassInfo(Msg.MY_URI, factory, MSG);
		oci.setResourceComment("Voice Message Communications");
		oci.setResourceLabel("Voice Message");
		oci.addSuperClass(Tel.MY_URI);

		// Pager
		oci = createNewOntClassInfo(Pager.MY_URI, factory, PAGER);
		oci.setResourceComment("Pager Communications");
		oci.setResourceLabel("Pager Device");
		oci.addSuperClass(Tel.MY_URI);

		// PCS
		oci = createNewOntClassInfo(PCS.MY_URI, factory, PCSCOMM);
		oci.setResourceComment("Personal Communications Service");
		oci.setResourceLabel("Persona Communications");
		oci.addSuperClass(Tel.MY_URI);

		// Video
		oci = createNewOntClassInfo(Video.MY_URI, factory, VIDEO);
		oci.setResourceComment("Video Communications");
		oci.setResourceLabel("Video");
		oci.addSuperClass(Tel.MY_URI);

		// Voice
		oci = createNewOntClassInfo(Voice.MY_URI, factory, VOICE);
		oci.setResourceComment("Voice Communications");
		oci.setResourceLabel("Voice");
		oci.addSuperClass(Tel.MY_URI);

		// Internet
		oci = createNewOntClassInfo(Internet.MY_URI, factory, INET);
		oci.setResourceComment("Internet Email");
		oci.setResourceLabel("Internet");
		oci.addSuperClass(Email.MY_URI);

		// X400
		oci = createNewOntClassInfo(X400.MY_URI, factory, X400MAIL);
		oci.setResourceComment("X.400 Email");
		oci.setResourceLabel("X.400");
		oci.addSuperClass(Email.MY_URI);

		// Name
		oci = createNewOntClassInfo(Name.MY_URI, factory, NAME);
		oci.setResourceComment("Resources that are vCard personal names");
		oci.setResourceLabel("Name");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(Name.PROP_ADDITIONAL_NAME);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				Name.PROP_ADDITIONAL_NAME,
				TypeMapper.getDatatypeURI(String.class)));
		oci.addDatatypeProperty(Name.PROP_FAMILY_NAME);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				Name.PROP_FAMILY_NAME, TypeMapper.getDatatypeURI(String.class)));
		oci.addDatatypeProperty(Name.PROP_GIVEN_NAME);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				Name.PROP_GIVEN_NAME, TypeMapper.getDatatypeURI(String.class)));
		oci.addDatatypeProperty(Name.PROP_HONORIFIC_PREFIX);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				Name.PROP_HONORIFIC_PREFIX,
				TypeMapper.getDatatypeURI(String.class)));
		oci.addDatatypeProperty(Name.PROP_HONORIFIC_SUFFIX);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				Name.PROP_HONORIFIC_SUFFIX,
				TypeMapper.getDatatypeURI(String.class)));

		// Organization
		oci = createNewOntClassInfo(Organization.MY_URI, factory, ORG);
		oci.setResourceComment("Resources that are vCard organizations");
		oci.setResourceLabel("Organization");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(Organization.PROP_ORGANIZATION_NAME);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				Organization.PROP_ORGANIZATION_NAME,
				TypeMapper.getDatatypeURI(String.class)));
		oci.addDatatypeProperty(Organization.PROP_ORGANIZATION_UNIT);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				Organization.PROP_ORGANIZATION_UNIT,
				TypeMapper.getDatatypeURI(String.class)));

		// VCard
		oci = createNewOntClassInfo(VCard.MY_URI, factory, VCARD);
		oci.setResourceComment("Resources that are vCards and the URIs that denote "
				+ "these vCards can also be the same URIs that denote "
				+ "people/orgs");
		oci.setResourceLabel("vCard");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(VCard.PROP_BDAY).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(VCard.PROP_BDAY,
						TypeMapper.getDatatypeURI(XMLGregorianCalendar.class),
						1, 1));
		oci.addObjectProperty(VCard.PROP_EMAIL);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				VCard.PROP_EMAIL, Email.MY_URI));
		oci.addDatatypeProperty(VCard.PROP_FN).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(VCard.PROP_FN,
						TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci.addObjectProperty(VCard.PROP_N).setFunctional();
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(VCard.PROP_N,
						Name.MY_URI, 1, 1));
		oci.addObjectProperty(VCard.PROP_ORG);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				VCard.PROP_ORG, Organization.MY_URI));
		oci.addObjectProperty(VCard.PROP_PHOTO);
		oci.addObjectProperty(VCard.PROP_TEL);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(
				VCard.PROP_TEL, Tel.MY_URI));
		oci.addObjectProperty(VCard.PROP_URL);

	}

}
