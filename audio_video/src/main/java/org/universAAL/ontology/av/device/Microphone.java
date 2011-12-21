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

package org.universAAL.ontology.av.device;

import org.universAAL.middleware.util.Constants;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.OrderingRestriction;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.location.position.Point;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.av.streaming.AudioCompression;
import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of a microphone. Methods included in this class
 * are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author climberg
 * 
 */
public class Microphone extends Device {

    public static final String MICROPHONE_NAMESPACE = "http://ontology.persona.ima.igd.fhg.de/Microphone.owl#";
    public static final String MY_URI;
    public static final String PROP_VOLUME;
    public static final String PROP_AMPLIFICATION;
    public static final String PROP_BANDWIDTH_IN_HZ;
    public static final String PROP_SAMPLINGRATE_IN_HZ;
    public static final String PROP_AUDIO_COMPRESSION;
    public static final String PROP_POINTS_TO;
    public static final String PROP_ACTIVITY;
    public static final String PROP_SILENCE_LEVEL;
    public static final String PROP_USE_ECHO_SUPRESSION;
    public static final String PROP_IS_MUTED;

    static {
	MY_URI = MICROPHONE_NAMESPACE + "Microphone";
	PROP_VOLUME = MICROPHONE_NAMESPACE + "volume";
	PROP_AMPLIFICATION = MICROPHONE_NAMESPACE + "amplification";
	PROP_BANDWIDTH_IN_HZ = MICROPHONE_NAMESPACE + "bandwidthInHz";
	PROP_SAMPLINGRATE_IN_HZ = MICROPHONE_NAMESPACE + "samplingRateInHz";
	PROP_AUDIO_COMPRESSION = MICROPHONE_NAMESPACE + "audioCompression";
	PROP_POINTS_TO = MICROPHONE_NAMESPACE + "pointsTo";
	PROP_ACTIVITY = MICROPHONE_NAMESPACE + "activity";
	PROP_SILENCE_LEVEL = MICROPHONE_NAMESPACE + "silenceLevel";
	PROP_USE_ECHO_SUPRESSION = MICROPHONE_NAMESPACE + "useEchoSupression";
	PROP_IS_MUTED = MICROPHONE_NAMESPACE + "isMuted";
	register(Microphone.class);
    }

    // which types for compression and direction
    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_PHYSICAL_LOCATION.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Point.MY_URI, 1, 0);
	if (PROP_VOLUME.equals(propURI))
	    return OrderingRestriction.newOrderingRestriction(new Integer(100),
		    new Integer(0), true, true, Restriction
			    .getAllValuesRestrictionWithCardinality(propURI,
				    TypeMapper.getDatatypeURI(Integer.class),
				    1, 1));
	if (PROP_AMPLIFICATION.equals(propURI))
	    return OrderingRestriction.newOrderingRestriction(new Integer(100),
		    new Integer(0), true, true, Restriction
			    .getAllValuesRestrictionWithCardinality(propURI,
				    TypeMapper.getDatatypeURI(Integer.class),
				    1, 0));
	if (PROP_BANDWIDTH_IN_HZ.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Double.class), 1, 1);
	if (PROP_SAMPLINGRATE_IN_HZ.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Double.class), 1, 1);
	if (PROP_AUDIO_COMPRESSION.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    AudioCompression.MY_URI, 1, 0);
	if (PROP_POINTS_TO.equals(propURI))
	    // TODO: decision needed, which object has to define the direction
	    // of a microphone
	    return Restriction.getAllValuesRestrictionWithCardinality(
		    PROP_POINTS_TO, Location.MY_URI, 1, 0);
	if (PROP_ACTIVITY.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Double.class), 1, 1);
	if (PROP_SILENCE_LEVEL.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Double.class), 1, 1);
	if (PROP_USE_ECHO_SUPRESSION.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Boolean.class), 1, 1);
	if (PROP_IS_MUTED.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Boolean.class), 1, 1);
	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Device.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 10];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i++] = PROP_VOLUME;
	toReturn[i++] = PROP_AMPLIFICATION;
	toReturn[i++] = PROP_BANDWIDTH_IN_HZ;
	toReturn[i++] = PROP_SAMPLINGRATE_IN_HZ;
	toReturn[i++] = PROP_AUDIO_COMPRESSION;
	toReturn[i++] = PROP_POINTS_TO;
	toReturn[i++] = PROP_USE_ECHO_SUPRESSION;
	toReturn[i++] = PROP_ACTIVITY;
	toReturn[i++] = PROP_SILENCE_LEVEL;
	toReturn[i] = PROP_IS_MUTED;
	return toReturn;
    }

    public static String getRDFSComment() {
	return "The class of all Microphones.";
    }

    public static String getRDFSLabel() {
	return "Microphone";
    }

    /**
     * the default constructor
     */
    public Microphone() {
	super();
    }

    /**
	 *
	 */
    public Microphone(String uri) {
	super((uri == null || uri.lastIndexOf('#') > 0) ? uri
		: Constants.uAAL_MIDDLEWARE_LOCAL_ID_PREFIX + uri);
    }

    /**
     * numProps is a dummy parameter this constructor is needed for constructing
     * microphones with an unique URI
     */
    public Microphone(int numProps) {
	// TODO: two different constructors are necessary. one for using unique
	// URIs and one for using a special URI as parameter
	super(Microphone.MICROPHONE_NAMESPACE, 10);
    }

    public int getPropSerializationType(String propURI) {
	if (PROP_VOLUME.equals(propURI) || PROP_AMPLIFICATION.equals(propURI)
		|| PROP_BANDWIDTH_IN_HZ.equals(propURI)
		|| PROP_SAMPLINGRATE_IN_HZ.equals(propURI)
		|| PROP_AUDIO_COMPRESSION.equals(propURI)
		|| PROP_POINTS_TO.equals(propURI)
		|| PROP_USE_ECHO_SUPRESSION.equals(propURI)
		|| PROP_ACTIVITY.equals(propURI)
		|| PROP_SILENCE_LEVEL.equals(propURI)
		|| PROP_IS_MUTED.equals(propURI))
	    return PROP_SERIALIZATION_FULL;
	return super.getPropSerializationType(propURI);
    }

    // removed soon
    public boolean isWellFormed() {
	return true;
    }

}
