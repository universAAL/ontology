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
	Class.forName("org.universAAL.ontology.profile.Address");
	Class.forName("org.universAAL.ontology.profile.Astigmatism");
	Class.forName("org.universAAL.ontology.profile.ColorBlindness");
	Class.forName("org.universAAL.ontology.profile.ContactType");
	Class.forName("org.universAAL.ontology.profile.DiaryActivityProfile");
	Class
		.forName("org.universAAL.ontology.profile.DiaryNutritionalProfile");
	Class.forName("org.universAAL.ontology.profile.ElderlyUser");
	Class.forName("org.universAAL.ontology.profile.ElderlyProfile");
	Class.forName("org.universAAL.ontology.profile.ExerciseType");
	Class.forName("org.universAAL.ontology.profile.FarSightedness");
	Class.forName("org.universAAL.ontology.profile.HealthProfile");
	Class.forName("org.universAAL.ontology.profile.HearingImpairment");
	Class.forName("org.universAAL.ontology.profile.Illness");
	Class.forName("org.universAAL.ontology.profile.LightSensitivity");
	Class.forName("org.universAAL.ontology.profile.Medicine");
	Class.forName("org.universAAL.ontology.profile.NearSightedness");
	Class
		.forName("org.universAAL.ontology.profile.PersonalPreferenceProfile");
	Class.forName("org.universAAL.ontology.profile.PhysicalImpairment");
	Class.forName("org.universAAL.ontology.profile.ProfileProperty");
	Class.forName("org.universAAL.ontology.profile.PropertyBag");
	Class.forName("org.universAAL.ontology.profile.PropertyEntry");
	Class.forName("org.universAAL.ontology.profile.Sex");
	Class.forName("org.universAAL.ontology.profile.SleepingState");
	Class.forName("org.universAAL.ontology.profile.SocialProfile");
	Class.forName("org.universAAL.ontology.profile.SpeakingImpairment");
	Class
		.forName("org.universAAL.ontology.profile.UserIdentificationProfile");
	Class.forName("org.universAAL.ontology.profile.UserPosture");
	Class.forName("org.universAAL.ontology.profile.UserRole");
	Class
		.forName("org.universAAL.ontology.profile.service.ProfilingEditorService");
	Class
		.forName("org.universAAL.ontology.profile.service.ProfilingService");
    }

    public void stop(BundleContext arg0) throws Exception {
	// TODO Auto-generated method stub

    }

}
