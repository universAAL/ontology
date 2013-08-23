/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 *	
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *	
 * http://www.apache.org/licenses/LICENSE-2.0
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.handgestures;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.HandgesturesFactory;
import org.universAAL.ontology.location.LocationOntology;

/**
 * 
 * @author eandgrg
 * 
 */
public final class HandgesturesOntology extends Ontology {

    private static HandgesturesFactory factory = new HandgesturesFactory();
    public static final String NAMESPACE = "http://ontology.universaal.org/HandGestures.owl#";

    public HandgesturesOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("Ontology that describes different hand gestures");
	r.setResourceLabel("handgestures");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(LocationOntology.NAMESPACE);

	// ******* Declaration of enumeration classes of the ontology ******* //

	OntClassInfoSetup oci_HandGestureType = createNewAbstractOntClassInfo(HandGestureType.MY_URI);

	// ******* Declaration of regular classes of the ontology ******* //
	OntClassInfoSetup oci_HandGestures = createNewOntClassInfo(
		HandGestures.MY_URI, factory, 0);
	OntClassInfoSetup oci_HandGestureService = createNewOntClassInfo(
		HandGestureService.MY_URI, factory, 1);

	// ******* Add content to enumeration classes of the ontology ******* //

	oci_HandGestureType.setResourceComment("");
	oci_HandGestureType.setResourceLabel("HandGestureType");
	oci_HandGestureType.toEnumeration(new ManagedIndividual[] {
		HandGestureType.rightHandSwipeRight,
		HandGestureType.rightHandSwipeLeft,
		HandGestureType.leftHandSwipeRight,
		HandGestureType.leftHandSwipeLeft,
		HandGestureType.twoHandsZoomIn,
		HandGestureType.twoHandsZoomOut, HandGestureType.rightHandWave,
		HandGestureType.leftHandWave,
		HandGestureType.rightHandPullDown,
		HandGestureType.rightHandPushUp,
		HandGestureType.leftHandPullDown,
		HandGestureType.leftHandPushUp,
		HandGestureType.bothHandsPullDown,
		HandGestureType.bothHandsPushUp });

	// ******* Add content to regular classes of the ontology ******* //
	oci_HandGestures.setResourceComment("");
	oci_HandGestures.setResourceLabel("HandGestures");
	oci_HandGestures.addSuperClass(ManagedIndividual.MY_URI);
	oci_HandGestures.addDatatypeProperty(HandGestures.PROP_USER)
		.setFunctional();
	oci_HandGestures.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(HandGestures.PROP_USER,
			TypeMapper.getDatatypeURI(String.class), 1, 1));

	oci_HandGestures.addDatatypeProperty(HandGestures.PROP_TIMESTAMP)
		.setFunctional();
	oci_HandGestures.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HandGestures.PROP_TIMESTAMP, TypeMapper
				.getDatatypeURI(String.class), 1, 1));

	oci_HandGestures.addObjectProperty(HandGestures.PROP_GESTURE_TYPE)
		.setFunctional();
	oci_HandGestures.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HandGestures.PROP_GESTURE_TYPE, HandGestureType.MY_URI,
			1, 1));

	oci_HandGestureService.setResourceComment("");
	oci_HandGestureService.setResourceLabel("HandGestureService");
	oci_HandGestureService.addSuperClass(Service.MY_URI);
	oci_HandGestureService.addDatatypeProperty(
		HandGestureService.PROP_PROP_CONTROLS).setFunctional();
	oci_HandGestureService.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HandGestureService.PROP_PROP_CONTROLS, TypeMapper
				.getDatatypeURI(String.class), 1, 1));

    }
}
