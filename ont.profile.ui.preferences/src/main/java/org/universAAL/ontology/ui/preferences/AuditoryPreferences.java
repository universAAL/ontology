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


public class AuditoryPreferences extends ManagedIndividual {
  public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
    + "AuditoryPreferences";
  public static final String PROP_SPEECH_RATE = UIPreferencesProfileOntology.NAMESPACE
    + "speechRate";
  public static final String PROP_VOICE_GENDER = UIPreferencesProfileOntology.NAMESPACE
    + "voiceGender";
  public static final String PROP_SYSTEM_SOUNDS = UIPreferencesProfileOntology.NAMESPACE
    + "systemSounds";
  public static final String PROP_VOLUME = UIPreferencesProfileOntology.NAMESPACE
    + "volume";
  public static final String PROP_PITCH = UIPreferencesProfileOntology.NAMESPACE
    + "pitch";
  public static final String PROP_KEY_SOUND = UIPreferencesProfileOntology.NAMESPACE
    + "keySound";


  public AuditoryPreferences () {
    super();
  }
  
  public AuditoryPreferences (String uri) {
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
      && hasProperty(PROP_SPEECH_RATE)
      && hasProperty(PROP_VOICE_GENDER)
      && hasProperty(PROP_SYSTEM_SOUNDS)
      && hasProperty(PROP_VOLUME)
      && hasProperty(PROP_PITCH)
      && hasProperty(PROP_KEY_SOUND);
  }

  public Intensity getVolume() {
    return (Intensity)getProperty(PROP_VOLUME);
  }		

  public void setVolume(Intensity newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_VOLUME, newPropValue);
  }		

  public Intensity getPitch() {
    return (Intensity)getProperty(PROP_PITCH);
  }		

  public void setPitch(Intensity newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_PITCH, newPropValue);
  }		

  public Status getKeySound() {
    return (Status)getProperty(PROP_KEY_SOUND);
  }		

  public void setKeySound(Status newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_KEY_SOUND, newPropValue);
  }		

  public VoiceGender getVoiceGender() {
    return (VoiceGender)getProperty(PROP_VOICE_GENDER);
  }		

  public void setVoiceGender(VoiceGender newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_VOICE_GENDER, newPropValue);
  }		

  public Intensity getSpeechRate() {
    return (Intensity)getProperty(PROP_SPEECH_RATE);
  }		

  public void setSpeechRate(Intensity newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_SPEECH_RATE, newPropValue);
  }		

  public Status getSystemSounds() {
    return (Status)getProperty(PROP_SYSTEM_SOUNDS);
  }		

  public void setSystemSounds(Status newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_SYSTEM_SOUNDS, newPropValue);
  }		
}
