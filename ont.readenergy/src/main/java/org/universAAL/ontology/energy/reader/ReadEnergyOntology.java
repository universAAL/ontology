/*
	Copyright 2011-2012 TSB, http://www.tsbtecnologias.es
	TSB - Tecnologías para la Salud y el Bienestar
	
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
package org.universAAL.ontology.energy.reader;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.ReadEnergyFactory;

public class ReadEnergyOntology extends Ontology{

	private static ReadEnergyFactory factory = new ReadEnergyFactory();	
	public static final String NAMESPACE = "http://ontology.universAAL.org/EnergyReader.owl#";
	
	public ReadEnergyOntology(String ontURI) {
		super(ontURI);
	}

	public ReadEnergyOntology() {
		super(NAMESPACE);	
	}

	public void create() {
		
		Resource r = getInfo();

		r.setResourceComment("Ontology for Aalfficiency Service and related concepts.");
		r.setResourceLabel("AAL Energy Efficiency Service");
		addImport(NAMESPACE);
		
		OntClassInfoSetup oci;
		
		//EnergyReaderDevice
		oci = createNewOntClassInfo(ReadEnergyDevice.MY_URI,factory,factory.EnergyReaderDevice);
		oci.setResourceComment("Device able to meassure energy consumption");
		oci.setResourceLabel("EnergyReaderDevice");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(ReadEnergyDevice.PROP_HAS_NAME).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ReadEnergyDevice.PROP_HAS_NAME, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci.addDatatypeProperty(ReadEnergyDevice.PROP_HAS_PLACE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ReadEnergyDevice.PROP_HAS_PLACE, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci.addDatatypeProperty(ReadEnergyDevice.PROP_HAS_TYPE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(ReadEnergyDevice.PROP_HAS_TYPE, TypeMapper.getDatatypeURI(String.class), 1, 1));
		
		//EnergyMeassurement
		oci = createNewOntClassInfo(EnergyMeasurement.MY_URI,factory,factory.EnergyReaderMeassurement);
		oci.setResourceComment("Instant consumption of the device");
		oci.setResourceLabel("EnergyReaderMEassurement");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addDatatypeProperty(EnergyMeasurement.PROP_HAS_VALUE).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(EnergyMeasurement.PROP_HAS_VALUE, TypeMapper.getDatatypeURI(Integer.class), 1, 1));
		oci.addDatatypeProperty(EnergyMeasurement.PROP_HAS_UNIT).setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(EnergyMeasurement.PROP_HAS_UNIT, TypeMapper.getDatatypeURI(String.class), 1, 1));
		
		//EnergyReader
		oci = createNewOntClassInfo(ReadEnergy.MY_URI, factory, factory.EnergyReader);
		oci.setResourceComment("The main ontology that gets the instant consumption of a energy reader device");
		oci.setResourceLabel("Energy Reader Service");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.addObjectProperty(ReadEnergy.PROP_HAS_DEVICE);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(ReadEnergy.PROP_HAS_DEVICE,ReadEnergyDevice.MY_URI));
		oci.addObjectProperty(ReadEnergy.PROP_HAS_MEASUREMENT);
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(ReadEnergy.PROP_HAS_MEASUREMENT,EnergyMeasurement.MY_URI));

	}

}
