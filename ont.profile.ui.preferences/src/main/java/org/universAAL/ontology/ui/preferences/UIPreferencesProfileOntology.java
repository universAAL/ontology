/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 *	
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *	
 * http://www.apache.org/licenses/LICENSE-2.0
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.ui.preferences;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.owl.PrivateResource;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.middleware.ui.owl.Modality;
import org.universAAL.ontology.UIPreferencesProfileFactory;
import org.universAAL.ontology.language.Language;
import org.universAAL.ontology.language.LanguageOntology;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.profile.SubProfile;
import org.universAAL.ontology.profile.Profile;
import org.universAAL.ontology.profile.UserProfile;
import org.universAAL.ontology.ui.preferences.service.UIPreferencesService;

/**
 * @author eandgrg
 * 
 */
public final class UIPreferencesProfileOntology extends Ontology {

    private static UIPreferencesProfileFactory factory = new UIPreferencesProfileFactory();
    public static final String NAMESPACE = "http://ontology.universaal.org/InteractionPreferencesProfile.owl#";

    // Extend UserProfile
    public static final String PROP_INTERACTION_PREF_PROFILE = Profile.PROP_HAS_SUB_PROFILE
	    + "UIPreferences";

    public UIPreferencesProfileOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("User Interaction preferences of a User based on ETSI ES 746 standard (Personalization and user profile management) and ES 202 642 draft (Personalization of eHealth systems)");
	r.setResourceLabel("uipreferences");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(LocationOntology.NAMESPACE);
	addImport(LanguageOntology.NAMESPACE);

	// ******* Declaration of enumeration classes of the ontology ******* //

	OntClassInfoSetup oci_PendingMessageBuilderType = createNewAbstractOntClassInfo(PendingMessageBuilderType.MY_URI);
	OntClassInfoSetup oci_MainMenuConfigurationType = createNewAbstractOntClassInfo(MainMenuConfigurationType.MY_URI);
	OntClassInfoSetup oci_ContentDensityType = createNewAbstractOntClassInfo(ContentDensityType.MY_URI);
	OntClassInfoSetup oci_Size = createNewAbstractOntClassInfo(Size.MY_URI);
	OntClassInfoSetup oci_Intensity = createNewAbstractOntClassInfo(Intensity.MY_URI);
	OntClassInfoSetup oci_AlertType = createNewAbstractOntClassInfo(AlertType.MY_URI);
	OntClassInfoSetup oci_ColorType = createNewAbstractOntClassInfo(ColorType.MY_URI);
	OntClassInfoSetup oci_GenericFontFamily = createNewAbstractOntClassInfo(GenericFontFamily.MY_URI);
	OntClassInfoSetup oci_WindowLayoutType = createNewAbstractOntClassInfo(WindowLayoutType.MY_URI);
	OntClassInfoSetup oci_Status = createNewAbstractOntClassInfo(Status.MY_URI);
	OntClassInfoSetup oci_PendingDialogsBuilderType = createNewAbstractOntClassInfo(PendingDialogsBuilderType.MY_URI);
	OntClassInfoSetup oci_Gender = createNewAbstractOntClassInfo(VoiceGender.MY_URI);

	// ******* Declaration of regular classes of the ontology ******* //
	OntClassInfoSetup oci_VisualPreferences = createNewOntClassInfo(
		VisualPreferences.MY_URI, factory, 0);
	OntClassInfoSetup oci_SystemMenuPreferences = createNewOntClassInfo(
		SystemMenuPreferences.MY_URI, factory, 1);
	OntClassInfoSetup oci_AccessMode = createNewOntClassInfo(
		AccessMode.MY_URI, factory, 2);
	OntClassInfoSetup oci_AlertPreferences = createNewOntClassInfo(
		AlertPreferences.MY_URI, factory, 3);
	OntClassInfoSetup oci_GeneralInteractionPreferences = createNewOntClassInfo(
		GeneralInteractionPreferences.MY_URI, factory, 4);
	OntClassInfoSetup oci_AuditoryPreferences = createNewOntClassInfo(
		AuditoryPreferences.MY_URI, factory, 5);
	OntClassInfoSetup oci_UIPreferences = createNewOntClassInfo(
		UIPreferencesSubProfile.MY_URI, factory, 6);
	OntClassInfoSetup oci_UIPreferencesService = createNewOntClassInfo(
		UIPreferencesService.MY_URI, factory, 7);

	// ******* Add content to enumeration classes of the ontology ******* //

	oci_PendingMessageBuilderType.setResourceComment("");
	oci_PendingMessageBuilderType
		.setResourceLabel("PendingMessageBuilderType");
	oci_PendingMessageBuilderType
		.toEnumeration(new ManagedIndividual[] { PendingMessageBuilderType.simpleTable });

	oci_MainMenuConfigurationType.setResourceComment("");
	oci_MainMenuConfigurationType
		.setResourceLabel("MainMenuConfigurationType");
	oci_MainMenuConfigurationType.addSuperClass(ManagedIndividual.MY_URI);
	oci_MainMenuConfigurationType.toEnumeration(new ManagedIndividual[] {
		MainMenuConfigurationType.classic,
		MainMenuConfigurationType.smart,
		MainMenuConfigurationType.taskBar });

	oci_ContentDensityType.setResourceComment("");
	oci_ContentDensityType.setResourceLabel("ContentDensityType");
	oci_ContentDensityType.addSuperClass(ManagedIndividual.MY_URI);
	oci_ContentDensityType.toEnumeration(new ManagedIndividual[] {
		ContentDensityType.overview, ContentDensityType.detailed });

	oci_Size.setResourceComment("");
	oci_Size.setResourceLabel("Size");
	oci_Size.addSuperClass(ManagedIndividual.MY_URI);
	oci_Size.toEnumeration(new ManagedIndividual[] { Size.small,
		Size.medium, Size.large });

	oci_Intensity.setResourceComment("");
	oci_Intensity.setResourceLabel("Intensity");
	oci_Intensity.addSuperClass(ManagedIndividual.MY_URI);
	oci_Intensity.toEnumeration(new ManagedIndividual[] { Intensity.low,
		Intensity.medium, Intensity.high });

	oci_AlertType.setResourceComment("");
	oci_AlertType.setResourceLabel("AlertType");
	oci_AlertType.addSuperClass(ManagedIndividual.MY_URI);
	oci_AlertType.toEnumeration(new ManagedIndividual[] {
		AlertType.visualOnly, AlertType.audioOnly,
		AlertType.visualAndAudio });

	oci_ColorType.setResourceComment("");
	oci_ColorType.setResourceLabel("ColorType");
	oci_ColorType.addSuperClass(ManagedIndividual.MY_URI);
	oci_ColorType.toEnumeration(new ManagedIndividual[] { ColorType.white,
		ColorType.black, ColorType.lightGray, ColorType.darkGrey,
		ColorType.lightBlue, ColorType.darkBlue, ColorType.lightGreen,
		ColorType.darkGreen, ColorType.lightRed, ColorType.darkRed,
		ColorType.orange, ColorType.yellow, ColorType.cyan,
		ColorType.purple, ColorType.magenta, ColorType.pink });

	oci_GenericFontFamily.setResourceComment("");
	oci_GenericFontFamily.setResourceLabel("GenericFontFamily");
	oci_GenericFontFamily.addSuperClass(ManagedIndividual.MY_URI);
	oci_GenericFontFamily.toEnumeration(new ManagedIndividual[] {
		GenericFontFamily.serif, GenericFontFamily.sans_serif,
		GenericFontFamily.cursive, GenericFontFamily.fantasy,
		GenericFontFamily.monospace });

	oci_WindowLayoutType.setResourceComment("");
	oci_WindowLayoutType.setResourceLabel("WindowLayoutType");
	oci_WindowLayoutType.addSuperClass(ManagedIndividual.MY_URI);
	oci_WindowLayoutType.toEnumeration(new ManagedIndividual[] {
		WindowLayoutType.tiled, WindowLayoutType.overlap });

	oci_Status.setResourceComment("");
	oci_Status.setResourceLabel("Status");
	oci_Status.addSuperClass(ManagedIndividual.MY_URI);
	oci_Status.toEnumeration(new ManagedIndividual[] { Status.on,
		Status.off });

	oci_PendingDialogsBuilderType.setResourceComment("");
	oci_PendingDialogsBuilderType
		.setResourceLabel("PendingDialogsBuilderType");
	oci_PendingDialogsBuilderType.toEnumeration(new ManagedIndividual[] {
		PendingDialogsBuilderType.table,
		PendingDialogsBuilderType.buttons });

	oci_Gender.setResourceComment("");
	oci_Gender.setResourceLabel("VoiceGender");
	oci_Gender.addSuperClass(ManagedIndividual.MY_URI);
	oci_Gender.toEnumeration(new ManagedIndividual[] { VoiceGender.male,
		VoiceGender.female });

	// ******* Add content to regular classes of the ontology ******* //
	oci_VisualPreferences.setResourceComment("");
	oci_VisualPreferences.setResourceLabel("VisualPreferences");
	oci_VisualPreferences.addSuperClass(ManagedIndividual.MY_URI);
	oci_VisualPreferences.addSuperClass(PrivateResource.MY_URI);

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_BACKGROUND_COLOR).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_BACKGROUND_COLOR,
			ColorType.MY_URI, 1, 1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_FLASHING_RESOURCES).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_FLASHING_RESOURCES,
			Status.MY_URI, 1, 1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_DAY_NIGHT_MODE).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_DAY_NIGHT_MODE, Status.MY_URI,
			1, 1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_HIGHLIGHT_COLOR).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_HIGHLIGHT_COLOR,
			ColorType.MY_URI, 1, 1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_WINDOW_LAYOUT).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_WINDOW_LAYOUT,
			WindowLayoutType.MY_URI, 1, 1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_FONT_FAMILY).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_FONT_FAMILY,
			GenericFontFamily.MY_URI, 1, 1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_BRIGHTNESS).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_BRIGHTNESS, Intensity.MY_URI, 1,
			1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_COMPONENT_SPACING).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_COMPONENT_SPACING,
			Intensity.MY_URI, 1, 1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_CONTENT_CONTRAST).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_CONTENT_CONTRAST,
			Intensity.MY_URI, 1, 1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_SCREEN_RESOLUTION).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_SCREEN_RESOLUTION,
			Intensity.MY_URI, 1, 1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_CURSOR_SIZE).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_CURSOR_SIZE, Size.MY_URI, 1, 1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_SCREEN_SAVER_USAGE).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_SCREEN_SAVER_USAGE,
			Status.MY_URI, 1, 1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_FONT_COLOR).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_FONT_COLOR, ColorType.MY_URI, 1,
			1));

	oci_VisualPreferences.addObjectProperty(
		VisualPreferences.PROP_FONT_SIZE).setFunctional();
	oci_VisualPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			VisualPreferences.PROP_FONT_SIZE, Size.MY_URI, 1, 1));

	oci_SystemMenuPreferences.setResourceComment("");
	oci_SystemMenuPreferences.setResourceLabel("SystemMenuPreferences");
	oci_SystemMenuPreferences.addSuperClass(ManagedIndividual.MY_URI);
	oci_SystemMenuPreferences.addSuperClass(PrivateResource.MY_URI);
	oci_SystemMenuPreferences.addObjectProperty(
		SystemMenuPreferences.PROP_MAIN_MENU_CONFIGURATION)
		.setFunctional();
	oci_SystemMenuPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SystemMenuPreferences.PROP_MAIN_MENU_CONFIGURATION,
			MainMenuConfigurationType.MY_URI, 1, 1));

	oci_SystemMenuPreferences.addObjectProperty(
		SystemMenuPreferences.PROP_UIREQUEST_PERSISTANCE)
		.setFunctional();
	oci_SystemMenuPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SystemMenuPreferences.PROP_UIREQUEST_PERSISTANCE,
			Status.MY_URI, 1, 1));

	oci_SystemMenuPreferences.addObjectProperty(
		SystemMenuPreferences.PROP_PENDING_DIALOG_BUILDER)
		.setFunctional();
	oci_SystemMenuPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SystemMenuPreferences.PROP_PENDING_DIALOG_BUILDER,
			PendingDialogsBuilderType.MY_URI, 1, 1));

	oci_SystemMenuPreferences.addObjectProperty(
		SystemMenuPreferences.PROP_PENDING_MESSAGE_BUILDER)
		.setFunctional();
	oci_SystemMenuPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SystemMenuPreferences.PROP_PENDING_MESSAGE_BUILDER,
			PendingMessageBuilderType.MY_URI, 1, 1));

	oci_SystemMenuPreferences.addObjectProperty(
		SystemMenuPreferences.PROP_SEARCH_FEATURE_IS_FIRST)
		.setFunctional();
	oci_SystemMenuPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SystemMenuPreferences.PROP_SEARCH_FEATURE_IS_FIRST,
			Status.MY_URI, 1, 1));

	oci_AccessMode.setResourceComment("");
	oci_AccessMode.setResourceLabel("AccessMode");
	oci_AccessMode.addSuperClass(ManagedIndividual.MY_URI);
	oci_AccessMode.addSuperClass(PrivateResource.MY_URI);
	oci_AccessMode.addObjectProperty(AccessMode.PROP_OLFACTORY_MODE_STATUS)
		.setFunctional();
	oci_AccessMode.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AccessMode.PROP_OLFACTORY_MODE_STATUS, Status.MY_URI,
			1, 1));

	oci_AccessMode.addObjectProperty(AccessMode.PROP_AUDITORY_MODE_STATUS)
		.setFunctional();
	oci_AccessMode.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AccessMode.PROP_AUDITORY_MODE_STATUS, Status.MY_URI, 1,
			1));

	oci_AccessMode.addObjectProperty(AccessMode.PROP_VISUAL_MODE_STATUS);
	oci_AccessMode
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				AccessMode.PROP_VISUAL_MODE_STATUS,
				Status.MY_URI, 1, 1));

	oci_AccessMode.addObjectProperty(AccessMode.PROP_TEXTUAL_MODE_STATUS)
		.setFunctional();
	oci_AccessMode.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AccessMode.PROP_TEXTUAL_MODE_STATUS, Status.MY_URI, 1,
			1));

	oci_AccessMode.addObjectProperty(AccessMode.PROP_TACTILE_MODE_STATUS)
		.setFunctional();
	oci_AccessMode.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AccessMode.PROP_TACTILE_MODE_STATUS, Status.MY_URI, 1,
			1));

	oci_AlertPreferences.setResourceComment("");
	oci_AlertPreferences.setResourceLabel("AlertPreferences");
	oci_AlertPreferences.addSuperClass(ManagedIndividual.MY_URI);
	oci_AlertPreferences.addSuperClass(PrivateResource.MY_URI);
	oci_AlertPreferences.addObjectProperty(
		AlertPreferences.PROP_ALERT_OPTION).setFunctional();
	oci_AlertPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AlertPreferences.PROP_ALERT_OPTION, AlertType.MY_URI,
			1, 1));

	oci_GeneralInteractionPreferences.setResourceComment("");
	oci_GeneralInteractionPreferences
		.setResourceLabel("GeneralInteractionPreferences");
	oci_GeneralInteractionPreferences
		.addSuperClass(ManagedIndividual.MY_URI);
	oci_GeneralInteractionPreferences.addSuperClass(PrivateResource.MY_URI);
	oci_GeneralInteractionPreferences.addObjectProperty(
		GeneralInteractionPreferences.PROP_SECONDARY_LANGUAGE)
		.setFunctional();
	oci_GeneralInteractionPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			GeneralInteractionPreferences.PROP_SECONDARY_LANGUAGE,
			Language.MY_URI, 1, 1));

	oci_GeneralInteractionPreferences.addObjectProperty(
		GeneralInteractionPreferences.PROP_PREFERRED_MODALITY)
		.setFunctional();
	oci_GeneralInteractionPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			GeneralInteractionPreferences.PROP_PREFERRED_MODALITY,
			Modality.MY_URI, 1, 1));

	oci_GeneralInteractionPreferences.addObjectProperty(
		GeneralInteractionPreferences.PROP_CONTENT_DENSITY)
		.setFunctional();
	oci_GeneralInteractionPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			GeneralInteractionPreferences.PROP_CONTENT_DENSITY,
			ContentDensityType.MY_URI, 1, 1));

	oci_GeneralInteractionPreferences.addObjectProperty(
		GeneralInteractionPreferences.PROP_SECONDARY_MODALITY)
		.setFunctional();
	oci_GeneralInteractionPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			GeneralInteractionPreferences.PROP_SECONDARY_MODALITY,
			Modality.MY_URI, 1, 1));

	oci_GeneralInteractionPreferences.addObjectProperty(
		GeneralInteractionPreferences.PROP_PREFERRED_LANGUAGE)
		.setFunctional();
	oci_GeneralInteractionPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			GeneralInteractionPreferences.PROP_PREFERRED_LANGUAGE,
			Language.MY_URI, 1, 1));

	oci_AuditoryPreferences.setResourceComment("");
	oci_AuditoryPreferences.setResourceLabel("AuditoryPreferences");
	oci_AuditoryPreferences.addSuperClass(ManagedIndividual.MY_URI);
	oci_AuditoryPreferences.addSuperClass(PrivateResource.MY_URI);
	oci_AuditoryPreferences.addObjectProperty(
		AuditoryPreferences.PROP_SPEECH_RATE).setFunctional();
	oci_AuditoryPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AuditoryPreferences.PROP_SPEECH_RATE, Intensity.MY_URI,
			1, 1));

	oci_AuditoryPreferences.addObjectProperty(
		AuditoryPreferences.PROP_VOICE_GENDER).setFunctional();
	oci_AuditoryPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AuditoryPreferences.PROP_VOICE_GENDER,
			VoiceGender.MY_URI, 1, 1));

	oci_AuditoryPreferences.addObjectProperty(
		AuditoryPreferences.PROP_SYSTEM_SOUNDS).setFunctional();
	oci_AuditoryPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AuditoryPreferences.PROP_SYSTEM_SOUNDS, Status.MY_URI,
			1, 1));

	oci_AuditoryPreferences.addObjectProperty(
		AuditoryPreferences.PROP_VOLUME).setFunctional();
	oci_AuditoryPreferences
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				AuditoryPreferences.PROP_VOLUME,
				Intensity.MY_URI, 1, 1));

	oci_AuditoryPreferences.addObjectProperty(
		AuditoryPreferences.PROP_PITCH).setFunctional();
	oci_AuditoryPreferences
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				AuditoryPreferences.PROP_PITCH,
				Intensity.MY_URI, 1, 1));

	oci_AuditoryPreferences.addObjectProperty(
		AuditoryPreferences.PROP_KEY_SOUND).setFunctional();
	oci_AuditoryPreferences
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				AuditoryPreferences.PROP_KEY_SOUND,
				Status.MY_URI, 1, 1));

	oci_UIPreferences.setResourceComment("");
	oci_UIPreferences.setResourceLabel("UIPreferencesSubProfile");
	// UIPreferencesSubProfile is SubProfile
	oci_UIPreferences.addSuperClass(SubProfile.MY_URI);
	oci_UIPreferences.addObjectProperty(
		UIPreferencesSubProfile.PROP_INTERACTION_PREFERENCES)
		.setFunctional();
	oci_UIPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UIPreferencesSubProfile.PROP_INTERACTION_PREFERENCES,
			GeneralInteractionPreferences.MY_URI, 1, 1));

	oci_UIPreferences.addObjectProperty(
		UIPreferencesSubProfile.PROP_VISUAL_PREFERENCES)
		.setFunctional();
	oci_UIPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UIPreferencesSubProfile.PROP_VISUAL_PREFERENCES,
			VisualPreferences.MY_URI, 1, 1));

	oci_UIPreferences.addObjectProperty(
		UIPreferencesSubProfile.PROP_SYSTEM_MENU_PREFERENCES)
		.setFunctional();
	oci_UIPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UIPreferencesSubProfile.PROP_SYSTEM_MENU_PREFERENCES,
			SystemMenuPreferences.MY_URI, 1, 1));

	oci_UIPreferences.addObjectProperty(
		UIPreferencesSubProfile.PROP_ALERT_PREFERENCES).setFunctional();
	oci_UIPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UIPreferencesSubProfile.PROP_ALERT_PREFERENCES,
			AlertPreferences.MY_URI, 0, 1));

	oci_UIPreferences.addObjectProperty(
		UIPreferencesSubProfile.PROP_ACCESS_MODE).setFunctional();
	oci_UIPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UIPreferencesSubProfile.PROP_ACCESS_MODE,
			AccessMode.MY_URI, 1, 1));

	oci_UIPreferences.addObjectProperty(
		UIPreferencesSubProfile.PROP_AUDIO_PREFERENCES).setFunctional();
	oci_UIPreferences.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UIPreferencesSubProfile.PROP_AUDIO_PREFERENCES,
			AuditoryPreferences.MY_URI, 1, 1));

	// service
	oci_UIPreferencesService
		.setResourceComment("The class of services controling the UI Preferences");
	oci_UIPreferencesService.setResourceLabel("UI Preferences Service");
	oci_UIPreferencesService.addSuperClass(Service.MY_URI);
	oci_UIPreferencesService.addObjectProperty(
		UIPreferencesService.PROP_CONTROLS).setFunctional();
	oci_UIPreferencesService.addRestriction(MergedRestriction
		.getAllValuesRestriction(UIPreferencesService.PROP_CONTROLS,
			UIPreferencesSubProfile.MY_URI));

	// Extend UserProfile
	OntClassInfoSetup oci = extendExistingOntClassInfo(UserProfile.MY_URI);
	oci.addObjectProperty(PROP_INTERACTION_PREF_PROFILE).addSuperProperty(
		Profile.PROP_HAS_SUB_PROFILE);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PROP_INTERACTION_PREF_PROFILE,
			UIPreferencesSubProfile.MY_URI, 0, 1));

    }
}
