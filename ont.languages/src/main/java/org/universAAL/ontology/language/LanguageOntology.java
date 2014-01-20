/*******************************************************************************
 * Copyright 2013 Universidad Politécnica de Madrid
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.language;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.Normalizer;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.LanguageFactory;

/**
 * @author amedrano
 * @author eandgrg
 * 
 */
public final class LanguageOntology extends Ontology {

    public static final String LANG_TABLE = "org/universAAL/ontology/impl/lang-table.dat";
    private static LanguageFactory factory;
    public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX + "Language.owl#";

    public LanguageOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("Ontology for languages based on ISO 639 codes (http://en.wikipedia.org/wiki/List_of_ISO_639-1_codes)");
	r.setResourceLabel("language");
	addImport(DataRepOntology.NAMESPACE);

	// ******* Declaration of regular classes of the ontology ******* //
	OntClassInfoSetup oci_Language = createNewAbstractOntClassInfo(Language.MY_URI);

	// ******* Add content to regular classes of the ontology ******* //
	oci_Language.setResourceComment("The concept for Language");
	oci_Language.setResourceLabel("Language");
	oci_Language.addSuperClass(ManagedIndividual.MY_URI);
	oci_Language.addObjectProperty(Language.PROP_ENGLISH_LABEL)
		.setFunctional();
	oci_Language.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Language.PROP_ENGLISH_LABEL, TypeMapper
				.getDatatypeURI(String.class), 1, 1));

	oci_Language.addObjectProperty(Language.PROP_ISO639CODE)
		.setFunctional();
	oci_Language.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Language.PROP_ISO639CODE, TypeMapper
				.getDatatypeURI(String.class), 1, 1));

	oci_Language.addObjectProperty(Language.PROP_NATIVE_LABEL)
		.setFunctional();
	oci_Language.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Language.PROP_NATIVE_LABEL, TypeMapper
				.getDatatypeURI(String.class), 1, 1));

	// ******* LOAD ALL Languages ******** //

	URL tableURL = getClass().getClassLoader().getResource(LANG_TABLE);
	factory = new LanguageFactory(tableURL);
	if (tableURL != null) {
	    try {
		BufferedReader br = new BufferedReader(new InputStreamReader(
			tableURL.openStream(), Charset.forName("UTF-8")));
		int line = 0;
		String ll;
		while ((ll = br.readLine()) != null) {
		    if (line != 0) {
			String name = ll.split("\\|")[1];
			OntClassInfoSetup lang = createNewOntClassInfo(
				NAMESPACE + getURIFromLabel(name), factory, line);
			lang.addSuperClass(Language.MY_URI);
			lang.setResourceLabel(name);
		    }
		    line++;
		}
		br.close();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}

    }
    
    static String getURIFromLabel(String english){
    	String name = english.split(",")[0];
		name = name.split(" ")[0];
		name = Normalizer
        .normalize(name, Normalizer.Form.NFD)
        .replaceAll("[^\\p{ASCII}]", "");
		name =  name.substring(0, 1).toUpperCase() + name.substring(1);
		return name;
    }
}
