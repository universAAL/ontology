/*
	Copyright 2008-20144 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut für Graphische Datenverarbeitung 
	
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
package org.universAAL.ontology.phWorld.osgi;

import org.universAAL.ontology.*;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.shape.ShapeOntology;
import org.universAAL.ontology.space.SpaceOntology;

public class Activator implements BundleActivator {

    static BundleContext context = null;
    LocationOntology locationOntology = new LocationOntology();
    PhThingOntology phThingOntology = new PhThingOntology();
    ShapeOntology shapeOntology = new ShapeOntology();
    SpaceOntology spaceOntology = new SpaceOntology();

    public void start(BundleContext context) throws Exception {
	Activator.context = context;
	
	// register all ontologies
	OntologyManagement om = OntologyManagement.getInstance();
	om.register(locationOntology);
	om.register(shapeOntology);
	om.register(phThingOntology);
	om.register(spaceOntology);
    }

    public void stop(BundleContext arg0) throws Exception {
	// unregister all ontologies
	OntologyManagement om = OntologyManagement.getInstance();
	om.unregister(locationOntology);
	om.unregister(spaceOntology);
	om.unregister(phThingOntology);
	om.unregister(shapeOntology);
    }
}
