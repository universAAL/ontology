/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
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

/**
 * Ontological representation of a beaming light source. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author mtazari
 * 
 */
public class BeamingSource extends LightSource {
    public static final String MY_URI = LightingOntology.NAMESPACE
	    + "BeamingSource";
    public static final String PROP_BEAMING_DIRECTION = LightingOntology.NAMESPACE
	    + "beamingDirection";
    public static final String PROP_TARGET_SURFACE = LightingOntology.NAMESPACE
	    + "targetSurface";

    public BeamingSource() {
	super();
    }

    public BeamingSource(String uri) {
	super(uri);
    }

    /** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
    public String getClassURI() {
	return MY_URI;
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

    public int getPropSerializationType(String propURI) {
	return (PROP_BEAMING_DIRECTION.equals(propURI) || PROP_TARGET_SURFACE
		.equals(propURI)) ? PROP_SERIALIZATION_REDUCED : super
		.getPropSerializationType(propURI);
    }

    public Location getTargetSurface() {
	return (Location) props.get(PROP_BEAMING_DIRECTION);
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
