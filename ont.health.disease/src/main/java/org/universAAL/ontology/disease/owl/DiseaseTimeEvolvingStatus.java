/*******************************************************************************
 * Copyright 2012 Universidad Politécnica de Madrid
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
package org.universAAL.ontology.disease.owl;

/**
 * This disease classification depends on the velocity with which the disease evolves
 * or its duration.
 */

import org.universAAL.middleware.owl.ManagedIndividual;

public class DiseaseTimeEvolvingStatus extends ManagedIndividual {

	public static final String MY_URI = DiseaseOntology.NAMESPACE + "DiseaseTimeEvolvingStatus";

	public static final int ACUTE = 0;
	public static final int CHRONIC = 1;

	private static final String[] names = { "acute", "chronic" };

	public static final DiseaseTimeEvolvingStatus acute = new DiseaseTimeEvolvingStatus(ACUTE);
	public static final DiseaseTimeEvolvingStatus chronic = new DiseaseTimeEvolvingStatus(CHRONIC);

	private int order;

	private DiseaseTimeEvolvingStatus(int order) {
		super(DiseaseOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}

	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}

	public String getClassURI() {
		return MY_URI;
	}

	public static DiseaseTimeEvolvingStatus getTimeEvolvingStatusTypeByOrder(int order) {
		switch (order) {
		case ACUTE:
			return acute;
		case CHRONIC:
			return chronic;
		default:
			return null;
		}
	}

	public boolean equals(Object other) {
		return other instanceof DiseaseTimeEvolvingStatus && ((DiseaseTimeEvolvingStatus) other).order == order;
	}

	public static final DiseaseTimeEvolvingStatus valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(DiseaseOntology.NAMESPACE))
			name = name.substring(DiseaseOntology.NAMESPACE.length());

		for (int i = ACUTE; i <= CHRONIC; i++)
			if (names[i].equals(name))
				return getTimeEvolvingStatusTypeByOrder(i);

		return null;
	}

}
