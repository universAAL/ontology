/*
	Copyright 2008-2010 SPIRIT, http://www.spirit-intl.com/
	SPIRIT S.A. E-BUSINESS AND COMMUNICATIONS ENGINEERING 
	
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
	Class.forName("org.universAAL.ontology.profilable.ProfilableEntity");
	Class.forName("org.universAAL.ontology.profilable.User");
	Class.forName("org.universAAL.ontology.profilable.AssistedPerson");
	Class.forName("org.universAAL.ontology.profilable.AALSpace");

	Class.forName("org.universAAL.ontology.profile.Profile");
	Class.forName("org.universAAL.ontology.profile.UserProfile");
	Class.forName("org.universAAL.ontology.profile.DeviceProfile");
	Class.forName("org.universAAL.ontology.profile.AssistedPersonProfile");
	Class.forName("org.universAAL.ontology.profile.AALSpaceProfile");

	Class.forName("org.universAAL.ontology.subprofile.Gender");
	Class.forName("org.universAAL.ontology.subprofile.Language");
	Class.forName("org.universAAL.ontology.subprofile.SubProfile");
	Class.forName("org.universAAL.ontology.subprofile.HealthProfile");
	Class.forName("org.universAAL.ontology.subprofile.MedicationProfile");
	Class.forName("org.universAAL.ontology.subprofile.NutritionalProfile");
	Class
		.forName("org.universAAL.ontology.subprofile.PersonalPreferenceProfile");
	Class.forName("org.universAAL.ontology.subprofile.SocialProfile");
	Class
		.forName("org.universAAL.ontology.subprofile.UserIdentificationProfile");
	Class.forName("org.universAAL.ontology.subprofile.uStoreProfile");
    }

    public void stop(BundleContext arg0) throws Exception {
	// TODO Auto-generated method stub

    }

}
