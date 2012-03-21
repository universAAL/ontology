/*
 Copyright 2008-2011 ITACA-TSB, http://www.tsb.upv.es
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

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.phThing.Device;

/**
 * Ontological service that controls any HW device. Methods
 * included in this class are the mandatory ones for representing an ontological
 * service in Java classes for uAAL.
 * 
 * @author alfiva
 */
public class DeviceService extends Service {
    public static final String MY_URI = Device.uAAL_DEVICE_NAMESPACE
	    + "DeviceService";
    public static final String PROP_CONTROLS = Device.uAAL_DEVICE_NAMESPACE
	    + "controls";


    public DeviceService(String uri) {
	super(uri);
    }

    public DeviceService() {
	super();
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_CONTROLS.equals(propURI) ? PROP_SERIALIZATION_FULL
		: PROP_SERIALIZATION_OPTIONAL;
    }

    public boolean isWellFormed() {
	return true;
    }
}
