/*******************************************************************************
 * Copyright 2013 Universidad PolitĂ©cnica de Madrid
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
package org.universAAL.ontology.recommendations;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.ui.owl.Recommendation;
import org.universAAL.middleware.ui.owl.UIBusOntology;
import org.universAAL.ontology.RecommendationsFactory;

/**
 * This class provides the main representation of the recommendations ontology
 * for the universAAL platform.
 * 
 */
public final class RecommendationsOntology extends Ontology {

	private static RecommendationsFactory factory = new RecommendationsFactory();
	public static final String NAMESPACE = "http://ontology.universAAL.org/Recommendations#";

	public RecommendationsOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("");
		r.setResourceLabel("recommendations");
		addImport(DataRepOntology.NAMESPACE);
		addImport(UIBusOntology.NAMESPACE);

		// TODO: Add any additionally imported ontologies here

		// ******* Declaration of regular classes of the ontology ******* //
		OntClassInfoSetup oci_VerticalLayout = createNewOntClassInfo(
				VerticalLayout.MY_URI, factory, 0);
		OntClassInfoSetup oci_Text = createNewOntClassInfo(Text.MY_URI,
				factory, 1);
		OntClassInfoSetup oci_HorizontalLayout = createNewOntClassInfo(
				HorizontalLayout.MY_URI, factory, 2);
		OntClassInfoSetup oci_Size = createNewOntClassInfo(Size.MY_URI,
				factory, 3);
		OntClassInfoSetup oci_FillParent = createNewOntClassInfo(
				FillParent.MY_URI, factory, 4);
		OntClassInfoSetup oci_HorizontalAlignment = createNewOntClassInfo(
				HorizontalAlignment.MY_URI, factory, 5);
		OntClassInfoSetup oci_Font = createNewOntClassInfo(Font.MY_URI,
				factory, 6);
		OntClassInfoSetup oci_GridLayout = createNewOntClassInfo(
				GridLayout.MY_URI, factory, 7);
		OntClassInfoSetup oci_WebRecommendation = createNewOntClassInfo(
				WebRecommendation.MY_URI, factory, 8);
		OntClassInfoSetup oci_VerticalAlignment = createNewOntClassInfo(
				VerticalAlignment.MY_URI, factory, 10);
		OntClassInfoSetup oci_TextSize = createNewOntClassInfo(TextSize.MY_URI,
				factory, 11);
		OntClassInfoSetup oci_Layout = createNewOntClassInfo(Layout.MY_URI,
				factory, 12);
		OntClassInfoSetup oci_VisualRecommendation = createNewOntClassInfo(
				VisualRecommendation.MY_URI, factory, 13);
		OntClassInfoSetup oci_TextAlignment = createNewOntClassInfo(
				TextAlignment.MY_URI, factory, 14);
		OntClassInfoSetup oci_Alignment = createNewOntClassInfo(
				Alignment.MY_URI, factory, 15);
		OntClassInfoSetup oci_AuditoryRecommendation = createNewOntClassInfo(
				AuditoryRecommendation.MY_URI, factory, 16);

		// ******* Add content to regular classes of the ontology ******* //
		oci_VerticalLayout.setResourceComment("");
		oci_VerticalLayout.setResourceLabel("VerticalLayout");
		oci_VerticalLayout.addSuperClass(Layout.MY_URI);

		oci_Text.setResourceComment("");
		oci_Text.setResourceLabel("Text");
		oci_Text.addSuperClass(VisualRecommendation.MY_URI);

		oci_HorizontalLayout.setResourceComment("");
		oci_HorizontalLayout.setResourceLabel("HorizontalLayout");
		oci_HorizontalLayout.addSuperClass(Layout.MY_URI);

		oci_Size.setResourceComment("");
		oci_Size.setResourceLabel("Size");
		oci_Size.addSuperClass(VisualRecommendation.MY_URI);

		oci_FillParent.setResourceComment("");
		oci_FillParent.setResourceLabel("FillParent");
		oci_FillParent.addSuperClass(VisualRecommendation.MY_URI);

		oci_HorizontalAlignment.setResourceComment("");
		oci_HorizontalAlignment.setResourceLabel("HorizontalAlignment");
		oci_HorizontalAlignment.addSuperClass(Alignment.MY_URI);

		oci_Font.setResourceComment("");
		oci_Font.setResourceLabel("Font");
		oci_Font.addSuperClass(Text.MY_URI);

		oci_GridLayout.setResourceComment("");
		oci_GridLayout.setResourceLabel("GridLayout");
		oci_GridLayout.addSuperClass(Layout.MY_URI);

		oci_WebRecommendation.setResourceComment("");
		oci_WebRecommendation.setResourceLabel("WebRecommendation");
		oci_WebRecommendation.addSuperClass(Recommendation.MY_URI);

		oci_VerticalAlignment.setResourceComment("");
		oci_VerticalAlignment.setResourceLabel("VerticalAlignment");
		oci_VerticalAlignment.addSuperClass(Alignment.MY_URI);

		oci_TextSize.setResourceComment("");
		oci_TextSize.setResourceLabel("TextSize");
		oci_TextSize.addSuperClass(Text.MY_URI);

		oci_Layout.setResourceComment("");
		oci_Layout.setResourceLabel("Layout");
		oci_Layout.addSuperClass(VisualRecommendation.MY_URI);

		oci_VisualRecommendation.setResourceComment("");
		oci_VisualRecommendation.setResourceLabel("VisualRecommendation");
		oci_VisualRecommendation.addSuperClass(Recommendation.MY_URI);

		oci_TextAlignment.setResourceComment("");
		oci_TextAlignment.setResourceLabel("TextAlignment");
		oci_TextAlignment.addSuperClass(Text.MY_URI);

		oci_Alignment.setResourceComment("");
		oci_Alignment.setResourceLabel("Alignment");
		oci_Alignment.addSuperClass(VisualRecommendation.MY_URI);

		oci_AuditoryRecommendation.setResourceComment("");
		oci_AuditoryRecommendation.setResourceLabel("AuditoryRecommendation");
		oci_AuditoryRecommendation.addSuperClass(Recommendation.MY_URI);

	}
}
