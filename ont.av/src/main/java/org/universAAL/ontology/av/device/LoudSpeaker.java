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

package org.universAAL.ontology.av.device;

import org.universAAL.middleware.util.Constants;
import org.universAAL.ontology.av.AVOntology;
import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of a loudspeaker device. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * Warning!: This class is duplicated in ont.device.extra. It will have to be
 * removed from there, but is currently kept due to bugs on ont.av
 * 
 * @author climberg
 * @author Carsten Stockloew
 */
public class LoudSpeaker extends Device {

	public static final String MY_URI = AVOntology.NAMESPACE + "LoudSpeaker";
	public static final String PROP_VOLUME = AVOntology.NAMESPACE + "volume";
	public static final String PROP_EFFECTIVE_POWER_IN_WATT = AVOntology.NAMESPACE + "effectivePowerInWatt";
	public static final String PROP_BANDWIDTH_IN_HZ = AVOntology.NAMESPACE + "bandWidthInHz";
	public static final String PROP_IS_MUSIC_COMPATIBLE = AVOntology.NAMESPACE + "isMusicCompatible";
	public static final String PROP_UPPER_BOUND = AVOntology.NAMESPACE + "upperBound";
	public static final String PROP_IS_MUTED = AVOntology.NAMESPACE + "isMuted";

	/** The default constructor */
	public LoudSpeaker() {
		super();
	}

	/**
	 * this constructor is needed for constructing loudspeakers with a special
	 * URI as parameter for the case that an existing loudspeaker has to be
	 * initialized by the database for example
	 */
	public LoudSpeaker(String uri) {
		super((uri == null || uri.lastIndexOf('#') > 0) ? uri : Constants.uAAL_MIDDLEWARE_LOCAL_ID_PREFIX + uri);
	}

	/**
	 * numProps is a dummy parameter this constructor is needed for constructing
	 * microphones with an unique URI
	 */
	public LoudSpeaker(int numProps) {
		super(AVOntology.NAMESPACE, numProps);
	}

	public String getClassURI() {
		return MY_URI;
	}

	// TODO: uncompleted!!!
	public int getPropSerializationType(String propURI) {
		if (PROP_VOLUME.equals(propURI) || PROP_EFFECTIVE_POWER_IN_WATT.equals(propURI)
				|| PROP_BANDWIDTH_IN_HZ.equals(propURI) || PROP_IS_MUSIC_COMPATIBLE.equals(propURI)
				|| PROP_UPPER_BOUND.equals(propURI) || PROP_IS_MUTED.equals(propURI))
			return PROP_SERIALIZATION_FULL;
		return super.getPropSerializationType(propURI);
	}
}
