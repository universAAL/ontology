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
 * Ontological service that handles blinkable and beaming light sources. Methods
 * included in this class are the mandatory ones for representing an ontological
 * service in Java classes for uAAL.
 * 
 * @author mtazari
 * 
 */
public class BlinkableBeaming extends Beaming {
    public static final String MY_URI;
    private static Hashtable blinkableBeamingRestrictions = new Hashtable(1);
    static {
	MY_URI = LightSource.LIGHTING_NAMESPACE + "BlinkableBeaming";
	register(BlinkableBeaming.class);
	addRestriction(Restriction.getAllValuesRestriction(PROP_CONTROLS,
		BlinkableBeamingSource.MY_URI), new String[] { PROP_CONTROLS },
		blinkableBeamingRestrictions);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (propURI == null)
	    return null;
	Object r = blinkableBeamingRestrictions.get(propURI);
	if (r instanceof Restriction)
	    return (Restriction) r;
	return Beaming.getClassRestrictionsOnProperty(propURI);
    }

    public static String getRDFSComment() {
	return "The class of services controling blinkable beaming sources.";
    }

    public static String getRDFSLabel() {
	return "Blinkable Beaming";
    }

    public BlinkableBeaming(String uri) {
	super(uri);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.universAAL.ontology.Service#getClassLevelRestrictions()
     */
    protected Hashtable getClassLevelRestrictions() {
	return blinkableBeamingRestrictions;
    }
}
