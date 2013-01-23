/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.ui.preferences;

import org.universAAL.middleware.owl.ManagedIndividual;

public class SystemMenuPreferences extends ManagedIndividual {
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "SystemMenuPreferences";
    public static final String PROP_MAIN_MENU_CONFIGURATION = UIPreferencesProfileOntology.NAMESPACE
	    + "mainMenuConfiguration";
    public static final String PROP_MESSAGE_PERSISTANCE = UIPreferencesProfileOntology.NAMESPACE
	    + "messagePersistance";
    public static final String PROP_PENDING_DIALOG_BUILDER = UIPreferencesProfileOntology.NAMESPACE
	    + "pendingDialogBuilder";
    public static final String PROP_PENDING_MESSAGE_BUILDER = UIPreferencesProfileOntology.NAMESPACE
	    + "pendingMessageBuilder";
    public static final String PROP_SEARCH_FEATURE_IS_FIRST = UIPreferencesProfileOntology.NAMESPACE
	    + "searchFeatureIsFirst";

    public SystemMenuPreferences() {
	super();
    }

    public SystemMenuPreferences(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	// TODO Implement or if for Device subclasses: remove
	return 0;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_MAIN_MENU_CONFIGURATION)
		&& hasProperty(PROP_MESSAGE_PERSISTANCE)
		&& hasProperty(PROP_PENDING_DIALOG_BUILDER)
		&& hasProperty(PROP_PENDING_MESSAGE_BUILDER)
		&& hasProperty(PROP_SEARCH_FEATURE_IS_FIRST);
    }

    public MainMenuConfigurationType getMainMenuConfiguration() {
	return (MainMenuConfigurationType) getProperty(PROP_MAIN_MENU_CONFIGURATION);
    }

    public void setMainMenuConfiguration(MainMenuConfigurationType newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_MAIN_MENU_CONFIGURATION, newPropValue);
    }

    public Status getMessagePersistance() {
	return (Status) getProperty(PROP_MESSAGE_PERSISTANCE);
    }

    public void setMessagePersistance(Status newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_MESSAGE_PERSISTANCE, newPropValue);
    }

    public Status getSearchFeatureIsFirst() {
	return (Status) getProperty(PROP_SEARCH_FEATURE_IS_FIRST);
    }

    public void setSearchFeatureIsFirst(Status newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_SEARCH_FEATURE_IS_FIRST, newPropValue);
    }

    public PendingMessageBuilderType getPendingMessageBuilder() {
	return (PendingMessageBuilderType) getProperty(PROP_PENDING_MESSAGE_BUILDER);
    }

    public void setPendingMessageBuilder(PendingMessageBuilderType newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_PENDING_MESSAGE_BUILDER, newPropValue);
    }

    public PendingDialogsBuilderType getPendingDialogBuilder() {
	return (PendingDialogsBuilderType) getProperty(PROP_PENDING_DIALOG_BUILDER);
    }

    public void setPendingDialogBuilder(PendingDialogsBuilderType newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_PENDING_DIALOG_BUILDER, newPropValue);
    }
}
