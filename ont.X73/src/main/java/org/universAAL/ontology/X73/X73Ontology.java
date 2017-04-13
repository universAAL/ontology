/*
     Copyright 2010-2014 AIT Austrian Institute of Technology GmbH
	 http://www.ait.ac.at
     
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

package org.universAAL.ontology.X73;

//import org.universAAL.middleware.owl.BoundingValueRestriction;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.X73Factory;
import org.universAAL.ontology.location.LocationOntology;

import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.service.owl.Service;

//import the factory for this ontology

/**
 * @author AAL Studio: UML2Java transformation
 */
public final class X73Ontology extends Ontology {

    private static X73Factory factory = new X73Factory();
    public static final String NAMESPACE = "http://ontology.universAAL.org/X73.owl#";

    public X73Ontology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("");
	r.setResourceLabel("X73");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(LocationOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);

	// ******* Declaration of regular classes of the ontology ******* //
	OntClassInfoSetup oci_WeighingScale = createNewOntClassInfo(
		WeighingScale.MY_URI, factory, 0);
	OntClassInfoSetup oci_compoundBasicNuValue = createNewOntClassInfo(
		compoundBasicNuValue.MY_URI, factory, 1);
	OntClassInfoSetup oci_BodyWeight = createNewOntClassInfo(
		BodyWeight.MY_URI, factory, 2);
	OntClassInfoSetup oci_MDS = createNewAbstractOntClassInfo(MDS.MY_URI);
	OntClassInfoSetup oci_SystemModel = createNewOntClassInfo(
		SystemModel.MY_URI, factory, 3);
	OntClassInfoSetup oci_BloodPressureSys = createNewOntClassInfo(
		BloodPressureSys.MY_URI, factory, 4);
	OntClassInfoSetup oci_BloodPressureDia = createNewOntClassInfo(
		BloodPressureDia.MY_URI, factory, 5);
	OntClassInfoSetup oci_Pulse = createNewOntClassInfo(Pulse.MY_URI,
		factory, 9);
	OntClassInfoSetup oci_AbsoluteTimeStamp = createNewOntClassInfo(
		AbsoluteTimeStamp.MY_URI, factory, 6);
	OntClassInfoSetup oci_X73 = createNewOntClassInfo(X73.MY_URI, factory,
		7);
	OntClassInfoSetup oci_MDSAttribute = createNewAbstractOntClassInfo(MDSAttribute.MY_URI);
	OntClassInfoSetup oci_BloodPressureMonitor = createNewOntClassInfo(
		BloodPressureMonitor.MY_URI, factory, 8);

	// ******* Add content to regular classes of the ontology ******* //
	oci_WeighingScale.setResourceComment("");
	oci_WeighingScale.setResourceLabel("WeighingScale");
	oci_WeighingScale.addSuperClass(MDS.MY_URI);
	oci_WeighingScale.addDatatypeProperty(
		WeighingScale.PROP_HAS_MEASURED_WEIGHT).setFunctional();
	oci_WeighingScale.addObjectProperty(
		WeighingScale.PROP_HAS_MEASURED_WEIGHT).setFunctional();
	oci_WeighingScale.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			WeighingScale.PROP_HAS_MEASURED_WEIGHT,
			BodyWeight.MY_URI, 1, 1));
	// oci_WeighingScale.addRestriction(MergedRestriction.getCardinalityRestriction(
	// WeighingScale.PROP_HAS_MEASURED_WEIGHT, 1, 1));

	oci_compoundBasicNuValue.setResourceComment("");
	oci_compoundBasicNuValue.setResourceLabel("compoundBasicNuValue");
	oci_compoundBasicNuValue.addSuperClass(ManagedIndividual.MY_URI);
	oci_compoundBasicNuValue.addDatatypeProperty(
		compoundBasicNuValue.PROP_MEASURED_VALUE_18951).setFunctional();
	oci_compoundBasicNuValue.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			compoundBasicNuValue.PROP_MEASURED_VALUE_18951,
			TypeMapper.getDatatypeURI(String.class), 1, 1));

	oci_compoundBasicNuValue.addDatatypeProperty(
		compoundBasicNuValue.PROP_MEASURED_VALUE_18950).setFunctional();
	oci_compoundBasicNuValue.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			compoundBasicNuValue.PROP_MEASURED_VALUE_18950,
			TypeMapper.getDatatypeURI(String.class), 1, 1));

	oci_compoundBasicNuValue.addDatatypeProperty(
		compoundBasicNuValue.PROP_MEASURED_VALUE_18949).setFunctional();
	oci_compoundBasicNuValue.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			compoundBasicNuValue.PROP_MEASURED_VALUE_18949,
			TypeMapper.getDatatypeURI(String.class), 1, 1));

	oci_BodyWeight.setResourceComment("");
	oci_BodyWeight.setResourceLabel("BodyWeight");
	oci_BodyWeight.addSuperClass(MDSAttribute.MY_URI);
	oci_MDS.setResourceComment("");
	oci_MDS.setResourceLabel("MDS");
	oci_MDS.addSuperClass(Device.MY_URI);
	oci_MDS.addDatatypeProperty(MDS.PROP_SYSTEM_ID).setFunctional();
	oci_MDS.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(MDS.PROP_SYSTEM_ID,
			TypeMapper.getDatatypeURI(String.class), 1, 1));

	oci_MDS.addDatatypeProperty(MDS.PROP_SYSTEM_TYPE_SPEC_LIST)
		.setFunctional();
	oci_MDS.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			MDS.PROP_SYSTEM_TYPE_SPEC_LIST, TypeMapper
				.getDatatypeURI(String.class), 0, 1));

	oci_MDS.addObjectProperty(MDS.PROP_SYSTEM_MODEL).setFunctional();
	oci_MDS.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(MDS.PROP_SYSTEM_MODEL,
			SystemModel.MY_URI, 1, 1));

	oci_SystemModel.setResourceComment("");
	oci_SystemModel.setResourceLabel("SystemModel");
	oci_SystemModel.addSuperClass(ManagedIndividual.MY_URI);
	oci_SystemModel.addDatatypeProperty(SystemModel.PROP_MANUFACTURER)
		.setFunctional();
	oci_SystemModel.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SystemModel.PROP_MANUFACTURER, TypeMapper
				.getDatatypeURI(String.class), 1, 1));

	oci_SystemModel.addDatatypeProperty(SystemModel.PROP_MODEL_NUMBER)
		.setFunctional();
	oci_SystemModel.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SystemModel.PROP_MODEL_NUMBER, TypeMapper
				.getDatatypeURI(String.class), 1, 1));

	oci_BloodPressureSys.setResourceComment("");
	oci_BloodPressureSys.setResourceLabel("BloodPressureSys");
	oci_BloodPressureSys.addSuperClass(MDSAttribute.MY_URI);
	oci_BloodPressureDia.setResourceComment("");
	oci_BloodPressureDia.setResourceLabel("BloodPressureDia");
	oci_BloodPressureDia.addSuperClass(MDSAttribute.MY_URI);
	oci_Pulse.setResourceComment("");
	oci_Pulse.setResourceLabel("Pulse");
	oci_Pulse.addSuperClass(MDSAttribute.MY_URI);
	oci_AbsoluteTimeStamp.setResourceComment("");
	oci_AbsoluteTimeStamp.setResourceLabel("AbsoluteTimeStamp");
	oci_AbsoluteTimeStamp.addSuperClass(ManagedIndividual.MY_URI);
	oci_AbsoluteTimeStamp.addDatatypeProperty(AbsoluteTimeStamp.PROP_YEAR)
		.setFunctional();
	oci_AbsoluteTimeStamp.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AbsoluteTimeStamp.PROP_YEAR, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_AbsoluteTimeStamp.addDatatypeProperty(
		AbsoluteTimeStamp.PROP_CENTURY).setFunctional();
	oci_AbsoluteTimeStamp.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AbsoluteTimeStamp.PROP_CENTURY, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci_AbsoluteTimeStamp.addDatatypeProperty(AbsoluteTimeStamp.PROP_MONTH)
		.setFunctional();
	oci_AbsoluteTimeStamp.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AbsoluteTimeStamp.PROP_MONTH, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci_AbsoluteTimeStamp.addDatatypeProperty(AbsoluteTimeStamp.PROP_DAY)
		.setFunctional();
	oci_AbsoluteTimeStamp.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AbsoluteTimeStamp.PROP_DAY, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci_AbsoluteTimeStamp.addDatatypeProperty(AbsoluteTimeStamp.PROP_HOUR)
		.setFunctional();
	oci_AbsoluteTimeStamp.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AbsoluteTimeStamp.PROP_HOUR, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci_AbsoluteTimeStamp
		.addDatatypeProperty(AbsoluteTimeStamp.PROP_MINUTE)
		.setFunctional();
	oci_AbsoluteTimeStamp.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AbsoluteTimeStamp.PROP_MINUTE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci_AbsoluteTimeStamp
		.addDatatypeProperty(AbsoluteTimeStamp.PROP_SECOND)
		.setFunctional();
	oci_AbsoluteTimeStamp.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AbsoluteTimeStamp.PROP_SECOND, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci_AbsoluteTimeStamp.addDatatypeProperty(
		AbsoluteTimeStamp.PROP_SECFRACTIONS).setFunctional();
	oci_AbsoluteTimeStamp.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AbsoluteTimeStamp.PROP_SECFRACTIONS, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	oci_X73.setResourceComment("");
	oci_X73.setResourceLabel("X73");
	oci_X73.addSuperClass(Service.MY_URI);
	oci_X73.addObjectProperty(X73.PROP_CONTROLS).setFunctional();
	oci_X73.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(X73.PROP_CONTROLS,
			MDS.MY_URI, 1, 1));

	oci_MDSAttribute.setResourceComment("");
	oci_MDSAttribute.setResourceLabel("MDSAttribute");
	oci_MDSAttribute.addSuperClass(ManagedIndividual.MY_URI);
	oci_MDSAttribute.addDatatypeProperty(
		MDSAttribute.PROP_BASIC_NU_OBSERVED_VALUE).setFunctional();
	oci_MDSAttribute.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			MDSAttribute.PROP_BASIC_NU_OBSERVED_VALUE, TypeMapper
				.getDatatypeURI(String.class), 0, 1));

	oci_MDSAttribute.addObjectProperty(
		MDSAttribute.PROP_COMPOUND_BASIC_NU_OBSERVED_VALUE)
		.setFunctional();
	oci_MDSAttribute.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			MDSAttribute.PROP_COMPOUND_BASIC_NU_OBSERVED_VALUE,
			compoundBasicNuValue.MY_URI, 0, 1));

	oci_MDSAttribute.addDatatypeProperty(MDSAttribute.PROP_UNIT_CODE)
		.setFunctional();
	oci_MDSAttribute.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			MDSAttribute.PROP_UNIT_CODE, TypeMapper
				.getDatatypeURI(String.class), 1, 1));

	oci_MDSAttribute.addObjectProperty(
		MDSAttribute.PROP_ABSOLUTE_TIME_STAMP).setFunctional();
	oci_MDSAttribute.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			MDSAttribute.PROP_ABSOLUTE_TIME_STAMP,
			AbsoluteTimeStamp.MY_URI, 1, 1));

	oci_BloodPressureMonitor.setResourceComment("");
	oci_BloodPressureMonitor.setResourceLabel("BloodPressureMonitor");
	oci_BloodPressureMonitor.addSuperClass(MDS.MY_URI);
	oci_BloodPressureMonitor.addObjectProperty(
		BloodPressureMonitor.PROP_HAS_MEASURED_B_P_SYS).setFunctional();
	oci_BloodPressureMonitor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BloodPressureMonitor.PROP_HAS_MEASURED_B_P_SYS,
			BloodPressureSys.MY_URI, 1, 1));

	oci_BloodPressureMonitor.addObjectProperty(
		BloodPressureMonitor.PROP_HAS_MEASURED_B_P_DIA).setFunctional();
	oci_BloodPressureMonitor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BloodPressureMonitor.PROP_HAS_MEASURED_B_P_DIA,
			BloodPressureDia.MY_URI, 1, 1));

	oci_BloodPressureMonitor.addObjectProperty(
		BloodPressureMonitor.PROP_HAS_MEASURED_PULSE).setFunctional();
	oci_BloodPressureMonitor.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BloodPressureMonitor.PROP_HAS_MEASURED_PULSE,
			Pulse.MY_URI, 1, 1));

    }
}
