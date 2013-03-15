/*******************************************************************************
 * Copyright 2012 Universidad Politécnica de Madrid
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.measurement;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.ontology.MeasurementFactory;
import org.universAAL.ontology.unit.Prefix;
import org.universAAL.ontology.unit.Unit;
import org.universAAL.ontology.unit.UnitOntology;

/**
 * @author AAL Studio: UML2Java transformation
 */
public final class MeasurementOntology extends Ontology {

    private static MeasurementFactory factory = new MeasurementFactory();
    public static final String NAMESPACE = "http://ontology.universaal.org/Measurement.owl#";

    public MeasurementOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("");
	r.setResourceLabel("owl");
	addImport(DataRepOntology.NAMESPACE);
	addImport(UnitOntology.NAMESPACE);

	// ******* Declaration of regular classes of the ontology ******* //
	OntClassInfoSetup oci_MeanSquareError = createNewOntClassInfo(
		MeanSquareError.MY_URI, factory, 0);
	OntClassInfoSetup oci_MeasurementError = createNewAbstractOntClassInfo(MeasurementError.MY_URI);
	OntClassInfoSetup oci_Measurement = createNewOntClassInfo(
		Measurement.MY_URI, factory, 1);

	// ******* Add content to regular classes of the ontology ******* //
	oci_MeanSquareError.setResourceComment("");
	oci_MeanSquareError.setResourceLabel("MeanSquareError");
	oci_MeanSquareError.addSuperClass(MeasurementError.MY_URI);

	oci_MeasurementError.setResourceComment("");
	oci_MeasurementError.setResourceLabel("MeasurementError");
	oci_MeasurementError.addSuperClass(Measurement.MY_URI);

	oci_Measurement.setResourceComment("");
	oci_Measurement.setResourceLabel("Measurement");
	oci_Measurement.addSuperClass(ManagedIndividual.MY_URI);
	oci_Measurement.addObjectProperty(Measurement.PROP_HAS_ERROR)
		.setFunctional();
	oci_Measurement.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Measurement.PROP_HAS_ERROR, MeasurementError.MY_URI, 0,
			1));

	oci_Measurement.addObjectProperty(Measurement.PROP_HAS_UNIT)
		.setFunctional();
	oci_Measurement.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Measurement.PROP_HAS_UNIT, Unit.MY_URI, 1, 1));

	oci_Measurement.addObjectProperty(Measurement.PROP_HAS_PREFIX)
		.setFunctional();
	oci_Measurement.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Measurement.PROP_HAS_PREFIX, Prefix.MY_URI, 0, 1));

	oci_Measurement.addDatatypeProperty(Measurement.PROP_VALUE)
		.setFunctional();
	oci_Measurement.addRestriction(MergedRestriction
		.getCardinalityRestriction(Measurement.PROP_VALUE, 1, 1));

    }
}
