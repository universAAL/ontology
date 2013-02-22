/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * Licensed under both Apache License, Version 2.0 and MIT License .
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.ui.preferences;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.rdf.Resource;


public class UIPreferencesProfile extends ManagedIndividual {
  public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
    + "UIPreferencesProfile";
  public static final String PROP_INTERACTION_PREFERENCES = UIPreferencesProfileOntology.NAMESPACE
    + "interactionPreferences";
  public static final String PROP_VISUAL_PREFERENCES = UIPreferencesProfileOntology.NAMESPACE
    + "visualPreferences";
  public static final String PROP_SYSTEM_MENU_PREFERENCES = UIPreferencesProfileOntology.NAMESPACE
    + "systemMenuPreferences";
  public static final String PROP_ALERT_PREFERENCES = UIPreferencesProfileOntology.NAMESPACE
    + "alertPreferences";
  public static final String PROP_ADAPTATION_PREFERENCES = UIPreferencesProfileOntology.NAMESPACE
    + "adaptationPreferences";
  public static final String PROP_ACCESS_MODE = UIPreferencesProfileOntology.NAMESPACE
    + "accessMode";
  public static final String PROP_AUDIO_PREFERENCES = UIPreferencesProfileOntology.NAMESPACE
    + "audioPreferences";


  public UIPreferencesProfile () {
    super();
  }
  
  public UIPreferencesProfile (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
      return Resource.PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	return true 
      && hasProperty(PROP_INTERACTION_PREFERENCES)
      && hasProperty(PROP_VISUAL_PREFERENCES)
      && hasProperty(PROP_SYSTEM_MENU_PREFERENCES)
      && hasProperty(PROP_ALERT_PREFERENCES)
      && hasProperty(PROP_ADAPTATION_PREFERENCES)
      && hasProperty(PROP_ACCESS_MODE)
      && hasProperty(PROP_AUDIO_PREFERENCES);
  }

  public AlertPreferences getAlertPreferences() {
    return (AlertPreferences)getProperty(PROP_ALERT_PREFERENCES);
  }		

  public void setAlertPreferences(AlertPreferences newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_ALERT_PREFERENCES, newPropValue);
  }		

  public VisualPreferences getVisualPreferences() {
    return (VisualPreferences)getProperty(PROP_VISUAL_PREFERENCES);
  }		

  public void setVisualPreferences(VisualPreferences newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_VISUAL_PREFERENCES, newPropValue);
  }		

  public AuditoryPreferences getAudioPreferences() {
    return (AuditoryPreferences)getProperty(PROP_AUDIO_PREFERENCES);
  }		

  public void setAudioPreferences(AuditoryPreferences newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_AUDIO_PREFERENCES, newPropValue);
  }		

  public GeneralInteractionPreferences getInteractionPreferences() {
    return (GeneralInteractionPreferences)getProperty(PROP_INTERACTION_PREFERENCES);
  }		

  public void setInteractionPreferences(GeneralInteractionPreferences newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_INTERACTION_PREFERENCES, newPropValue);
  }		

  public AccessMode getAccessMode() {
    return (AccessMode)getProperty(PROP_ACCESS_MODE);
  }		

  public void setAccessMode(AccessMode newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_ACCESS_MODE, newPropValue);
  }		

  public SystemMenuPreferences getSystemMenuPreferences() {
    return (SystemMenuPreferences)getProperty(PROP_SYSTEM_MENU_PREFERENCES);
  }		

  public void setSystemMenuPreferences(SystemMenuPreferences newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_SYSTEM_MENU_PREFERENCES, newPropValue);
  }		

  public String getAdaptationPreferences() {
    return (String)getProperty(PROP_ADAPTATION_PREFERENCES);
  }		

  public void setAdaptationPreferences(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_ADAPTATION_PREFERENCES, newPropValue);
  }		
}
