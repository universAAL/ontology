/*
	Copyright 2008-2010 Vodafone Italy, http://www.vodafone.it
	Vodafone Omnitel N.V.
	
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
package org.universAAL.ontology.location.extra;

import org.universAAL.middleware.rdf.Resource;

/**
 * This interface represents a generic position. A position can be absolute
 * (i.e. GPS coordinates) or relative.
 * 
 * @author smazzei
 * 
 */
public interface Position {

    public static final String PROP_ACCURACY = Resource.uAAL_VOCABULARY_NAMESPACE
	    + "accuracy";

    public static final String MY_URI = Resource.uAAL_VOCABULARY_NAMESPACE
	    + "Position";

    public Double getAccuracy();

    public void setAccuracy(double acc);

    /**
     * 
     * @return 3-dimension coordinates of a position (X,Y,Z for a relative
     *         position, Latitude, Longitude, Altitude for an absolute position)
     */
    public double[] get3DCoordinates();

    /**
     * 
     * @return 2-dimension coordinates of a position (X,Y for a relative
     *         position, Latitude, Longitude for an absolute position)
     */
    public double[] get2DCoordinates();

    public boolean isWellFormed();

}