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
 * Ontological enumeration of different audio compression algorithms. Methods
 * included in this class are the mandatory ones for representing an ontological
 * enumeration in Java classes for universAAL.
 *
 * @author climberg
 * @author Carsten Stockloew
 */
public class AudioCompression extends Compression {

	public static final String MY_URI = AVOntology.NAMESPACE + "AudioCompression";

	/*
	 * to add a type, following actions are necessary: add the order as public
	 * integer attribute add the name to the array of names add the internal
	 * representation of the type as public AudioCompression attribute
	 */
	public static final int PCM = 0;
	public static final int MPEG_1_AUDIO_LAYER_3 = 1;
	public static final int OGG_Vorbis = 2;

	// array with compression names
	private static final String[] names = { "pcm", "MPEG-1AudioLayer3", "OGGVorbis" };

	// the different compressions
	public static final AudioCompression pcm = new AudioCompression(PCM);
	public static final AudioCompression mpeg1AudioLayer3 = new AudioCompression(MPEG_1_AUDIO_LAYER_3);
	public static final AudioCompression oggVorbis = new AudioCompression(OGG_Vorbis);

	/**
	 *
	 * @param order
	 * @return an audio compression concerning to th order
	 */
	public static AudioCompression getCompressionByOrder(int order) {
		switch (order) {
		case PCM:
			return pcm;
		case MPEG_1_AUDIO_LAYER_3:
			return mpeg1AudioLayer3;
		case OGG_Vorbis:
			return oggVorbis;
		default:
			return null;
		}
	}

	/**
	 *
	 * @param name
	 * @return an audio compression concerning to the name
	 *
	 */
	public static final AudioCompression valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(AVOntology.NAMESPACE))
			name = name.substring(AVOntology.NAMESPACE.length());

		for (int i = MPEG_1_AUDIO_LAYER_3; i <= names.length; i++)
			if (names[i].equals(name))
				return getCompressionByOrder(i);
		return null;
	}

	private int order;

	private AudioCompression(int order) {
		super(AVOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}

	public boolean setProperty(String propURI, Object o) {
		// do nothing
		return false;
	}
}
