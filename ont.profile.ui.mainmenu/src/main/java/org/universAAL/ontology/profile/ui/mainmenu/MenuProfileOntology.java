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
package org.universAAL.ontology.profile.ui.mainmenu;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.ontology.UIMainMenuProfileFactory;
import org.universAAL.ontology.profile.Profile;
import org.universAAL.ontology.profile.ProfileOntology;
import org.universAAL.ontology.profile.SubProfile;
import org.universAAL.ontology.profile.User;
import org.universAAL.ontology.profile.UserProfile;

public final class MenuProfileOntology extends Ontology {

    private static UIMainMenuProfileFactory factory = new UIMainMenuProfileFactory();
    public static final String NAMESPACE = "http://ontology.universaal.org/UIMainMenuProfile.owl#";

    public static final String PROP_UI_MAINMENU_PROFILE = Profile.PROP_HAS_SUB_PROFILE
	    + "hasUIMainMenu";

    public static User defaultUser ;

    public MenuProfileOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("A profile describing the main menu shown by the user interaction framework.");
	r.setResourceLabel("UI Main Menu Profile");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ProfileOntology.NAMESPACE);

	defaultUser = new User(NAMESPACE + "defaultUser");
	
	// ******* Declaration of regular classes of the ontology ******* //
	OntClassInfoSetup oci;

	oci = createNewOntClassInfo(MenuEntry.MY_URI, factory, 1);
	oci.setResourceComment("");
	oci.setResourceLabel("Menu Entry");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addObjectProperty(MenuEntry.PROP_VENDOR).setFunctional();
	oci.addObjectProperty(MenuEntry.PROP_SERVICE_CLASS).setFunctional();
	oci.addObjectProperty(MenuEntry.PROP_PATH);
	oci.addRestriction(MergedRestriction.getCardinalityRestriction(
		MenuEntry.PROP_VENDOR, 1, 1));
	oci.addRestriction(MergedRestriction.getCardinalityRestriction(
		MenuEntry.PROP_SERVICE_CLASS, 1, 1));

	oci = createNewOntClassInfo(MenuProfile.MY_URI, factory, 0);
	oci.setResourceComment("");
	oci.setResourceLabel("Main Menu");
	oci.addSuperClass(SubProfile.MY_URI);
	oci.addObjectProperty(MenuProfile.PROP_ENTRY);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		MenuProfile.PROP_ENTRY, MenuEntry.MY_URI));

	// Extend UserProfile
	oci = extendExistingOntClassInfo(UserProfile.MY_URI);
	oci.addObjectProperty(PROP_UI_MAINMENU_PROFILE).addSuperProperty(
		Profile.PROP_HAS_SUB_PROFILE);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PROP_UI_MAINMENU_PROFILE, MenuProfile.MY_URI, 0, 1));

	// extend User
	oci = extendExistingOntClassInfo(User.MY_URI);
	oci.addInstance(defaultUser);
    }
}