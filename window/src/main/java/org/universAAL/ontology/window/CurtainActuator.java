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
package org.universAAL.ontology.window;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.OrderingRestriction;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.phThing.DimmerActuator;
import org.universAAL.ontology.phThing.Sensor;

/**
 * Ontological representation of an actuator that can open and close a curtain.
 * Methods included in this class are the mandatory ones for representing an
 * ontological concept in Java classes for uAAL. Usually it includes getters and
 * setters for most of its properties.
 * 
 * @author <a href="mailto:alfiva@itaca.upv.es">Alvaro Fides Valero</a>
 * 
 */
public class CurtainActuator extends DimmerActuator {
    public static final String MY_URI;
    public static final String PROP_IN_WINDOW;

    static {
	MY_URI = WindowActuator.WINDOW_NAMESPACE + "CurtainActuator";
	PROP_IN_WINDOW = WindowActuator.WINDOW_NAMESPACE + "inWindow";
	register(CurtainActuator.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_DIMMABLE_STATUS.equals(propURI))
	    return OrderingRestriction.newOrderingRestriction(new Integer(100),
		    new Integer(0), true, true, Restriction
			    .getAllValuesRestrictionWithCardinality(propURI,
				    TypeMapper.getDatatypeURI(Integer.class),
				    1, 1));
	if (PROP_IN_WINDOW.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    WindowActuator.MY_URI, 1, 0);
	return Sensor.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = ManagedIndividual.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 1];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i] = PROP_IN_WINDOW;
	return toReturn;
    }

    public CurtainActuator() {
    }

    public CurtainActuator(String uri) {
	super(uri);
    }

    public static String getRDFSComment() {
	return "A Curtain Dimmable Actuator";
    }

    public static String getRDFSLabel() {
	return "Curtain Actuator";
    }

    public boolean isWellFormed() {
	return true;
    }

}
