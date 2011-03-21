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

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * @author climberg
 * 
 */
public class VideoCompression extends Compression {

    public static final String MY_URI;

    static {
	MY_URI = Stream.STREAM_NAMESPACE + "VideoCompression";
	register(VideoCompression.class);
    }

    public static final int RGB = 0;
    public static final int BGR = 1;
    public static final int YUV = 2;
    public static final int JPEG = 3;
    public static final int MPEG_1 = 4;

    // array with compression names
    private static final String[] names = { "rgb", "bgr", "yuv", "jpeg",
	    "mpeg1" };

    // the different compressions
    public static final VideoCompression rgb = new VideoCompression(RGB);
    public static final VideoCompression bgr = new VideoCompression(BGR);
    public static final VideoCompression yuv = new VideoCompression(YUV);
    public static final VideoCompression jpeg = new VideoCompression(JPEG);
    public static final VideoCompression mpeg1 = new VideoCompression(MPEG_1);

    /**
     * Returns the list of all class members guaranteeing that no other members
     * will be created after a call to this method.
     */
    public static ManagedIndividual[] getEnumerationMembers() {
	return new ManagedIndividual[] {};
    }

    /**
     * 
     * @param instanceURI
     * @return a video compression concerning to the URI
     */
    public static ManagedIndividual getIndividualByURI(String instanceURI) {
	return (instanceURI != null && instanceURI
		.startsWith(Stream.STREAM_NAMESPACE)) ? valueOf(instanceURI
		.substring(Stream.STREAM_NAMESPACE.length())) : null;
    }

    /**
     * 
     * @param order
     * @return a video compression concerning to the order
     */
    public static VideoCompression getCompressionByOrder(int order) {
	switch (order) {
	case RGB:
	    return rgb;
	case BGR:
	    return bgr;
	case YUV:
	    return yuv;
	case JPEG:
	    return jpeg;
	case MPEG_1:
	    return mpeg1;
	default:
	    return null;
	}
    }

    /**
     * 
     * 
     * @param name
     * @return a video compression concerning to the name
     */
    public static final VideoCompression valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(Stream.STREAM_NAMESPACE))
	    name = name.substring(Stream.STREAM_NAMESPACE.length());

	for (int i = JPEG; i <= names.length; i++)
	    if (names[i].equals(name))
		return getCompressionByOrder(i);

	return null;
    }

    public static String getRDFSComment() {
	return "The type of video compressions.";
    }

    public static String getRDFSLabel() {
	return "VideoCompression";
    }

    private int order;

    private VideoCompression(int order) {
	super(Stream.STREAM_NAMESPACE + names[order]);
	this.order = order;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_OPTIONAL;
    }

    // removed soon
    public boolean isWellFormed() {
	return true;
    }

    public String name() {
	return names[order];
    }

    public int ord() {
	return order;
    }

    public void setProperty(String propURI, Object o) {
	// do nothing
    }
}
