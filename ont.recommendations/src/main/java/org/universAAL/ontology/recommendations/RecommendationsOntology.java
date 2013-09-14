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
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
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
		r.setResourceComment("Appearance Recomendations Ontology.");
		r.setResourceLabel("recommendations");
		addImport(DataRepOntology.NAMESPACE);
		addImport(UIBusOntology.NAMESPACE);

		// Abstract classes
		OntClassInfoSetup oci_VisualRecommendation = createNewAbstractOntClassInfo(
				VisualRecommendation.MY_URI);
		OntClassInfoSetup oci_AuditoryRecommendation = createNewAbstractOntClassInfo(
				AuditoryRecommendation.MY_URI);
		OntClassInfoSetup oci_WebRecommendation = createNewAbstractOntClassInfo(
				WebRecommendation.MY_URI);
		OntClassInfoSetup oci_Layout = createNewAbstractOntClassInfo(Layout.MY_URI);
		OntClassInfoSetup oci_Text = createNewAbstractOntClassInfo(Text.MY_URI);
		OntClassInfoSetup oci_Alignment = createNewAbstractOntClassInfo(
				Alignment.MY_URI);
		
		
		// ******* Declaration of regular classes of the ontology ******* //
		OntClassInfoSetup oci_VerticalLayout = createNewOntClassInfo(
				VerticalLayout.MY_URI, factory, 0);
		
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
		
		OntClassInfoSetup oci_VerticalAlignment = createNewOntClassInfo(
				VerticalAlignment.MY_URI, factory, 10);
		OntClassInfoSetup oci_TextSize = createNewOntClassInfo(TextSize.MY_URI,
				factory, 11);
		
		
		OntClassInfoSetup oci_TextAlignment = createNewOntClassInfo(
				TextAlignment.MY_URI, factory, 14);
		
		

		// ******* Add content to regular classes of the ontology ******* //
		oci_VerticalLayout.setResourceComment("Vertical ordering of elements");
		oci_VerticalLayout.setResourceLabel("VerticalLayout");
		oci_VerticalLayout.addSuperClass(Layout.MY_URI);

		oci_Text.setResourceComment("Text related Recommendations");
		oci_Text.setResourceLabel("Text");
		oci_Text.addSuperClass(VisualRecommendation.MY_URI);

		oci_HorizontalLayout.setResourceComment("Horizontal ordering of elements");
		oci_HorizontalLayout.setResourceLabel("HorizontalLayout");
		oci_HorizontalLayout.addSuperClass(Layout.MY_URI);

		oci_Size.setResourceComment("Size of elements");
		oci_Size.setResourceLabel("Size");
		oci_Size.addSuperClass(VisualRecommendation.MY_URI);

		oci_FillParent.setResourceComment("Relative size to the freespace for the element");
		oci_FillParent.setResourceLabel("FillParent");
		oci_FillParent.addSuperClass(VisualRecommendation.MY_URI);

		oci_HorizontalAlignment.setResourceComment("Horizontal position to respect of the freespace");
		oci_HorizontalAlignment.setResourceLabel("HorizontalAlignment");
		oci_HorizontalAlignment.addSuperClass(Alignment.MY_URI);

		oci_Font.setResourceComment("Font recommedation");
		oci_Font.setResourceLabel("Font");
		oci_Font.addSuperClass(Text.MY_URI);

		oci_GridLayout.setResourceComment("Arrange in a grid or array fashion");
		oci_GridLayout.setResourceLabel("GridLayout");
		oci_GridLayout.addSuperClass(Layout.MY_URI);
		oci_GridLayout.addDatatypeProperty(GridLayout.PROP_NUMBER_OF_COLUMNS);
		oci_GridLayout.addRestriction(
				MergedRestriction.getAllValuesRestrictionWithCardinality(
						GridLayout.PROP_NUMBER_OF_COLUMNS, TypeMapper.getDatatypeURI(Integer.class), 0, 1));
		oci_GridLayout.addDatatypeProperty(GridLayout.PROP_NUMBER_OF_ROWS);
		oci_GridLayout.addRestriction(
				MergedRestriction.getAllValuesRestrictionWithCardinality(
						GridLayout.PROP_NUMBER_OF_ROWS, TypeMapper.getDatatypeURI(Integer.class), 0, 1));

		oci_WebRecommendation.setResourceComment("Generic Web recomendation.");
		oci_WebRecommendation.setResourceLabel("WebRecommendation");
		oci_WebRecommendation.addSuperClass(Recommendation.MY_URI);

		oci_VerticalAlignment.setResourceComment("version position to respect of freespace");
		oci_VerticalAlignment.setResourceLabel("VerticalAlignment");
		oci_VerticalAlignment.addSuperClass(Alignment.MY_URI);

		oci_TextSize.setResourceComment("Text size modification");
		oci_TextSize.setResourceLabel("TextSize");
		oci_TextSize.addSuperClass(Text.MY_URI);
		oci_TextSize.addDatatypeProperty(TextSize.PROP_RELATIVE_SIZE);
		oci_TextSize.addRestriction(
				MergedRestriction.getAllValuesRestrictionWithCardinality(
						TextSize.PROP_RELATIVE_SIZE, TypeMapper.getDatatypeURI(Integer.class), 0, 1));

		oci_Layout.setResourceComment("Generic Layout Recomendation");
		oci_Layout.setResourceLabel("Layout");
		oci_Layout.addSuperClass(VisualRecommendation.MY_URI);

		oci_VisualRecommendation.setResourceComment("Generic Visual Recomendation");
		oci_VisualRecommendation.setResourceLabel("VisualRecommendation");
		oci_VisualRecommendation.addSuperClass(Recommendation.MY_URI);

		oci_TextAlignment.setResourceComment("Text positioning");
		oci_TextAlignment.setResourceLabel("TextAlignment");
		oci_TextAlignment.addSuperClass(Text.MY_URI);

		oci_Alignment.setResourceComment("Alignment of elements");
		oci_Alignment.setResourceLabel("Alignment");
		oci_Alignment.addSuperClass(VisualRecommendation.MY_URI);

		oci_AuditoryRecommendation.setResourceComment("Generic auditory recomendation");
		oci_AuditoryRecommendation.setResourceLabel("AuditoryRecommendation");
		oci_AuditoryRecommendation.addSuperClass(Recommendation.MY_URI);
		
		//instances
		FillParent.verticallly = new FillParent(FillParent.INST_VERTICAL);
		FillParent.horizontally = new FillParent(FillParent.INST_HORIZONTAL);
		oci_FillParent.addInstance(FillParent.verticallly);
		oci_FillParent.addInstance(FillParent.verticallly);
		
		VerticalAlignment.top = new VerticalAlignment(VerticalAlignment.INST_TOP);
		oci_VerticalAlignment.addInstance(VerticalAlignment.top);
		VerticalAlignment.middle = new VerticalAlignment(VerticalAlignment.INST_MIDDLE);
		oci_VerticalAlignment.addInstance(VerticalAlignment.middle);
		VerticalAlignment.bottom = new VerticalAlignment(VerticalAlignment.INST_BOTTOM);
		oci_VerticalAlignment.addInstance(VerticalAlignment.bottom);
		
		HorizontalAlignment.left = new VerticalAlignment(HorizontalAlignment.INST_LEFT);
		oci_HorizontalAlignment.addInstance(HorizontalAlignment.left);
		HorizontalAlignment.center = new VerticalAlignment(HorizontalAlignment.INST_CENTER);
		oci_HorizontalAlignment.addInstance(HorizontalAlignment.center);
		HorizontalAlignment.right = new VerticalAlignment(HorizontalAlignment.INST_RIGHT);
		oci_HorizontalAlignment.addInstance(HorizontalAlignment.right);
		
	}
}
