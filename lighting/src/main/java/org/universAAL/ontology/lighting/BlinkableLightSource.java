/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung 
	
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

package org.universAAL.ontology.lighting;

import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.location.Location;
import org.universAAL.middleware.owl.Restriction;

/**
 * @author mtazari
 * 
 */
public class BlinkableLightSource extends LightSource implements Blinkable {
    public static final String MY_URI;
    static {
	MY_URI = LightSource.LIGHTING_NAMESPACE + "BlinkableLightSource";
	register(Blinkable.class);
	register(BlinkableLightSource.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (Blinkable.PROP_BLINKING_STATE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Boolean.class), 1, 1);
	return LightSource.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = LightSource.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 1];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i] = PROP_BLINKING_STATE;
	return toReturn;
    }

    public static String getRDFSComment() {
	return "The class of blinkable light sources.";
    }

    public static String getRDFSLabel() {
	return "Blinkable Light Source";
    }

    public BlinkableLightSource() {
	super();
    }

    public BlinkableLightSource(String uri) {
	super(uri);
    }

    public BlinkableLightSource(String uri, LightType type, Location loc) {
	super(uri, type, loc);
	props.put(Blinkable.PROP_BLINKING_STATE, new Boolean(false));
    }

    /*
     * (non-Javadoc)
     * 
     * @see Blinkable#isBlinking()
     */
    public boolean isBlinking() {
	return ((Boolean) props.get(Blinkable.PROP_BLINKING_STATE))
		.booleanValue();
    }

    public boolean isWellFormed() {
	return props.containsKey(Blinkable.PROP_BLINKING_STATE)
		&& super.isWellFormed();
    }

    /*
     * (non-Javadoc)
     * 
     * @see Blinkable#setBlinkingState(boolean)
     */
    public void setBlinkingState(boolean state) {
	props.put(Blinkable.PROP_BLINKING_STATE, new Boolean(state));
    }
}
