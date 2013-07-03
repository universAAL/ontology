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

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

public class BloodPressureMonitor extends MDS {
    public static final String MY_URI = X73Ontology.NAMESPACE
	    + "BloodPressureMonitor";
    public static final String PROP_HAS_MEASURED_B_P_SYS = X73Ontology.NAMESPACE
	    + "hasMeasuredBPSys";
    public static final String PROP_HAS_MEASURED_B_P_DIA = X73Ontology.NAMESPACE
	    + "hasMeasuredBPDia";
    public static final String PROP_HAS_MEASURED_PULSE = X73Ontology.NAMESPACE
	    + "hasMeasuredPulse";

    public BloodPressureMonitor() {
	super();
    }

    public BloodPressureMonitor(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_HAS_MEASURED_B_P_SYS.equals(propURI)
		|| PROP_HAS_MEASURED_B_P_DIA.equals(propURI)
		|| PROP_HAS_MEASURED_PULSE.equals(propURI) ? PROP_SERIALIZATION_FULL
		: super.getPropSerializationType(propURI);
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_HAS_MEASURED_B_P_SYS)
		&& hasProperty(PROP_HAS_MEASURED_B_P_DIA)
		&& hasProperty(PROP_HAS_MEASURED_PULSE);
    }

    public BloodPressureSys getHasMeasuredBPSys() {
	return (BloodPressureSys) getProperty(PROP_HAS_MEASURED_B_P_SYS);
    }

    public void setHasMeasuredBPSys(BloodPressureSys newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_HAS_MEASURED_B_P_SYS, newPropValue);
    }

    public BloodPressureDia getHasMeasuredBPDia() {
	return (BloodPressureDia) getProperty(PROP_HAS_MEASURED_B_P_DIA);
    }

    public void setHasMeasuredBPDia(BloodPressureDia newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_HAS_MEASURED_B_P_DIA, newPropValue);
    }

    public BloodPressureDia getHasMeasuredPulse() {
	return (BloodPressureDia) getProperty(PROP_HAS_MEASURED_PULSE);
    }

    public void setHasMeasuredPulse(Pulse newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_HAS_MEASURED_PULSE, newPropValue);
    }
}
