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

public class Language extends ManagedIndividual {
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "Language";

    public static final int GERMAN = 0;
    public static final int ITALIAN = 1;
    public static final int GREEK = 2;
    public static final int SPANISH = 3;
    public static final int ENGLISH = 4;
    public static final int POLISH = 5;
    public static final int CROATIAN = 6;
    public static final int NORVEGIAN = 7;
    public static final int DUTCH = 8;
    public static final int FRENCH = 9;
    public static final int TAIWANESE = 10;
    public static final int ISRAELI = 11;
    public static final int PORTUGUESE = 12;
    public static final int RUSIAN = 13;
    public static final int HUNGARIAN = 14;
    public static final int CHINESE = 15;

    private static final String[] names = { "german", "italian", "greek",
	    "spanish", "english", "polish", "croatian", "norvegian", "dutch",
	    "french", "taiwanese", "israeli", "portuguese", "rusian",
	    "hungarian", "chinese" };

    public static final Language german = new Language(GERMAN);
    public static final Language italian = new Language(ITALIAN);
    public static final Language greek = new Language(GREEK);
    public static final Language spanish = new Language(SPANISH);
    public static final Language english = new Language(ENGLISH);
    public static final Language polish = new Language(POLISH);
    public static final Language croatian = new Language(CROATIAN);
    public static final Language norvegian = new Language(NORVEGIAN);
    public static final Language dutch = new Language(DUTCH);
    public static final Language french = new Language(FRENCH);
    public static final Language taiwanese = new Language(TAIWANESE);
    public static final Language israeli = new Language(ISRAELI);
    public static final Language portuguese = new Language(PORTUGUESE);
    public static final Language rusian = new Language(RUSIAN);
    public static final Language hungarian = new Language(HUNGARIAN);
    public static final Language chinese = new Language(CHINESE);

    private int order;

    private Language(int order) {
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
     * @return number of defined languages
     */
    public static int getSize() {
	return names.length;
    }

    /** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
    public String getClassURI() {
	return MY_URI;
    }

    public static Language getLanguageByOrder(int order) {
	switch (order) {
	case GERMAN:
	    return german;
	case ITALIAN:
	    return italian;
	case GREEK:
	    return greek;
	case SPANISH:
	    return spanish;
	case ENGLISH:
	    return english;
	case POLISH:
	    return polish;
	case CROATIAN:
	    return croatian;
	case NORVEGIAN:
	    return norvegian;
	case DUTCH:
	    return dutch;
	case FRENCH:
	    return french;
	case TAIWANESE:
	    return taiwanese;
	case ISRAELI:
	    return israeli;
	case PORTUGUESE:
	    return portuguese;
	case RUSIAN:
	    return rusian;
	case HUNGARIAN:
	    return hungarian;
	case CHINESE:
	    return chinese;
	default:
	    return null;
	}
    }

    public static final Language valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(UIPreferencesProfileOntology.NAMESPACE))
	    name = name.substring(UIPreferencesProfileOntology.NAMESPACE
		    .length());

	for (int i = GERMAN; i <= CHINESE; i++)
	    if (names[i].equals(name))
		return getLanguageByOrder(i);

	return null;
    }
}
