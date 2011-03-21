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

import org.universAAL.ontology.location.Location;
import org.universAAL.middleware.owl.Restriction;

/**
 * @author mtazari
 * 
 */
public class BeamingSource extends LightSource {
    public static final String MY_URI;
    public static final String PROP_BEAMING_DIRECTION;
    public static final String PROP_TARGET_SURFACE;
    static {
	MY_URI = LightSource.LIGHTING_NAMESPACE + "BeamingSource";
	PROP_BEAMING_DIRECTION = LightSource.LIGHTING_NAMESPACE
		+ "beamingDirection";
	PROP_TARGET_SURFACE = LightSource.LIGHTING_NAMESPACE + "targetSurface";
	register(BeamingSource.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_BEAMING_DIRECTION.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Location.MY_URI, 1, 0);
	if (PROP_TARGET_SURFACE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Location.MY_URI, 1, 0);
	return LightSource.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = LightSource.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 2];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i++] = PROP_BEAMING_DIRECTION;
	toReturn[i] = PROP_TARGET_SURFACE;
	return toReturn;
    }

    public static String getRDFSComment() {
	return "The class of beaming light sources.";
    }

    public static String getRDFSLabel() {
	return "Beaming Source";
    }

    public BeamingSource() {
	super();
    }

    public BeamingSource(String uri) {
	super(uri);
    }

    public BeamingSource(String uri, LightType type, Location loc,
	    Location directedTo, Location targetSurface) {
	super(uri, type, loc);
	if (directedTo == null && targetSurface == null)
	    throw new IllegalArgumentException();
	if (directedTo != null)
	    props.put(PROP_BEAMING_DIRECTION, directedTo);
	if (targetSurface != null)
	    props.put(PROP_TARGET_SURFACE, targetSurface);
    }

    public Location getBeamingDirection() {
	return (Location) props.get(PROP_BEAMING_DIRECTION);
    }

    public Location getTargetSurface() {
	return (Location) props.get(PROP_BEAMING_DIRECTION);
    }

    public int getPropSerializationType(String propURI) {
	return (PROP_BEAMING_DIRECTION.equals(propURI) || PROP_TARGET_SURFACE
		.equals(propURI)) ? PROP_SERIALIZATION_REDUCED : super
		.getPropSerializationType(propURI);
    }

    public boolean isWellFormed() {
	return (props.containsKey(PROP_BEAMING_DIRECTION) || props
		.containsKey(PROP_TARGET_SURFACE))
		&& super.isWellFormed();
    }

    public void setBeamingDirection(Location directedTo) {
	if (directedTo != null)
	    props.put(PROP_BEAMING_DIRECTION, directedTo);
    }

    public void setTargetSurface(Location targetSurface) {
	if (targetSurface != null)
	    props.put(PROP_BEAMING_DIRECTION, targetSurface);
    }

}
