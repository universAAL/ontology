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
 * Ontological representation describing a video format. Methods included in
 * this class are the mandatory ones for representing an ontological concept in
 * Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * @author climberg
 * @author Carsten Stockloew
 */
public class VideoFormat extends Format {

	public static final String MY_URI = AVOntology.NAMESPACE + "videoFormat";;
	public static final String PROP_FRAMES_PER_SECOND = AVOntology.NAMESPACE + "framesPerSecond";
	public static final String PROP_HEIGHT = AVOntology.NAMESPACE + "height";
	public static final String PROP_WIDTH = AVOntology.NAMESPACE + "width";
	public static final String PROP_BITS_PER_PIXEL = AVOntology.NAMESPACE + "bitsPerPixel";

	/** The default constructor */
	public VideoFormat() {
		super();
	}

	public VideoFormat(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	/**
	 * 
	 * @param encoding
	 * @param fps
	 * @param height
	 * @param width
	 * @param bitsPerPixel
	 */
	public VideoFormat(VideoCompression encoding, int fps, int height, int width, int bitsPerPixel) {
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

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}
}
