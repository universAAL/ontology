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

package org.universAAL.ontology.weather;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Ontological representation of the concept of tempreature. Currently without
 * unit. Methods included in this class are the mandatory ones for representing
 * an ontological concept in Java classes for uAAL. Usually it includes getters
 * and setters for most of its properties.
 * 
 * @author <a href="mailto:alfiva@itaca.upv.es">Alvaro Fides Valero</a>
 * @author Carsten Stockloew
 */
public class Temperature extends ManagedIndividual {

    public static final String MY_URI;
    public static final String PROP_VALUE;

    static {
	MY_URI = WeatherOntology.NAMESPACE + "Temperature";
	PROP_VALUE = WeatherOntology.NAMESPACE + "value";
    }

    public Temperature() {
	super();
    }

    public Temperature(String uri) {
	super(uri);
    }

    public Temperature(String uri, Integer value) {
	super(uri);
	if (value == null)
	    throw new IllegalArgumentException();

	props.put(PROP_VALUE, value);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public String getValue() {
	return (String) props.get(PROP_VALUE);
    }

    public void setValue(Integer value) {
	if (value != null)
	    props.put(PROP_VALUE, value);
    }

    /** @see org.universAAL.middleware.owl.Resource#getPropSerializationType(java.lang.String) */
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;

    }

    /** @org.universAAL.middleware.owl.Resource#isWellFormed() */
    public boolean isWellFormed() {
	return props.containsKey(PROP_VALUE);
    }
}
