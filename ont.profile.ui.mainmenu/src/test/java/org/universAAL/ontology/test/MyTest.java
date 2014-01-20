/*	
	Copyright 2007-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
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
package org.universAAL.ontology.test;

import java.util.List;

import org.universAAL.middleware.bus.junit.ManifestTestCase;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.profile.ProfileOntology;
import org.universAAL.ontology.profile.ui.mainmenu.MenuEntry;
import org.universAAL.ontology.profile.ui.mainmenu.MenuProfileOntology;
import org.universAAL.ontology.shape.ShapeOntology;
import org.universAAL.ontology.vcard.VCardOntology;

public class MyTest extends ManifestTestCase {

    protected void setUp() throws Exception {
	super.setUp();

	OntologyManagement.getInstance().register(mc, new LocationOntology());
	OntologyManagement.getInstance().register(mc, new ShapeOntology());
	OntologyManagement.getInstance().register(mc, new PhThingOntology());
	OntologyManagement.getInstance().register(mc, new VCardOntology());
	OntologyManagement.getInstance().register(mc, new ProfileOntology());
	OntologyManagement.getInstance().register(mc, new MenuProfileOntology());
    }

    public void testMenuEntry() {
	MenuEntry me = new MenuEntry(null);
	Resource pathElem = new Resource("iconURL");
	pathElem.setResourceLabel("entryName");
	me.setPath(new Resource[] { pathElem });
	
	List l = me.getPath();
	assertTrue(l.size() == 1);
    }
}
