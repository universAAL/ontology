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
 * Ontological representation describing a video format. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author climberg
 * 
 */
public class VideoFormat extends Format {

    public static final String MY_URI;

    public static final String PROP_FRAMES_PER_SECOND;
    public static final String PROP_HEIGHT;
    public static final String PROP_WIDTH;
    public static final String PROP_BITS_PER_PIXEL;

    static {
	MY_URI = Stream.STREAM_NAMESPACE + "videoFormat";

	PROP_FRAMES_PER_SECOND = Stream.STREAM_NAMESPACE + "framesPerSecond";
	PROP_HEIGHT = Stream.STREAM_NAMESPACE + "height";
	PROP_WIDTH = Stream.STREAM_NAMESPACE + "width";
	PROP_BITS_PER_PIXEL = Stream.STREAM_NAMESPACE + "bitsPerPixel";

	register(VideoFormat.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_ENCODING.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    VideoCompression.MY_URI, 1, 1);
	if (PROP_FRAMES_PER_SECOND.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_HEIGHT.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_WIDTH.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_BITS_PER_PIXEL.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);

	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Device.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 4];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i++] = PROP_FRAMES_PER_SECOND;
	toReturn[i++] = PROP_HEIGHT;
	toReturn[i++] = PROP_WIDTH;
	toReturn[i] = PROP_BITS_PER_PIXEL;
	return toReturn;
    }

    /**
     * the default constructor
     */
    public VideoFormat() {
	super();
    }

    /**
	 *
	 */
    public VideoFormat(String uri) {
	super(uri);
    }

    /**
     * 
     * @param encoding
     * @param fps
     * @param height
     * @param width
     * @param bitsPerPixel
     */
    public VideoFormat(VideoCompression encoding, int fps, int height,
	    int width, int bitsPerPixel) {
	setProperty(PROP_ENCODING, encoding);
	setProperty(PROP_FRAMES_PER_SECOND, new Integer(fps));
	setProperty(PROP_HEIGHT, new Integer(height));
	setProperty(PROP_WIDTH, new Integer(width));
	setProperty(PROP_BITS_PER_PIXEL, new Integer(bitsPerPixel));
    }

    public int getFramesPerSecond() {
	return ((Integer) getProperty(PROP_FRAMES_PER_SECOND)).intValue();
    }

    public int getHeight() {
	return ((Integer) getProperty(PROP_HEIGHT)).intValue();
    }

    public int getWidth() {
	return ((Integer) getProperty(PROP_WIDTH)).intValue();
    }

    public int getBitsPerPixel() {
	return ((Integer) getProperty(PROP_BITS_PER_PIXEL)).intValue();
    }

    public static String getRDFSComment() {
	return "The class of all VideoFormats.";
    }

    public static String getRDFSLabel() {
	return "VideoFormat";
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true;
    }
}
