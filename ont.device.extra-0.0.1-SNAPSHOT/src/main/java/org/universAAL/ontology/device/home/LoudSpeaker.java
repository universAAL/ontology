/*
	Copyright 2008-2010 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute of Computer Graphics Research 
	
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

package org.universAAL.ontology.device.home;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.OrderingRestriction;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.util.Constants;
import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of a loudspeaker device. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * Warning!: This class is duplicated in ont.av. It will have to be
 * removed from here, but is currently kept due to bugs on ont.av
 * 
 * @author climberg
 * 
 */
public class LoudSpeaker extends Device {

    public static final String LOUD_SPEAKER_NAMESPACE = "http://ontology.persona.ima.igd.fhg.de/LoudSpeaker.owl#";
    public static final String MY_URI;
    public static final String PROP_VOLUME;
    public static final String PROP_EFFECTIVE_POWER_IN_WATT;
    public static final String PROP_BANDWIDTH_IN_HZ;
    public static final String PROP_IS_MUSIC_COMPATIBLE;
    public static final String PROP_UPPER_BOUND;
    public static final String PROP_IS_MUTED;

    static {
	MY_URI = LOUD_SPEAKER_NAMESPACE + "LoudSpeaker";
	PROP_VOLUME = LOUD_SPEAKER_NAMESPACE + "volume";
	PROP_EFFECTIVE_POWER_IN_WATT = LOUD_SPEAKER_NAMESPACE
		+ "effectivePowerInWatt";
	PROP_BANDWIDTH_IN_HZ = LOUD_SPEAKER_NAMESPACE + "bandWidthInHz";
	PROP_IS_MUSIC_COMPATIBLE = LOUD_SPEAKER_NAMESPACE + "isMusicCompatible";
	PROP_UPPER_BOUND = LOUD_SPEAKER_NAMESPACE + "upperBound";
	PROP_IS_MUTED = LOUD_SPEAKER_NAMESPACE + "isMuted";
	register(LoudSpeaker.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_VOLUME.equals(propURI))
	    return OrderingRestriction.newOrderingRestriction(new Integer(100),
		    new Integer(0), true, true, Restriction
			    .getAllValuesRestrictionWithCardinality(propURI,
				    TypeMapper.getDatatypeURI(Integer.class),
				    1, 1));
	if (PROP_EFFECTIVE_POWER_IN_WATT.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Double.class), 1, 0);
	if (PROP_BANDWIDTH_IN_HZ.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Double.class), 1, 0);
	if (PROP_IS_MUSIC_COMPATIBLE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Boolean.class), 1, 1);
	if (PROP_UPPER_BOUND.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Double.class), 1, 0);
	if (PROP_IS_MUTED.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Boolean.class), 1, 1);
	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Device.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 6];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i++] = PROP_VOLUME;
	toReturn[i++] = PROP_EFFECTIVE_POWER_IN_WATT;
	toReturn[i++] = PROP_BANDWIDTH_IN_HZ;
	toReturn[i++] = PROP_IS_MUSIC_COMPATIBLE;
	toReturn[i++] = PROP_UPPER_BOUND;
	toReturn[i] = PROP_IS_MUTED;
	return toReturn;
    }

    public static String getRDFSComment() {
	return "The class of all LoudSpeakers.";
    }

    public static String getRDFSLabel() {
	return "LoudSpeaker";
    }

    /**
     * the default constructor
     */
    public LoudSpeaker() {
	super();
    }

    /**
     * this constructor is needed for constructing loudspeakers with a special
     * URI as parameter for the case that an existing loudspeaker has to be
     * initialized by the database for example
     */
    public LoudSpeaker(String uri) {
	super((uri == null || uri.lastIndexOf('#') > 0) ? uri
		: Constants.uAAL_MIDDLEWARE_LOCAL_ID_PREFIX + uri);
    }

    /**
     * numProps is a dummy parameter this constructor is needed for constructing
     * microphones with an unique URI
     */
    public LoudSpeaker(int numProps) {
	super(LoudSpeaker.LOUD_SPEAKER_NAMESPACE, 6);
    }

    // TODO: uncompleted!!!
    public int getPropSerializationType(String propURI) {
	if (PROP_VOLUME.equals(propURI)
		|| PROP_EFFECTIVE_POWER_IN_WATT.equals(propURI)
		|| PROP_BANDWIDTH_IN_HZ.equals(propURI)
		|| PROP_IS_MUSIC_COMPATIBLE.equals(propURI)
		|| PROP_UPPER_BOUND.equals(propURI)
		|| PROP_IS_MUTED.equals(propURI))
	    return PROP_SERIALIZATION_FULL;
	return super.getPropSerializationType(propURI);
    }

    // bald entfernt
    public boolean isWellFormed() {
	return true;
    }

}
