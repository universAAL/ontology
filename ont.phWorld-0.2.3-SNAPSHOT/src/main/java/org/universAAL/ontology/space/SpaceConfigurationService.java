/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung 
	
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
package org.universAAL.ontology.space;

import java.util.Hashtable;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.owl.Restriction;

import org.universAAL.ontology.phThing.PhysicalThing;
import org.universAAL.ontology.location.Location;

/**
 * Ontological service that handles the arrangement of locations and physical
 * things in a specific space. Methods included in this class are the mandatory
 * ones for representing an ontological service in Java classes for uAAL.
 * 
 */
public class SpaceConfigurationService extends Service {
    public static final String MY_URI;
    public static final String PROP_MANAGED_LOCATIONS;
    public static final String PROP_MANAGED_PHYSICAL_THINGS;

    private static Hashtable locationRestrictions = new Hashtable(1);
    static {
	MY_URI = Location.uAAL_LOCATION_NAMESPACE
		+ "locationConfigurationService";
	PROP_MANAGED_LOCATIONS = Location.uAAL_LOCATION_NAMESPACE
		+ "managedLocations";
	PROP_MANAGED_PHYSICAL_THINGS = Location.uAAL_LOCATION_NAMESPACE
		+ "managedPhysicalThings";
	register(SpaceConfigurationService.class);
	addRestriction(Restriction.getAllValuesRestriction(
		PROP_MANAGED_LOCATIONS, Location.MY_URI),
		new String[] { PROP_MANAGED_LOCATIONS }, locationRestrictions);
	addRestriction(Restriction.getAllValuesRestriction(
		PROP_MANAGED_PHYSICAL_THINGS, PhysicalThing.MY_URI),
		new String[] { PROP_MANAGED_PHYSICAL_THINGS },
		locationRestrictions);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (propURI == null)
	    return null;
	Object r = locationRestrictions.get(propURI);
	if (r instanceof Restriction)
	    return (Restriction) r;
	return Service.getClassRestrictionsOnProperty(propURI);
    }

    public static String getRDFSComment() {
	return "The class of services controlling locations.";
    }

    public static String getRDFSLabel() {
	return "LocationService";
    }

    public SpaceConfigurationService() {
	super();
    }

    public SpaceConfigurationService(String uri) {
	super(uri);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.universAAL.ontology.Service#getClassLevelRestrictions()
     */
    protected Hashtable getClassLevelRestrictions() {
	return locationRestrictions;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType
     * (java.lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return (PROP_MANAGED_LOCATIONS.equals(propURI)) ? PROP_SERIALIZATION_FULL
		: PROP_SERIALIZATION_REDUCED;
    }

    public boolean isWellFormed() {
	return true;
    }
}
