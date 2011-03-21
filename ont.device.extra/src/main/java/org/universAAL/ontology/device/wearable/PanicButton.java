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
import org.universAAL.ontology.profile.User;

/**
 * @author <a href="mailto:alfiva@itaca.upv.es">Alvaro Fides Valero</a>
 * 
 */
public class PanicButton extends Device {
    public static final String MY_URI;
    public static final String PROP_ACTIVATED;
    public static final String PROP_PRESSED_BY;

    static {
	MY_URI = Device.uAAL_DEVICE_NAMESPACE + "PanicButton";
	PROP_ACTIVATED = Device.uAAL_DEVICE_NAMESPACE + "activated";
	PROP_PRESSED_BY = Device.uAAL_DEVICE_NAMESPACE + "pressedBy";
	register(PanicButton.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_ACTIVATED.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Boolean.class), 1, 1);
	if (PROP_PRESSED_BY.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    User.MY_URI, 1, 1);
	return Device.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Device.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 2];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i++] = PROP_ACTIVATED;
	toReturn[i] = PROP_PRESSED_BY;
	return toReturn;
    }

    public PanicButton() {
    }

    public PanicButton(String uri) {
	super(uri);
    }

    public static String getRDFSComment() {
	return "A Panic Button Device";
    }

    public static String getRDFSLabel() {
	return "Panic Button";
    }

    public int getPropSerializationType(String propURI) {
	return PROP_PRESSED_BY.equals(propURI) ? PROP_SERIALIZATION_REDUCED
		: PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true;
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
