/*
	Copyright 2008-20144 Fraunhofer IGD, http://www.igd.fraunhofer.de
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
package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.shape.ShapeOntology;
import org.universAAL.ontology.space.SpaceOntology;

public class PhWorldActivator implements ModuleActivator {

    private LocationOntology locationOntology = new LocationOntology();
    private PhThingOntology phThingOntology = new PhThingOntology();
    private ShapeOntology shapeOntology = new ShapeOntology();
    private SpaceOntology spaceOntology = new SpaceOntology();

    public void start(ModuleContext mc) throws Exception {
	// register all ontologies
	OntologyManagement om = OntologyManagement.getInstance();
	om.register(mc, locationOntology);
	om.register(mc, shapeOntology);
	om.register(mc, phThingOntology);
	om.register(mc, spaceOntology);
    }

    public void stop(ModuleContext mc) throws Exception {
	// unregister all ontologies
	OntologyManagement om = OntologyManagement.getInstance();
	om.unregister(mc, locationOntology);
	om.unregister(mc, spaceOntology);
	om.unregister(mc, phThingOntology);
	om.unregister(mc, shapeOntology);
    }
}
