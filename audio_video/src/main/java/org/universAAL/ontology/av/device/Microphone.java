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
import org.universAAL.ontology.AVOntology;
import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of a microphone. Methods included in this class
 * are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author climberg
 * @author Carsten Stockloew
 */
public class Microphone extends Device {

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
	MY_URI = AVOntology.NAMESPACE + "Microphone";
	PROP_VOLUME = AVOntology.NAMESPACE + "volume";
	PROP_AMPLIFICATION = AVOntology.NAMESPACE + "amplification";
	PROP_BANDWIDTH_IN_HZ = AVOntology.NAMESPACE + "bandwidthInHz";
	PROP_SAMPLINGRATE_IN_HZ = AVOntology.NAMESPACE + "samplingRateInHz";
	PROP_AUDIO_COMPRESSION = AVOntology.NAMESPACE + "audioCompression";
	PROP_POINTS_TO = AVOntology.NAMESPACE + "pointsTo";
	PROP_ACTIVITY = AVOntology.NAMESPACE + "activity";
	PROP_SILENCE_LEVEL = AVOntology.NAMESPACE + "silenceLevel";
	PROP_USE_ECHO_SUPRESSION = AVOntology.NAMESPACE + "useEchoSupression";
	PROP_IS_MUTED = AVOntology.NAMESPACE + "isMuted";
    }

    /** The default constructor */
    public Microphone() {
	super();
    }

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
	super(AVOntology.NAMESPACE, 10);
    }

    public String getClassURI() {
	return MY_URI;
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
}
