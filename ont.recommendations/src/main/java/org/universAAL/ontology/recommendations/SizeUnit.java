/*******************************************************************************
 * Copyright 2013 Universidad Politécnica de Madrid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package org.universAAL.ontology.recommendations;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Enumerations of possible expressions of {@link Size}.
 * 
 * Possible options are:
 * 
 *<ul>
 *<li> <b>absolute</b> Absolute size expressed in pixels.
 *<li> <b>screenRelative</b> Size expressed in percentage over the overall screen size. 
 *<li> <b>parentRelative</b> Size is expressed in percentage over the size of the parent container.
 *</ul>
 * 
 * 
 * @author amedrano
 * @see Size
 * @see MinimumSize
 * @see PreferredSize
 * @see MaximumSize
 */
public class SizeUnit extends ManagedIndividual {

	public static final String MY_URI = RecommendationsOntology.NAMESPACE
			+ "SizeUnit";

	public static final int ABOSLUTE_PIXELS = 0;
	public static final int RELATIVE_SCREEN = 1;
	public static final int RELATIVE_PARENT = 2;

	private static final String[] names = { "absolute", "relativeToScreen", "relativeToParent" };

	public static final SizeUnit absolute = new SizeUnit(ABOSLUTE_PIXELS);
	public static final SizeUnit screenRelative = new SizeUnit(RELATIVE_SCREEN);
	public static final SizeUnit ParentRelative = new SizeUnit(RELATIVE_PARENT);

	private int order;

	private SizeUnit(int order) {
		super(RecommendationsOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	/**
	 * @see org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType
	 *      (java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.universAAL.middleware.owl.ManagedIndividual#isWellFormed()
	 */
	public boolean isWellFormed() {
		return true;
	}

	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}

	/**
	 * @return number of defined content density types
	 */
	public static int getSize() {
		return names.length;
	}

	/** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
	public String getClassURI() {
		return MY_URI;
	}

	public static SizeUnit getContentDensityTypeByOrder(int order) {
		switch (order) {
		case ABOSLUTE_PIXELS:
			return absolute;
		case RELATIVE_SCREEN:
			return screenRelative;
		case RELATIVE_PARENT:
			return ParentRelative;
		default:
			return null;
		}
	}

	public static final SizeUnit valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(RecommendationsOntology.NAMESPACE))
			name = name.substring(RecommendationsOntology.NAMESPACE.length());

		for (int i = 0; i <= 2; i++)
			if (names[i].equals(name))
				return getContentDensityTypeByOrder(i);

		return null;
	}
}
