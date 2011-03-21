/*	
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut für Graphische Datenverarbeitung 
	
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
package org.universAAL.ontology.measurement;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.context.ContextEvent;

/**
 * See "Measurement.jpg" under src/main/resources.
 * 
 * @author mtazari - <a href="mailto:Saied.Tazari@igd.fraunhofer.de">Saied
 *         Tazari</a>
 * 
 */
public class DimensionMeasure extends ManagedIndividual {
    public static final String MY_URI;
    public static final String PROP_RDF_VALUE;
    public static final String PROP_MEASURE_UNIT;
    public static final String PROP_ABSOLUTE_ERROR_DISTANCE;

    static {
	MY_URI = ContextEvent.uAAL_CONTEXT_NAMESPACE + "DimensionMeasure";
	PROP_RDF_VALUE = RDF_NAMESPACE + "value";
	PROP_MEASURE_UNIT = ContextEvent.uAAL_CONTEXT_NAMESPACE + "measureUnit";
	PROP_ABSOLUTE_ERROR_DISTANCE = ContextEvent.uAAL_CONTEXT_NAMESPACE
		+ "absoluteErrorDistance";
	register(DimensionMeasure.class);
    }

    public static String getRDFSComment() {
	return "Represents the set of measured values that could be reported by context events.";
    }

    public static String getRDFSLabel() {
	return "Dimension Measure";
    }

    public DimensionMeasure() {
	super();
    }

    // public DimensionMeasure(Object value, String measureUnit)

    /*
     * (non-Javadoc)
     * 
     * @seeorg.universAAL.middleware.context.owl.ManagedIndividual#
     * getPropSerializationType(java.lang.String)
     */
    public int getPropSerializationType(String propURI) {
	// TODO Auto-generated method stub
	return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.universAAL.middleware.context.owl.ManagedIndividual#isWellFormed()
     */
    public boolean isWellFormed() {
	// TODO Auto-generated method stub
	return false;
    }

}
