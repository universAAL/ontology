/*
	Copyright 2008-2010 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB) 
	
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
package org.universAAL.ontology.device.wearable;

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.Sensor;
import org.universAAL.ontology.profile.User;

/**
 * Ontological representation of a wearable fall detector. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author <a href="mailto:alfiva@itaca.upv.es">Alvaro Fides Valero</a>
 * 
 */
public class FallDetector extends Sensor {
    public static final String MY_URI;
    public static final String PROP_WORN_BY;

    static {
	MY_URI = Device.uAAL_DEVICE_NAMESPACE + "FallDetector";
	PROP_WORN_BY = Device.uAAL_DEVICE_NAMESPACE + "wornBy";
	register(FallDetector.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_MEASURED_VALUE.equals(propURI))
	    return Restriction.getAllValuesRestriction(propURI, TypeMapper
		    .getDatatypeURI(Boolean.class));
	if (PROP_WORN_BY.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    User.MY_URI, 1, 1);
	return Sensor.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Device.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 1];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i] = PROP_WORN_BY;
	return toReturn;
    }

    public FallDetector() {
    }

    public FallDetector(String uri) {
	super(uri);
    }

    public static String getRDFSComment() {
	return "A Fall Detector Device";
    }

    public static String getRDFSLabel() {
	return "Fall Detector";
    }

    public boolean isWellFormed() {
	return true;
    }

    public User getWornBy() {
	return (User) props.get(PROP_WORN_BY);
    }

    public void setWorndBy(User value) {
	props.put(PROP_WORN_BY, value);
    }

    public boolean getMeasuredvalue() {
	return ((Boolean) props.get(PROP_MEASURED_VALUE)).booleanValue();
    }

    public void setMeasuredValue(boolean value) {
	props.put(PROP_MEASURED_VALUE, new Boolean(value));
    }

}
