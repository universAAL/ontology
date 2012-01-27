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
package org.universAAL.ontology.risk;

import org.universAAL.ontology.RiskOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.profilable.User;

/**
 * Ontological representation of a panic button device. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author <a href="mailto:alfiva@itaca.upv.es">Alvaro Fides Valero</a>
 * 
 */
public class PanicButton extends Device {
    public static final String MY_URI=RiskOntology.NAMESPACE + "PanicButton";
    public static final String PROP_ACTIVATED=RiskOntology.NAMESPACE + "activated";
    public static final String PROP_PRESSED_BY=RiskOntology.NAMESPACE + "pressedBy";

    public PanicButton() {
    }

    public PanicButton(String uri) {
	super(uri);
    }
    
    public String getClassURI() {
	return MY_URI;
    }

    public boolean isWellFormed() {
	return true;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean getActivated() {
	return ((Boolean) props.get(PROP_ACTIVATED)).booleanValue();
    }

    public void setActivated(boolean value) {
	props.put(PROP_ACTIVATED, new Boolean(value));
    }

    public User getPressedBy() {
	return (User) props.get(PROP_PRESSED_BY);
    }

    public void setPressedBy(User value) {
	props.put(PROP_PRESSED_BY, value);
    }

}
