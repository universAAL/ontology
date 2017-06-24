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

package org.universAAL.ontology.av.streaming;

import org.universAAL.ontology.av.AVOntology;

/**
 * Ontological representation describing an audio format. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for universAAL. Usually it includes getters and setters for most of
 * its properties.
 *
 * @author climberg
 * @author Carsten Stockloew
 */
public class AudioFormat extends Format {

	public static final String MY_URI = AVOntology.NAMESPACE + "audioFormat";
	public static final String PROP_CHANNELS = AVOntology.NAMESPACE + "channels";
	public static final String PROP_SAMPLES_PER_SECOND = AVOntology.NAMESPACE + "samplesPerSecond";
	public static final String PROP_BITS_PER_SAMPLE = AVOntology.NAMESPACE + "bitsPerSample";
	public static final String PROP_BIG_ENDIAN = AVOntology.NAMESPACE + "bigEndian";
	public static final String PROP_SIGNED = AVOntology.NAMESPACE + "signed";

	/**
	 * the default constructor
	 */
	public AudioFormat(AudioCompression encoding, int channels, int samplesPerSecond, int bitsPerSample,
			boolean bigEndian, boolean signed) {
		super();
		setProperty(PROP_ENCODING, encoding);
		setProperty(PROP_CHANNELS, new Integer(channels));
		setProperty(PROP_SAMPLES_PER_SECOND, new Integer(samplesPerSecond));
		setProperty(PROP_BITS_PER_SAMPLE, new Integer(bitsPerSample));
		setProperty(PROP_BIG_ENDIAN, Boolean.valueOf(bigEndian));
		setProperty(PROP_SIGNED, Boolean.valueOf(signed));
	}

	public AudioFormat(String uri) {
		super(uri);
	}

	public AudioFormat() {
		super();
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getChannels() {
		return ((Integer) getProperty(PROP_CHANNELS)).intValue();
	}

	public int getSamplesPerSecond() {
		return ((Integer) getProperty(PROP_SAMPLES_PER_SECOND)).intValue();
	}

	public int getBitsPerSample() {
		return ((Integer) getProperty(PROP_BITS_PER_SAMPLE)).intValue();
	}

	public boolean isBigEndian() {
		return ((Boolean) getProperty(PROP_BIG_ENDIAN)).booleanValue();
	}

	public boolean isSigned() {
		return ((Boolean) getProperty(PROP_SIGNED)).booleanValue();
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}
}
