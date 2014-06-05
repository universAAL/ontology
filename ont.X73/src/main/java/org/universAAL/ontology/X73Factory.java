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

package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.X73.AbsoluteTimeStamp;
import org.universAAL.ontology.X73.BloodPressureDia;
import org.universAAL.ontology.X73.BloodPressureMonitor;
import org.universAAL.ontology.X73.BloodPressureSys;
import org.universAAL.ontology.X73.BodyWeight;
import org.universAAL.ontology.X73.Pulse;
import org.universAAL.ontology.X73.SystemModel;
import org.universAAL.ontology.X73.WeighingScale;
import org.universAAL.ontology.X73.X73;
import org.universAAL.ontology.X73.compoundBasicNuValue;

public class X73Factory implements ResourceFactory {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {
	case 0:
	    return new WeighingScale(instanceURI);
	case 1:
	    return new compoundBasicNuValue(instanceURI);
	case 2:
	    return new BodyWeight(instanceURI);
	case 3:
	    return new SystemModel(instanceURI);
	case 4:
	    return new BloodPressureSys(instanceURI);
	case 5:
	    return new BloodPressureDia(instanceURI);
	case 6:
	    return new AbsoluteTimeStamp(instanceURI);
	case 7:
	    return new X73(instanceURI);
	case 8:
	    return new BloodPressureMonitor(instanceURI);
	case 9:
	    return new Pulse(instanceURI);

	}
	return null;
    }
}
