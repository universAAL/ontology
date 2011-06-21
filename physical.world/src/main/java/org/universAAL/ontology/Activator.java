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
package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    static BundleContext context = null;

    public void start(BundleContext context) throws Exception {
	Activator.context = context;
	Class.forName("org.universAAL.ontology.location.indoor.BuildingLevel");
	Class.forName("org.universAAL.ontology.location.indoor.Home");
	Class.forName("org.universAAL.ontology.location.indoor.Corridor");
	Class.forName("org.universAAL.ontology.location.indoor.EntranceHall");
	Class.forName("org.universAAL.ontology.location.indoor.Hall");
	Class.forName("org.universAAL.ontology.location.indoor.Room");
	Class.forName("org.universAAL.ontology.location.indoor.RoomFunction");
	Class.forName("org.universAAL.ontology.location.indoor.StairCase");
	Class.forName("org.universAAL.ontology.location.indoor.StairWay");
	Class.forName("org.universAAL.ontology.location.outdoor.Building");
	Class.forName("org.universAAL.ontology.location.outdoor.City");
	Class.forName("org.universAAL.ontology.location.outdoor.CityQuarter");
	Class.forName("org.universAAL.ontology.location.outdoor.CityRegion");
	Class.forName("org.universAAL.ontology.location.outdoor.Country");
	Class.forName("org.universAAL.ontology.location.outdoor.Region");
	Class.forName("org.universAAL.ontology.location.outdoor.State");
	Class
		.forName("org.universAAL.ontology.location.position.OriginedMetric");
	Class.forName("org.universAAL.ontology.location.position.Point");
	Class.forName("org.universAAL.ontology.location.Way");
	Class.forName("org.universAAL.ontology.phThing.OnOffActuator");
	Class.forName("org.universAAL.ontology.phThing.OnOffSensor");
	Class.forName("org.universAAL.ontology.phThing.PhysicalContainer");
	Class.forName("org.universAAL.ontology.phThing.DimmerActuator");
	Class.forName("org.universAAL.ontology.phThing.DeviceService");
	Class.forName("org.universAAL.ontology.shape.Box");
	Class.forName("org.universAAL.ontology.shape.Circle");
	Class.forName("org.universAAL.ontology.shape.ConeSegment");
	Class.forName("org.universAAL.ontology.shape.MergedShape");
	Class.forName("org.universAAL.ontology.shape.Polyhedron");
	Class.forName("org.universAAL.ontology.shape.QuasiCylinder");
	Class.forName("org.universAAL.ontology.shape.Sphere");
	Class.forName("org.universAAL.ontology.shape.Triangle");
	Class
		.forName("org.universAAL.ontology.space.SpaceConfigurationService");
	Class.forName("org.universAAL.ontology.location.address.Address");
	Class.forName("org.universAAL.ontology.location.address.MailBox");
	Class.forName("org.universAAL.ontology.location.address.PhysicalAddress");
    }

    public void stop(BundleContext arg0) throws Exception {
	// TODO Auto-generated method stub

    }

}
