/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	Copyright 2008-2014 Forschungszentrum Informatik FZI, http://www.fzi.de
	Copyright 2008-2010 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute of Computer Graphics Research 
	
	
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

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.phThing.PhysicalThing;
import org.universAAL.ontology.profile.*;
import org.universAAL.ontology.profile.service.ProfilingEditorService;
import org.universAAL.ontology.profile.service.ProfilingService;

/**
 * The Ontology for Profiling.
 * 
 * @author Carsten Stockloew
 * @author Alvaro Fides
 */

public final class ProfileOntology extends Ontology {

    private static ProfileFactory factory = new ProfileFactory();

    public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX
	    + "Profile.owl#";

    public ProfileOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("The upper ontology defining the concepts representing" +
			" the users of the system, the physical components of it," +
			" and their characteristics as profiles.");
	r.setResourceLabel("Profile");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);

	OntClassInfoSetup oci;

	oci = extendExistingOntClassInfo(PhysicalThing.MY_URI);
	oci = extendExistingOntClassInfo(ManagedIndividual.MY_URI);

	// SubProfile
	oci = createNewAbstractOntClassInfo(SubProfile.MY_URI);
	oci.setResourceComment("A SubProfile, for setting additional characteristics");
	oci.setResourceLabel("Sub Profile");
	oci.addSuperClass(ManagedIndividual.MY_URI);

	// Profile
	oci = createNewAbstractOntClassInfo(Profile.MY_URI);
	oci.setResourceComment("A Profile, for setting characteristics");
	oci.setResourceLabel("Profile");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addObjectProperty(Profile.PROP_HAS_SUB_PROFILE).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Profile.PROP_HAS_SUB_PROFILE, SubProfile.MY_URI, 0, 1));

	// AALSpaceProfile
	oci = createNewOntClassInfo(AALSpaceProfile.MY_URI, factory, 5);
	oci.setResourceComment("Profile of a AAL space");
	oci.setResourceLabel("AAL Space Profile");
	oci.addSuperClass(Profile.MY_URI);

	// AALServiceProfile
	oci = createNewOntClassInfo(AALServiceProfile.MY_URI, factory, 6);
	oci.setResourceComment("Profile of a AAL service");
	oci.setResourceLabel("AAL Service Profile");
	oci.addSuperClass(Profile.MY_URI);

	// UserProfile
	oci = createNewOntClassInfo(UserProfile.MY_URI, factory, 7);
	oci.setResourceComment("Profile of a user");
	oci.setResourceLabel("User Profile");
	oci.addSuperClass(Profile.MY_URI);

	// APProfile
	oci = createNewOntClassInfo(AssistedPersonProfile.MY_URI, factory, 8);
	oci.setResourceComment("Profile of an assisted person");
	oci.setResourceLabel("Assisted Person Profile");
	oci.addSuperClass(UserProfile.MY_URI);

	// CaregiverProfile
	oci = createNewOntClassInfo(CaregiverProfile.MY_URI, factory, 9);
	oci.setResourceComment("Profile of caregiver to the assisted person");
	oci.setResourceLabel("Caregiver Profile");
	oci.addSuperClass(UserProfile.MY_URI);

	// Profilable
	oci = createNewAbstractOntClassInfo(Profilable.MY_URI);
	oci.setResourceComment("Identifies concepts that can have profiles");
	oci.setResourceLabel("Profilable");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addObjectProperty(Profilable.PROP_HAS_PROFILE);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestriction(
			Profilable.PROP_HAS_PROFILE, Profile.MY_URI));

	// AALService
	oci = createNewOntClassInfo(AALService.MY_URI, factory, 0);
	oci.setResourceComment("An AAL Service");
	oci.setResourceLabel("AAL Service");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addSuperClass(Profilable.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Profilable.PROP_HAS_PROFILE, AALServiceProfile.MY_URI,
			0, 1));

	// AALSpace
	oci = createNewOntClassInfo(AALSpace.MY_URI, factory, 1);
	oci.setResourceComment("An AAL Space");
	oci.setResourceLabel("AAL Space");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addSuperClass(Profilable.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Profilable.PROP_HAS_PROFILE, AALSpaceProfile.MY_URI, 0,
			1));

	// User
	oci = createNewOntClassInfo(User.MY_URI, factory, 2);
	oci.setResourceComment("A human user");
	oci.setResourceLabel("User");
	oci.addSuperClass(PhysicalThing.MY_URI);
	oci.addSuperClass(Profilable.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Profilable.PROP_HAS_PROFILE, UserProfile.MY_URI, 0, 1));

	// AP
	oci = createNewOntClassInfo(AssistedPerson.MY_URI, factory, 3);
	oci.setResourceComment("The assisted person that is the end user of the system");
	oci.setResourceLabel("Assisted Person");
	oci.addSuperClass(User.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Profilable.PROP_HAS_PROFILE,
			AssistedPersonProfile.MY_URI, 0, 1));

	// Caregiver
	oci = createNewOntClassInfo(Caregiver.MY_URI, factory, 4);
	oci.setResourceComment("Caregiver to the assisted person");
	oci.setResourceLabel("Caregiver");
	oci.addSuperClass(User.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Profilable.PROP_HAS_PROFILE, CaregiverProfile.MY_URI,
			0, 1));

	// load ProfilingService
	oci = createNewOntClassInfo(ProfilingService.MY_URI, factory, 10);
	oci.setResourceComment("The class of services controling Profiling.");
	oci.setResourceLabel("Profiling Service Controller");
	oci.addSuperClass(Service.MY_URI);
	oci.addObjectProperty(ProfilingService.PROP_CONTROLS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ProfilingService.PROP_CONTROLS, Profilable.MY_URI));

	// load ProfilingEditorService
	oci = createNewOntClassInfo(ProfilingEditorService.MY_URI, factory, 11);
	oci.setResourceComment("The class of services controling Profile Editor.");
	oci.setResourceLabel("Profile Editor Service Controller");
	oci.addSuperClass(Service.MY_URI);
	oci.addObjectProperty(ProfilingEditorService.PROP_CONTROLS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ProfilingEditorService.PROP_CONTROLS, Profilable.MY_URI));
    }
}
