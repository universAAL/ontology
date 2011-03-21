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

package org.universAAL.ontology.av.streaming;

import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.phThing.Device;

/**
 * 
 * @author climberg
 * 
 */
public class AudioFormat extends Format {

    public static final String MY_URI;

    public static final String PROP_CHANNELS;
    public static final String PROP_SAMPLES_PER_SECOND;
    public static final String PROP_BITS_PER_SAMPLE;
    public static final String PROP_BIG_ENDIAN;
    public static final String PROP_SIGNED;

    static {
	MY_URI = Stream.STREAM_NAMESPACE + "audioFormat";

	PROP_CHANNELS = Stream.STREAM_NAMESPACE + "channels";
	PROP_SAMPLES_PER_SECOND = Stream.STREAM_NAMESPACE + "samplesPerSecond";
	PROP_BITS_PER_SAMPLE = Stream.STREAM_NAMESPACE + "bitsPerSample";
	PROP_BIG_ENDIAN = Stream.STREAM_NAMESPACE + "bigEndian";
	PROP_SIGNED = Stream.STREAM_NAMESPACE + "signed";

	register(AudioFormat.class);
    }

    // TODO: better restrictions, perhaps definition of permitted sets
    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_ENCODING.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    AudioCompression.MY_URI, 1, 1);
	if (PROP_CHANNELS.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_SAMPLES_PER_SECOND.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_BITS_PER_SAMPLE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_BIG_ENDIAN.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Boolean.class), 1, 1);
	if (PROP_SIGNED.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Boolean.class), 1, 1);

	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Device.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 5];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}

	toReturn[i++] = PROP_CHANNELS;
	toReturn[i++] = PROP_SAMPLES_PER_SECOND;
	toReturn[i++] = PROP_BITS_PER_SAMPLE;
	toReturn[i++] = PROP_BIG_ENDIAN;
	toReturn[i] = PROP_SIGNED;

	return toReturn;
    }

    /**
     * the default constructor
     */
    public AudioFormat(AudioCompression encoding, int channels,
	    int samplesPerSecond, int bitsPerSample, boolean bigEndian,
	    boolean signed) {
	super();
	setProperty(PROP_ENCODING, encoding);
	setProperty(PROP_CHANNELS, new Integer(channels));
	setProperty(PROP_SAMPLES_PER_SECOND, new Integer(samplesPerSecond));
	setProperty(PROP_BITS_PER_SAMPLE, new Integer(bitsPerSample));
	setProperty(PROP_BIG_ENDIAN, new Boolean(bigEndian));
	setProperty(PROP_SIGNED, new Boolean(signed));
    }

    /**
	 *
	 */
    public AudioFormat(String uri) {
	super(uri);
    }

    public AudioFormat() {
	super();
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

    public boolean isBidEndian() {
	return ((Boolean) getProperty(PROP_BIG_ENDIAN)).booleanValue();
    }

    public boolean isSigned() {
	return ((Boolean) getProperty(PROP_SIGNED)).booleanValue();
    }

    public static String getRDFSComment() {
	return "The class of all AudioFormats.";
    }

    public static String getRDFSLabel() {
	return "AudioFormat";
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true;
    }
}
