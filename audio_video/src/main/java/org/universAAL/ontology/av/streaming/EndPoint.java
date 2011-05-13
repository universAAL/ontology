/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung
	
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

package org.universAAL.ontology.av.streaming;

import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;

/**
 * Ontological representation of a software endpoint in a transmission of TCP/IP
 * data. Methods included in this class are the mandatory ones for representing
 * an ontological concept in Java classes for uAAL. Usually it includes getters
 * and setters for most of its properties.
 * 
 * @author climberg
 * 
 */
public class EndPoint extends ManagedIndividual {

    public static final String MY_URI;
    public static final String PROP_IP;
    public static final String PROP_TCP_PORT;

    static {
	MY_URI = Stream.STREAM_NAMESPACE + "EndPoint";
	PROP_IP = Stream.STREAM_NAMESPACE + "ip";
	PROP_TCP_PORT = Stream.STREAM_NAMESPACE + "tcpPort";
	register(EndPoint.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_IP.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_TCP_PORT.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = ManagedIndividual.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 2];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}

	toReturn[i++] = PROP_IP;
	toReturn[i] = PROP_TCP_PORT;
	return toReturn;
    }

    public static String getRDFSComment() {
	return "The class of EndPoints.";
    }

    public static String getRDFSLabel() {
	return "EndPoint";
    }

    /**
     * default constructor
     */
    public EndPoint() {
	super();
    }

    /**
     * this is a constructor to build an EndPoint with a special IP and TCP port
     * 
     * @param ip
     * @param port
     */
    public EndPoint(String ip, int port) {
	super();
	setProperty(EndPoint.PROP_IP, ip);
	setProperty(EndPoint.PROP_TCP_PORT, new Integer(port));
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    // removed soon
    public boolean isWellFormed() {
	return true;
    }

    public String getIP() {
	return (String) getProperty(PROP_IP);
    }

    public int getPort() {
	return ((Integer) getProperty(PROP_TCP_PORT)).intValue();
    }

}
