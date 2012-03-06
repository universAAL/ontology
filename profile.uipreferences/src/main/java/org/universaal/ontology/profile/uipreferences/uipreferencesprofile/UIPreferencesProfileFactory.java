
package org.universaal.ontology.profile.uipreferences.uipreferencesprofile;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universaal.ontology.profile.uipreferences.uipreferencesprofile.owl.InteractionPreferencesProfile;

public class UIPreferencesProfileFactory extends ResourceFactoryImpl {


  public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

	switch (factoryIndex) {
     case 0:
       return new InteractionPreferencesProfile(instanceURI);

	}
	return null;
  }
}
