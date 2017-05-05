/*******************************************************************************
 * Copyright 2013 Universidad Politécnica de Madrid
 * Copyright 2013 Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
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
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.security.AccessRight;
import org.universAAL.ontology.security.Anonymizable;
import org.universAAL.ontology.security.AnonymizationService;
import org.universAAL.ontology.security.AuthenticationService;
import org.universAAL.ontology.security.AuthorizationService;
import org.universAAL.ontology.security.Credentials;
import org.universAAL.ontology.security.DelegationForm;
import org.universAAL.ontology.security.DeviceBoundSession;
import org.universAAL.ontology.security.LocationBoundSession;
import org.universAAL.ontology.security.MultifactorCredentials;
import org.universAAL.ontology.security.OneTimePassword;
import org.universAAL.ontology.security.Password;
import org.universAAL.ontology.security.Role;
import org.universAAL.ontology.security.RoleManagementService;
import org.universAAL.ontology.security.SecuritySubprofile;
import org.universAAL.ontology.security.Session;
import org.universAAL.ontology.security.SessionManagementService;
import org.universAAL.ontology.security.UserPasswordCredentials;

/**
 * @author amedrano
 * 
 */
public class SecurityFactory implements ResourceFactory {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {
	case 0:
	    return new UserPasswordCredentials(instanceURI);
	case 1:
	    return new DeviceBoundSession(instanceURI);
	case 2:
	    return new LocationBoundSession(instanceURI);
	case 3:
	    return new SessionManagementService(instanceURI);
	case 4: 
	    return new AuthenticationService(instanceURI);
	case 5:
	    return new SecuritySubprofile(instanceURI);
	case 6:
		return new MultifactorCredentials(instanceURI);
	case 7:
		return new Password(instanceURI);
	case 8:
		return new OneTimePassword(instanceURI);
	case 9:
		return new Role(instanceURI);
	case 10:
		return new AccessRight(instanceURI);
	case 11:
		return new AuthorizationService(instanceURI);
	case 12:
		return new DelegationForm(instanceURI);
	case 13:
		return new RoleManagementService(instanceURI);
	case 14:
		return new AnonymizationService(instanceURI);
	case 15:
		return new Anonymizable(instanceURI);
	case 16:
		return new Credentials(instanceURI);
	case 17:
		return new Session(instanceURI);
	}
	return null;
    }
}
