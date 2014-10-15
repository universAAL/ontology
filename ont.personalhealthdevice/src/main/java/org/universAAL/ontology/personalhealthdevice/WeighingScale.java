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

package org.universAAL.ontology.personalhealthdevice;

import org.universAAL.ontology.measurement.Measurement;
import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of a weighing scale.
 * 
 * @author Thomas Fuxreiter (foex@gmx.at)
 */
public class WeighingScale extends Device {

    public static final String MY_URI = PersonalHealthDeviceOntology.NAMESPACE
	    + "WeighingScale";

    public static final String PROP_HAS_MEASURED_WEIGHT = PersonalHealthDeviceOntology.NAMESPACE
	    + "hasMeasuredWeight";

    public WeighingScale() {
	super();
    }

    public WeighingScale(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public void setMeasuredWeight(Measurement m) {
	props.put(PROP_HAS_MEASURED_WEIGHT, m);
    }

    public Measurement getMeasuredWeight() {
	return ((Measurement) props.get(PROP_HAS_MEASURED_WEIGHT));
    }

}
