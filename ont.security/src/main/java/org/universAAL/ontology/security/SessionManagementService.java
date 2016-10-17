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

package org.universAAL.ontology.security;

import java.util.Iterator;
import java.util.List;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.service.CallStatus;
import org.universAAL.middleware.service.DefaultServiceCaller;
import org.universAAL.middleware.service.ServiceRequest;
import org.universAAL.middleware.service.ServiceResponse;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.profile.User;

/**
 * Service Description for checking validity of {@link Session}s.
 * only the session manager should implement profiles for this service.
 * @author amedrano
 *
 */
public class SessionManagementService extends Service {


    public static final String MY_URI = SecurityOntology.NAMESPACE + "SessionService";
    public static final String PROP_USER = SecurityOntology.NAMESPACE + "managesSessionsFor";
	
	/**
	 * Only for serializers.
	 */
	public SessionManagementService() {
	    super();
	}

	/**
	 * @param uri
	 */
	public SessionManagementService(String uri) {
		super(uri);
	}


	/** {@ inheritDoc}	 */
	public String getClassURI() {
		return MY_URI;
	}

	/** {@ inheritDoc}	 */
	public boolean isWellFormed() {
		return super.isWellFormed();
	}

	/** {@ inheritDoc}	 */
	public int getPropSerializationType(String propURI) {
		if (propURI.equals(PROP_USER)){
			return PROP_SERIALIZATION_FULL;
		}
		return super.getPropSerializationType(propURI);
	}

	/*
	 * Helper Methods
	 */
	
	/**
	 * Check whether the given {@link User} has a valid session in the given {@link Device}.
	 * This check is only bound to the time it is call, session may not be valid in near future.
	 * @param mc needed to make the Service call.
	 * @param u the user to be checked
	 * @param d the device where the user might have a session.
	 * @return true if and only if the user should be considered to have a valid session (at the moment of the invocation).
	 */
	public static boolean hasUserValidSession(ModuleContext mc, User u, Device d){
	    ServiceRequest sreq = new ServiceRequest();
	    String usrsOut = SecurityOntology.NAMESPACE + "usersOut";
	    sreq.addRequiredOutput(usrsOut , new String[]{PROP_USER});
	    sreq.addValueFilter(new String[]{PROP_USER},  u);
	    sreq.addValueFilter(new String[]{PROP_USER, SecurityOntology.PROP_SESSION, DeviceBoundSession.PROP_BOUNDED_DEVICE},  d);
	    ServiceResponse sres = new DefaultServiceCaller(mc).call(sreq);
	    if (sres == null || !sres.getCallStatus().equals(CallStatus.succeeded)){
		//By default assume there is no session.
		return false;
	    }
	    List users = sres.getOutput(usrsOut, true);
	    boolean found = false;
	    Iterator it = users.iterator();
	    while (!found && it.hasNext()) {
		found = ((Resource)it.next()).getURI().equals(u.getURI());
	    }
	    return found;
	}
	
	/**
	 * Check whether the given {@link User} has a valid session in the given {@link Location}.
	 * This check is only bound to the time it is call, session may not be valid in near future.
	 * @param mc needed to make the Service call.
	 * @param u the user to be checked
	 * @param l the location where the user might have a session.
	 * @return true if and only if the user should be considered to have a valid session (at the moment of the invocation).
	 */
	public static boolean hasUserValidSession(ModuleContext mc, User u, Location l){
	    ServiceRequest sreq = new ServiceRequest();
	    String usrsOut = SecurityOntology.NAMESPACE + "usersOut";
	    sreq.addRequiredOutput(usrsOut , new String[]{PROP_USER});
	    sreq.addValueFilter(new String[]{PROP_USER},  u);
	    sreq.addValueFilter(new String[]{PROP_USER, SecurityOntology.PROP_SESSION, LocationBoundSession.PROP_BOUNDED_LOCATION},  l);
	    ServiceResponse sres = new DefaultServiceCaller(mc).call(sreq);
	    if (sres == null || !sres.getCallStatus().equals(CallStatus.succeeded)){
		//By default assume there is no session.
		return false;
	    }
	    List users = sres.getOutput(usrsOut, true);
	    boolean found = false;
	    Iterator it = users.iterator();
	    while (!found && it.hasNext()) {
		found = ((Resource)it.next()).getURI().equals(u.getURI());
	    }
	    return found;
	}
}
