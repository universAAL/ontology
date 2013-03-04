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
package org.universAAL.ontology.phThing;

/**
 * Ontological representation of any actuator that has a range of values from 0
 * to 100%. Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for uAAL. Usually it
 * includes getters and setters for most of its properties.
 * 
 * @author <a href="mailto:alfiva@itaca.upv.es">Alvaro Fides Valero</a>
 * 
 */
public class DimmerActuator extends Actuator {

    public static final String MY_URI = Device.uAAL_DEVICE_NAMESPACE
	    + "DimmerActuator";

    public static final String PROP_DIMMABLE_STATUS = Device.uAAL_DEVICE_NAMESPACE
	    + "DimmableStatus";

    public DimmerActuator() {
    }

    public DimmerActuator(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true;
    }

    public int getDimmableStatus() {
	Integer i = (Integer) props.get(PROP_DIMMABLE_STATUS);
	return (i == null) ? -1 : i.intValue();
    }

    public void setDimmableStatus(int percentage) {
	if (percentage > -1 && percentage < 101)
	    props.put(PROP_DIMMABLE_STATUS, new Integer(percentage));
    }
}