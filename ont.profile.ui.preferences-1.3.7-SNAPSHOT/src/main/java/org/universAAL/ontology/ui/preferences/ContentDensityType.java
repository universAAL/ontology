/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * Licensed under both Apache License, Version 2.0 and MIT License.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.ui.preferences;

import org.universAAL.middleware.owl.ManagedIndividual;

public class ContentDensityType extends ManagedIndividual {
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "ContentDensityType";

    public static final int OVERVIEW = 0;
    public static final int DETAILED = 1;

    private static final String[] names = { "overview", "detailed" };

    public static final ContentDensityType overview = new ContentDensityType(
	    OVERVIEW);
    public static final ContentDensityType detailed = new ContentDensityType(
	    DETAILED);

    private int order;

    private ContentDensityType(int order) {
	super(UIPreferencesProfileOntology.NAMESPACE + names[order]);
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

    public static ContentDensityType getContentDensityTypeByOrder(int order) {
	switch (order) {
	case OVERVIEW:
	    return overview;
	case DETAILED:
	    return detailed;
	default:
	    return null;
	}
    }

    public static final ContentDensityType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(UIPreferencesProfileOntology.NAMESPACE))
	    name = name.substring(UIPreferencesProfileOntology.NAMESPACE
		    .length());

	for (int i = OVERVIEW; i <= DETAILED; i++)
	    if (names[i].equals(name))
		return getContentDensityTypeByOrder(i);

	return null;
    }
}
