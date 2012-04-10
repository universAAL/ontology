/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	
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
package org.universAAL.context.che.ontology;

import org.universAAL.middleware.service.owl.Service;

/**
 * The ontological description of the Context History related services. This
 * class can be used by other components that wish to implement and provide
 * their own Context History storage services, such as short term history
 * storage.
 * 
 * @author <a href="mailto:alfiva@itaca.upv.es">Alvaro Fides Valero</a>
 * 
 */
public class ContextHistoryService extends Service {
    public static final String MY_URI = ContextHistoryOntology.NAMESPACE
	    + "ContextHistoryService";
    public static final String PROP_MANAGES = ContextHistoryOntology.NAMESPACE
	    + "manages";
    public static final String PROP_PROCESSES = ContextHistoryOntology.NAMESPACE
	    + "processes";
    public static final String PROP_RETURNS = ContextHistoryOntology.NAMESPACE
	    + "returns";
    public static final String PROP_TIMESTAMP_FROM = ContextHistoryOntology.NAMESPACE
	    + "timestampFrom";
    public static final String PROP_TIMESTAMP_TO = ContextHistoryOntology.NAMESPACE
	    + "timestampTo";
    public static final String PROP_DURATION_FROM = ContextHistoryOntology.NAMESPACE
	    + "durationFrom";
    public static final String PROP_DURATION_TO = ContextHistoryOntology.NAMESPACE
	    + "durationTo";

    /**
     * Main constructor.
     * 
     * @param uri
     *            URI
     */
    public ContextHistoryService(String uri) {
	super(uri);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.universAAL.middleware.service.owl.Service#getPropSerializationType
     * (java.lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return PROP_MANAGES.equals(propURI) || PROP_PROCESSES.equals(propURI)
		|| PROP_RETURNS.equals(propURI)
		|| PROP_TIMESTAMP_FROM.equals(propURI)
		|| PROP_TIMESTAMP_TO.equals(propURI)
		|| PROP_DURATION_FROM.equals(propURI)
		|| PROP_DURATION_TO.equals(propURI) ? PROP_SERIALIZATION_FULL
		: PROP_SERIALIZATION_OPTIONAL;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.universAAL.middleware.owl.ManagedIndividual#isWellFormed()
     */
    public boolean isWellFormed() {
	return true;
    }

}
