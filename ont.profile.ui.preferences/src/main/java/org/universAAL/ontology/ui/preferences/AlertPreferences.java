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


public class AlertPreferences extends ManagedIndividual {
  public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
    + "AlertPreferences";
  public static final String PROP_ALERT_OPTION = UIPreferencesProfileOntology.NAMESPACE
    + "alertOption";


  public AlertPreferences () {
    super();
  }
  
  public AlertPreferences (String uri) {
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
	return true 
      && hasProperty(PROP_ALERT_OPTION);
  }

  public AlertType getAlertOption() {
    return (AlertType)getProperty(PROP_ALERT_OPTION);
  }		

  public void setAlertOption(AlertType newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_ALERT_OPTION, newPropValue);
  }		
}
