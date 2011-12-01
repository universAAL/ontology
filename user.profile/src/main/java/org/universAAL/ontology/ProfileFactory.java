/*	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
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

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.profile.Address;
import org.universAAL.ontology.profile.Astigmatism;
import org.universAAL.ontology.profile.ColorBlindness;
import org.universAAL.ontology.profile.DiaryActivityProfile;
import org.universAAL.ontology.profile.DiaryNutritionalProfile;
import org.universAAL.ontology.profile.ElderlyProfile;
import org.universAAL.ontology.profile.ElderlyUser;
import org.universAAL.ontology.profile.FarSightedness;
import org.universAAL.ontology.profile.HealthProfile;
import org.universAAL.ontology.profile.HearingImpairment;
import org.universAAL.ontology.profile.Illness;
import org.universAAL.ontology.profile.LightSensitivity;
import org.universAAL.ontology.profile.Medicine;
import org.universAAL.ontology.profile.NearSightedness;
import org.universAAL.ontology.profile.PersonalPreferenceProfile;
import org.universAAL.ontology.profile.PhysicalImpairment;
import org.universAAL.ontology.profile.Profile;
import org.universAAL.ontology.profile.PropertyBag;
import org.universAAL.ontology.profile.PropertyEntry;
import org.universAAL.ontology.profile.SightImpairment;
import org.universAAL.ontology.profile.SocialProfile;
import org.universAAL.ontology.profile.SpeakingImpairment;
import org.universAAL.ontology.profile.User;
import org.universAAL.ontology.profile.UserIdentificationProfile;
import org.universAAL.ontology.profile.UserProfile;
import org.universAAL.ontology.profile.service.ProfilingEditorService;
import org.universAAL.ontology.profile.service.ProfilingService;

/**
 * The factory for instantiating objects of the ontology classes.
 * 
 * @author Carsten Stockloew
 */

public class ProfileFactory extends ResourceFactoryImpl {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {
	case 0:
	    return new Profile(instanceURI);
	case 1:
	    return new SightImpairment();
	case 2:
	    return new FarSightedness();
	case 3:
	    return new SpeakingImpairment();
	case 4:
	    return new HearingImpairment();
	case 5:
	    return new ColorBlindness();
	case 6:
	    return new NearSightedness();
	case 7:
	    return new Astigmatism();
	case 8:
	    return new PhysicalImpairment();
	case 9:
	    return new LightSensitivity();
	case 10:
	    return new Illness(instanceURI);
	case 11:
	    return new Medicine(instanceURI);
	case 12:
	    return new Address(instanceURI);
	case 13:
	    HealthProfile hp = new HealthProfile(instanceURI);
	    hp.setIllness(new Illness());
	    hp.setMedicine(new Medicine());
	    return hp;
	case 14:
	    return new PropertyEntry(instanceURI);
	case 15:
	    return new PropertyBag(instanceURI);
	case 16:
	    return new DiaryNutritionalProfile(instanceURI);
	case 17:
	    User u = new User(instanceURI);
	    u.setProfile(new UserProfile());
	    return u;
	case 18:
	    UserIdentificationProfile uiProfile = new UserIdentificationProfile(
		    instanceURI);
	    uiProfile.setAddress(new Address());
	    return uiProfile;
	case 19:
	    UserProfile up = new UserProfile(instanceURI);
	    up.setUserIdentificationProfile(new UserIdentificationProfile());
	    return up;
	case 20:
	    return new SocialProfile(instanceURI);
	case 21:
	    return new DiaryActivityProfile(instanceURI);
	case 22:
	    return new PersonalPreferenceProfile(instanceURI);
	case 23:
	    return new ElderlyProfile(instanceURI);
	case 24:
	    ElderlyUser eu = new ElderlyUser(instanceURI);
	    eu.setProfile(new ElderlyProfile());
	    return eu;
	case 25:
	    return new ProfilingService(instanceURI);
	case 26:
	    return new ProfilingEditorService(instanceURI);
	}

	return null;
    }
}
