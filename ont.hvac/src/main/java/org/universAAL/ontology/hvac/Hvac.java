/*******************************************************************************
 * Copyright 2015 UPM - Universidad Politécnica de Madrid
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
package org.universAAL.ontology.hvac;

import org.universAAL.middleware.owl.supply.LevelRating;
import org.universAAL.middleware.*;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.device.DeviceOntology;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.measurement.Measurement;
import org.universAAL.ontology.measurement.MeasurementOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.HvacFactory;
import org.universAAL.ontology.device.*;
import org.universAAL.ontology.unit.*;

/**
 * @author Ricardo
 * Description: Hvac means Heather,Ventilation and Air Conditioning systems,
 * in this class are defined the different properties that can find in any hvac system
 */
public class Hvac extends Device {

    public static final String MY_URI = HvacOntology.NAMESPACE + "Hvac";
    
    public static final String PROP_HAS_FAN = HvacOntology.NAMESPACE + "hasFan";

    public static final String PROP_HAS_LEVEL = HvacOntology.NAMESPACE + "hasLevel";

    public static final String PROP_HAS_MODE = HvacOntology.NAMESPACE + "hasMode";

    public static final String PROP_HAS_STATUSVALUE = DeviceOntology.NAMESPACE + "hasStatusValue";

    public static final String PROP_HAS_SWING = HvacOntology.NAMESPACE + "hasSwing";
    
    public static final String PROP_HAS_TEMPERATURE = HvacOntology.NAMESPACE + "hasTemperature";

    
    public static final String PROP_HAS_TIMER = HvacOntology.NAMESPACE + "hasTimer";
    
    public static final String PROP_HAS_UNITS = HvacOntology.NAMESPACE + "hasUnits";

 


    public Hvac() {
	super();
    }

    public Hvac(String uri) {
	super(uri);
    }

    public Hvac(String uriPrefix, int numProps) {
	super(uriPrefix, numProps);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

}



