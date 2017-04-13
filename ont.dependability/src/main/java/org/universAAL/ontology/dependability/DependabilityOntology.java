package org.universAAL.ontology.dependability;

/**Copyright [2011-2014] [University of Siegen, Embedded System Instiute]

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.

 * @author <a href="mailto:abu.sadat@uni-siegen.de">Rubaiyat Sadat</a>
 *	       ©2012
 */
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;
//import the factory for this ontology
import org.universAAL.ontology.DependabilityFactory;

/**
 * Dependability Ontology for platform reliability and fault tolerance
 */
public final class DependabilityOntology extends Ontology {

    private static DependabilityFactory factory = new DependabilityFactory();
    public static final String NAMESPACE = "http://ontology.universAAL.org/Dependability.owl#";

    public DependabilityOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("");
	r.setResourceLabel("dependability");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(LocationOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);

	// ******* Declaration of regular classes of the ontology ******* //
	OntClassInfoSetup oci_Symptom = createNewOntClassInfo(Symptom.MY_URI,
		factory, 0);
	OntClassInfoSetup oci_DirectFault = createNewOntClassInfo(
		DirectFault.MY_URI, factory, 1);
	OntClassInfoSetup oci_ErrorDetector = createNewOntClassInfo(
		ErrorDetector.MY_URI, factory, 2);
	OntClassInfoSetup oci_NonParametricFault = createNewOntClassInfo(
		NonParametricFault.MY_URI, factory, 3);
	OntClassInfoSetup oci_SoftwareFault = createNewOntClassInfo(
		SoftwareFault.MY_URI, factory, 4);
	OntClassInfoSetup oci_InteractionFault = createNewOntClassInfo(
		InteractionFault.MY_URI, factory, 5);
	OntClassInfoSetup oci_StructuralFault = createNewOntClassInfo(
		StructuralFault.MY_URI, factory, 6);
	OntClassInfoSetup oci_InternalCauseFault = createNewOntClassInfo(
		InternalCauseFault.MY_URI, factory, 7);
	OntClassInfoSetup oci_PermanentFault = createNewOntClassInfo(
		PermanentFault.MY_URI, factory, 8);
	OntClassInfoSetup oci_IntermittentFault = createNewOntClassInfo(
		IntermittentFault.MY_URI, factory, 9);
	OntClassInfoSetup oci_EarlyTimingFault = createNewOntClassInfo(
		EarlyTimingFault.MY_URI, factory, 10);
	OntClassInfoSetup oci_ContinuedFault = createNewOntClassInfo(
		ContinuedFault.MY_URI, factory, 11);
	OntClassInfoSetup oci_RecoveryAction = createNewOntClassInfo(
		RecoveryAction.MY_URI, factory, 12);
	OntClassInfoSetup oci_Fault = createNewOntClassInfo(Fault.MY_URI,
		factory, 13);
	OntClassInfoSetup oci_ShapeFault = createNewOntClassInfo(
		ShapeFault.MY_URI, factory, 14);
	OntClassInfoSetup oci_ExternalFault = createNewOntClassInfo(
		ExternalFault.MY_URI, factory, 15);
	OntClassInfoSetup oci_Sensor = createNewOntClassInfo(Sensor.MY_URI,
		factory, 16);
	OntClassInfoSetup oci_ParametricFault = createNewOntClassInfo(
		ParametricFault.MY_URI, factory, 17);
	OntClassInfoSetup oci_ValueFault = createNewOntClassInfo(
		ValueFault.MY_URI, factory, 18);
	OntClassInfoSetup oci_OperationalFault = createNewOntClassInfo(
		OperationalFault.MY_URI, factory, 19);
	OntClassInfoSetup oci_PhysicalFault = createNewOntClassInfo(
		PhysicalFault.MY_URI, factory, 20);
	OntClassInfoSetup oci_FCR = createNewOntClassInfo(FCR.MY_URI, factory,
		21);
	OntClassInfoSetup oci_TimingFault = createNewOntClassInfo(
		TimingFault.MY_URI, factory, 22);
	OntClassInfoSetup oci_IndirectFault = createNewOntClassInfo(
		IndirectFault.MY_URI, factory, 23);
	OntClassInfoSetup oci_LateTimingFault = createNewOntClassInfo(
		LateTimingFault.MY_URI, factory, 24);
	OntClassInfoSetup oci_PropertyFault = createNewOntClassInfo(
		PropertyFault.MY_URI, factory, 25);
	OntClassInfoSetup oci_DevelopmentFault = createNewOntClassInfo(
		DevelopmentFault.MY_URI, factory, 26);
	OntClassInfoSetup oci_TransientFault = createNewOntClassInfo(
		TransientFault.MY_URI, factory, 27);
	OntClassInfoSetup oci_NonMaliciousFault = createNewOntClassInfo(
		NonMaliciousFault.MY_URI, factory, 28);

	// ******* Add content to regular classes of the ontology ******* //
	oci_Symptom.setResourceComment("");
	oci_Symptom.setResourceLabel("Symptom");
	oci_Symptom.addSuperClass(ManagedIndividual.MY_URI);
	oci_Symptom.addObjectProperty(Symptom.PROP_ERROR_DETECTOR)
		.setFunctional();
	oci_Symptom
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				Symptom.PROP_ERROR_DETECTOR,
				ErrorDetector.MY_URI, 1, 1));

	oci_DirectFault.setResourceComment("");
	oci_DirectFault.setResourceLabel("DirectFault");
	oci_DirectFault.addSuperClass(Fault.MY_URI);
	oci_ErrorDetector.setResourceComment("");
	oci_ErrorDetector.setResourceLabel("ErrorDetector");
	oci_ErrorDetector.addSuperClass(ManagedIndividual.MY_URI);
	oci_ErrorDetector.addObjectProperty(ErrorDetector.PROP_FAULT)
		.setFunctional();
	oci_ErrorDetector.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ErrorDetector.PROP_FAULT, Fault.MY_URI, 1, 1));

	oci_ErrorDetector.addObjectProperty(ErrorDetector.PROP_SYMPTOM)
		.setFunctional();
	oci_ErrorDetector.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ErrorDetector.PROP_SYMPTOM, Symptom.MY_URI, 1, 1));

	oci_NonParametricFault.setResourceComment("");
	oci_NonParametricFault.setResourceLabel("NonParametricFault");
	oci_NonParametricFault.addSuperClass(Fault.MY_URI);
	oci_SoftwareFault.setResourceComment("");
	oci_SoftwareFault.setResourceLabel("SoftwareFault");
	oci_SoftwareFault.addSuperClass(Fault.MY_URI);
	oci_InteractionFault.setResourceComment("");
	oci_InteractionFault.setResourceLabel("InteractionFault");
	oci_InteractionFault.addSuperClass(OperationalFault.MY_URI);
	oci_StructuralFault.setResourceComment("");
	oci_StructuralFault.setResourceLabel("StructuralFault");
	oci_StructuralFault.addSuperClass(PhysicalFault.MY_URI);
	oci_InternalCauseFault.setResourceComment("");
	oci_InternalCauseFault.setResourceLabel("InternalCauseFault");
	oci_InternalCauseFault.addSuperClass(Fault.MY_URI);
	oci_PermanentFault.setResourceComment("");
	oci_PermanentFault.setResourceLabel("PermanentFault");
	oci_PermanentFault.addSuperClass(Fault.MY_URI);
	oci_IntermittentFault.setResourceComment("");
	oci_IntermittentFault.setResourceLabel("IntermittentFault");
	oci_IntermittentFault.addSuperClass(Fault.MY_URI);
	oci_EarlyTimingFault.setResourceComment("");
	oci_EarlyTimingFault.setResourceLabel("EarlyTimingFault");
	oci_EarlyTimingFault.addSuperClass(TimingFault.MY_URI);
	oci_ContinuedFault.setResourceComment("");
	oci_ContinuedFault.setResourceLabel("ContinuedFault");
	oci_ContinuedFault.addSuperClass(Fault.MY_URI);
	oci_RecoveryAction.setResourceComment("");
	oci_RecoveryAction.setResourceLabel("RecoveryAction");
	oci_RecoveryAction.addSuperClass(ManagedIndividual.MY_URI);
	oci_Fault.setResourceComment("");
	oci_Fault.setResourceLabel("Fault");
	oci_Fault.addSuperClass(ManagedIndividual.MY_URI);
	oci_Fault.addDatatypeProperty(Fault.PROP_LOCATION).setFunctional();
	oci_Fault.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Fault.PROP_LOCATION,
			TypeMapper.getDatatypeURI(String.class), 1, 1));

	oci_Fault.addDatatypeProperty(Fault.PROP_FAULT_DECISION).setFunctional();
	oci_Fault.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Fault.PROP_FAULT_DECISION, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));

	oci_Fault.addDatatypeProperty(Fault.PROP_TIMESTAMP).setFunctional();
	oci_Fault.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Fault.PROP_TIMESTAMP,
			TypeMapper.getDatatypeURI(Long.class), 1, 1));

	oci_ShapeFault.setResourceComment("");
	oci_ShapeFault.setResourceLabel("ShapeFault");
	oci_ShapeFault.addSuperClass(PhysicalFault.MY_URI);
	oci_ExternalFault.setResourceComment("");
	oci_ExternalFault.setResourceLabel("ExternalFault");
	oci_ExternalFault.addSuperClass(OperationalFault.MY_URI);
	oci_Sensor.setResourceComment("");
	oci_Sensor.setResourceLabel("Sensor");
	oci_Sensor.addSuperClass(Device.MY_URI);
	oci_Sensor.addObjectProperty(Sensor.PROP_SYMPTOM).setFunctional();
	oci_Sensor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Sensor.PROP_SYMPTOM,
			Symptom.MY_URI, 1, 1));

	oci_ParametricFault.setResourceComment("");
	oci_ParametricFault.setResourceLabel("ParametricFault");
	oci_ParametricFault.addSuperClass(Fault.MY_URI);
	oci_ValueFault.setResourceComment("");
	oci_ValueFault.setResourceLabel("ValueFault");
	oci_ValueFault.addSuperClass(Fault.MY_URI);
	oci_ValueFault.addSuperClass(SoftwareFault.MY_URI);
	oci_ValueFault.addDatatypeProperty(ValueFault.PROP_VALUE)
		.setFunctional();
	oci_ValueFault.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(ValueFault.PROP_VALUE,
			TypeMapper.getDatatypeURI(Double.class), 1, 1));

	oci_OperationalFault.setResourceComment("");
	oci_OperationalFault.setResourceLabel("OperationalFault");
	oci_OperationalFault.addSuperClass(Fault.MY_URI);
	oci_PhysicalFault.setResourceComment("");
	oci_PhysicalFault.setResourceLabel("PhysicalFault");
	oci_PhysicalFault.addSuperClass(Fault.MY_URI);
	oci_FCR.setResourceComment("");
	oci_FCR.setResourceLabel("FCR");
	oci_FCR.addSuperClass(ManagedIndividual.MY_URI);
	oci_FCR.addDatatypeProperty(FCR.PROP_LOCATION).setFunctional();
	oci_FCR.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(FCR.PROP_LOCATION,
			TypeMapper.getDatatypeURI(String.class), 1, 1));

	oci_FCR.addObjectProperty(FCR.PROP_FAULT).setFunctional();
	oci_FCR.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(FCR.PROP_FAULT,
			Fault.MY_URI, 1, 1));

	oci_TimingFault.setResourceComment("");
	oci_TimingFault.setResourceLabel("TimingFault");
	oci_TimingFault.addSuperClass(Fault.MY_URI);
	oci_TimingFault.addSuperClass(SoftwareFault.MY_URI);
	oci_TimingFault.addDatatypeProperty(TimingFault.PROP_TIME_THRESHOLD)
		.setFunctional();
	oci_TimingFault.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			TimingFault.PROP_TIME_THRESHOLD, TypeMapper
				.getDatatypeURI(Double.class), 1, 1));

	oci_IndirectFault.setResourceComment("");
	oci_IndirectFault.setResourceLabel("IndirectFault");
	oci_IndirectFault.addSuperClass(Fault.MY_URI);
	oci_LateTimingFault.setResourceComment("");
	oci_LateTimingFault.setResourceLabel("LateTimingFault");
	oci_LateTimingFault.addSuperClass(TimingFault.MY_URI);
	oci_PropertyFault.setResourceComment("");
	oci_PropertyFault.setResourceLabel("PropertyFault");
	oci_PropertyFault.addSuperClass(PhysicalFault.MY_URI);
	oci_DevelopmentFault.setResourceComment("");
	oci_DevelopmentFault.setResourceLabel("DevelopmentFault");
	oci_DevelopmentFault.addSuperClass(Fault.MY_URI);
	oci_TransientFault.setResourceComment("");
	oci_TransientFault.setResourceLabel("TransientFault");
	oci_TransientFault.addSuperClass(Fault.MY_URI);
	oci_NonMaliciousFault.setResourceComment("");
	oci_NonMaliciousFault.setResourceLabel("NonMaliciousFault");
	oci_NonMaliciousFault.addSuperClass(Fault.MY_URI);
    }
}
