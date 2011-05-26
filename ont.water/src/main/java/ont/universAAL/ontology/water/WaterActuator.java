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
package ont.universAAL.ontology.water;

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.OnOffActuator;

/**
 * Ontological representation of an actuator that can open and/or close the flow
 * of water through a pipe. Methods included in this class are the mandatory
 * ones for representing an ontological concept in Java classes for uAAL.
 * Usually it includes getters and setters for most of its properties.
 * 
 * @author <a href="mailto:alfiva@itaca.upv.es">Alvaro Fides Valero</a>
 * 
 */
public class WaterActuator extends OnOffActuator {
    public static final String MY_URI;

    static {
	MY_URI = Device.uAAL_DEVICE_NAMESPACE + "WaterActuator";
	register(WaterActuator.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_STATUS.equals(propURI))
	    return Restriction.getAllValuesRestriction(propURI, TypeMapper
		    .getDatatypeURI(Boolean.class));
	return OnOffActuator.getClassRestrictionsOnProperty(propURI);
    }

    public WaterActuator() {
    }

    public WaterActuator(String uri) {
	super(uri);
    }

    public static String getRDFSComment() {
	return "A Water Flow Actuator";
    }

    public static String getRDFSLabel() {
	return "Water Actuator";
    }

    public boolean isWellFormed() {
	return true;
    }

}
