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
package org.universAAL.ontology.water;

import org.universAAL.ontology.phThing.Sensor;

/**
 * Ontological representation of a detector of water floods. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author <a href="mailto:alfiva@itaca.upv.es">Alvaro Fides Valero</a>
 * @author Carsten Stockloew
 */
public class WaterFloodDetector extends Sensor {

    public static final String MY_URI = WaterOntology.NAMESPACE
	    + "WaterFloodDetector";

    public WaterFloodDetector() {
    }

    public WaterFloodDetector(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public boolean getMeasuredvalue() {
	return ((Boolean) props.get(PROP_MEASURED_VALUE)).booleanValue();
    }

    public void setMeasuredValue(boolean value) {
	props.put(PROP_MEASURED_VALUE, new Boolean(value));
    }
}
