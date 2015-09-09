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
import org.universAAL.middleware.owl.ManagedIndividual;
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
		OntClassInfoSetup oci_ScriptRecommendation = createNewAbstractOntClassInfo(
				ScriptedRecommendation.MY_URI);
		OntClassInfoSetup oci_Layout = createNewAbstractOntClassInfo(Layout.MY_URI);
		OntClassInfoSetup oci_Alignment = createNewAbstractOntClassInfo(
				Alignment.MY_URI);
		OntClassInfoSetup oci_SizeUnit =  createNewAbstractOntClassInfo(SizeUnit.MY_URI);
		OntClassInfoSetup oci_Size = createNewAbstractOntClassInfo(Size.MY_URI);
		
		// ******* Declaration of regular classes of the ontology ******* //
		OntClassInfoSetup oci_VerticalLayout = createNewOntClassInfo(
				VerticalLayout.MY_URI, factory, 0);
		OntClassInfoSetup oci_HorizontalLayout = createNewOntClassInfo(
				HorizontalLayout.MY_URI, factory, 1);
		OntClassInfoSetup oci_HorizontalAlignment = createNewOntClassInfo(
				HorizontalAlignment.MY_URI, factory, 2);
		OntClassInfoSetup oci_GridLayout = createNewOntClassInfo(
				GridLayout.MY_URI, factory, 3);
		OntClassInfoSetup oci_VerticalAlignment = createNewOntClassInfo(
				VerticalAlignment.MY_URI, factory, 4);
		OntClassInfoSetup oci_maxSize = createNewOntClassInfo(
				MaximumSize.MY_URI, factory, 5);
		OntClassInfoSetup oci_minSize = createNewOntClassInfo(
				MinimumSize.MY_URI, factory, 6);
		OntClassInfoSetup oci_prefSize = createNewOntClassInfo(
				PreferredSize.MY_URI, factory, 7);
		OntClassInfoSetup oci_CSS = createNewOntClassInfo(
				CSSRecommendation.MY_URI, factory,8);
		
		// ******* Add content to regular classes of the ontology ******* //
		
		oci_SizeUnit.setResourceComment("Size units");
		oci_SizeUnit.setResourceLabel("SizeUnit");
		oci_SizeUnit.addSuperClass(ManagedIndividual.MY_URI);
		oci_SizeUnit.toEnumeration(
				new ManagedIndividual[]{
						SizeUnit.absolute,
						SizeUnit.screenRelative,
						SizeUnit.ParentRelative,
						});
		
		oci_VerticalLayout.setResourceComment("Vertical ordering of elements");
		oci_VerticalLayout.setResourceLabel("VerticalLayout");
		oci_VerticalLayout.addSuperClass(Layout.MY_URI);

		oci_HorizontalLayout.setResourceComment("Horizontal ordering of elements");
		oci_HorizontalLayout.setResourceLabel("HorizontalLayout");
		oci_HorizontalLayout.addSuperClass(Layout.MY_URI);

		oci_Size.setResourceComment("Size of elements");
		oci_Size.setResourceLabel("Size");
		oci_Size.addSuperClass(VisualRecommendation.MY_URI);
		oci_Size.addDatatypeProperty(Size.PROP_HORIZONTAL);
		oci_Size.addDatatypeProperty(Size.PROP_VERTICAL);
		oci_Size.addObjectProperty(Size.PROP_SIZE_UNIT);
		oci_Size.addRestriction(
				MergedRestriction.getAllValuesRestrictionWithCardinality(Size.PROP_HORIZONTAL, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci_Size.addRestriction(
				MergedRestriction.getAllValuesRestrictionWithCardinality(Size.PROP_VERTICAL, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci_Size.addRestriction(
				MergedRestriction.getAllValuesRestrictionWithCardinality(Size.PROP_SIZE_UNIT, SizeUnit.MY_URI, 1, 1));
		
		oci_maxSize.setResourceComment("Maximum Size of the element");
		oci_maxSize.setResourceLabel("MaximumSize");
		oci_maxSize.addSuperClass(Size.MY_URI);
		
		oci_minSize.setResourceComment("Minimum Size of the element");
		oci_minSize.setResourceLabel("MinimumSize");
		oci_minSize.addSuperClass(Size.MY_URI);
		
		oci_prefSize.setResourceComment("Preferred Size of the element");
		oci_prefSize.setResourceLabel("PreferredSize");
		oci_prefSize.addSuperClass(Size.MY_URI);
		
		oci_HorizontalAlignment.setResourceComment("Horizontal position to respect of the freespace");
		oci_HorizontalAlignment.setResourceLabel("HorizontalAlignment");
		oci_HorizontalAlignment.addSuperClass(Alignment.MY_URI);

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

		oci_ScriptRecommendation.setResourceComment("Generic Web recomendation.");
		oci_ScriptRecommendation.setResourceLabel("WebRecommendation");
		oci_ScriptRecommendation.addSuperClass(Recommendation.MY_URI);
		oci_ScriptRecommendation.addDatatypeProperty(ScriptedRecommendation.PROP_LANGUAJE);
		oci_ScriptRecommendation.addRestriction(
				MergedRestriction.getAllValuesRestrictionWithCardinality(
						ScriptedRecommendation.PROP_LANGUAJE, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci_ScriptRecommendation.addDatatypeProperty(ScriptedRecommendation.PROP_CONTENT);
		oci_ScriptRecommendation.addRestriction(
				MergedRestriction.getAllValuesRestrictionWithCardinality(
						ScriptedRecommendation.PROP_CONTENT, TypeMapper.getDatatypeURI(String.class), 1, 1));
		
		oci_CSS.setResourceComment("CSS description recommendation");
		oci_CSS.setResourceLabel("CSSRecommendation");
		oci_CSS.addSuperClass(ScriptedRecommendation.MY_URI);
		oci_CSS.addRestriction(MergedRestriction.getFixedValueRestriction(
				CSSRecommendation.PROP_LANGUAJE, CSSRecommendation.CSS_LANG));


		oci_VerticalAlignment.setResourceComment("version position to respect of freespace");
		oci_VerticalAlignment.setResourceLabel("VerticalAlignment");
		oci_VerticalAlignment.addSuperClass(Alignment.MY_URI);

		oci_Layout.setResourceComment("Generic Layout Recomendation");
		oci_Layout.setResourceLabel("Layout");
		oci_Layout.addSuperClass(VisualRecommendation.MY_URI);

		oci_VisualRecommendation.setResourceComment("Generic Visual Recomendation");
		oci_VisualRecommendation.setResourceLabel("VisualRecommendation");
		oci_VisualRecommendation.addSuperClass(Recommendation.MY_URI);

		oci_Alignment.setResourceComment("Alignment of elements");
		oci_Alignment.setResourceLabel("Alignment");
		oci_Alignment.addSuperClass(VisualRecommendation.MY_URI);
		
		//instances
		
		VerticalAlignment.top = new VerticalAlignment(VerticalAlignment.INST_TOP);
		oci_VerticalAlignment.addInstance(VerticalAlignment.top);
		VerticalAlignment.middle = new VerticalAlignment(VerticalAlignment.INST_MIDDLE);
		oci_VerticalAlignment.addInstance(VerticalAlignment.middle);
		VerticalAlignment.bottom = new VerticalAlignment(VerticalAlignment.INST_BOTTOM);
		oci_VerticalAlignment.addInstance(VerticalAlignment.bottom);
		
		HorizontalAlignment.left = new HorizontalAlignment(HorizontalAlignment.INST_LEFT);
		oci_HorizontalAlignment.addInstance(HorizontalAlignment.left);
		HorizontalAlignment.center = new HorizontalAlignment(HorizontalAlignment.INST_CENTER);
		oci_HorizontalAlignment.addInstance(HorizontalAlignment.center);
		HorizontalAlignment.right = new HorizontalAlignment(HorizontalAlignment.INST_RIGHT);
		oci_HorizontalAlignment.addInstance(HorizontalAlignment.right);
		
	}
}
