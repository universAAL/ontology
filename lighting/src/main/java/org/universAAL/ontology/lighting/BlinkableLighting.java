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

import java.util.Hashtable;

import org.universAAL.middleware.owl.Restriction;

/**
 * @author mtazari
 * 
 */
public class BlinkableLighting extends Lighting {
    public static final String MY_URI;
    private static Hashtable blinkableLightingRestrictions = new Hashtable(1);
    static {
	MY_URI = LightSource.LIGHTING_NAMESPACE + "BlinkableLighting";
	register(BlinkableLighting.class);
	addRestriction(Restriction.getAllValuesRestriction(PROP_CONTROLS,
		BlinkableLightSource.MY_URI), new String[] { PROP_CONTROLS },
		blinkableLightingRestrictions);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (propURI == null)
	    return null;
	Object r = blinkableLightingRestrictions.get(propURI);
	if (r instanceof Restriction)
	    return (Restriction) r;
	return Lighting.getClassRestrictionsOnProperty(propURI);
    }

    public static String getRDFSComment() {
	return "The class of services controling blinkable light sources.";
    }

    public static String getRDFSLabel() {
	return "Blinkable Lighting";
    }

    public BlinkableLighting(String uri) {
	super(uri);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.universAAL.ontology.Service#getClassLevelRestrictions()
     */
    protected Hashtable getClassLevelRestrictions() {
	return blinkableLightingRestrictions;
    }
}
