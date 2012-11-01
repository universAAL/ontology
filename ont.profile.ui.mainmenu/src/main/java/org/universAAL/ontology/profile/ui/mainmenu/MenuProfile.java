/*	
	Copyright 2007-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institut für Graphische Datenverarbeitung
	
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
package org.universAAL.ontology.profile.ui.mainmenu;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.ontology.profile.SubProfile;

public class MenuProfile extends SubProfile {
    public static final String MY_URI = MenuProfileOntology.NAMESPACE
	    + "MenuProfile";

    public static final String PROP_ENTRY = MenuProfileOntology.NAMESPACE
	    + "hasEntry";

    public MenuProfile(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return Resource.PROP_SERIALIZATION_FULL;
    }

    public void addMenuEntry(MenuEntry entry) {
	if (entry == null)
	    return;

	Object o = getProperty(PROP_ENTRY);
	if (o == null)
	    setProperty(PROP_ENTRY, entry);
	else if (!(o instanceof List)) {
	    List a = new ArrayList();
	    a.add(o);
	    a.add(entry);
	    props.put(PROP_ENTRY, a);
	} else {
	    List a = (List) o;
	    a.add(entry);
	    props.put(PROP_ENTRY, a);
	}
    }

    public MenuEntry[] getMenuEntries() {
	Object o = getProperty(PROP_ENTRY);
	if (o == null)
	    return new MenuEntry[0];
	else if (!(o instanceof List)) {
	    return new MenuEntry[] { (MenuEntry) o };
	} else {
	    List a = (List) o;
	    return (MenuEntry[]) a.toArray(new MenuEntry[0]);
	}
    }
}
