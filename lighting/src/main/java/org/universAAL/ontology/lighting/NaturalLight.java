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

package org.universAAL.ontology.lighting;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * @author mtazari
 *
 */
public class NaturalLight extends LightType {
	public static final String MY_URI;
	static {
		MY_URI = LightSource.LIGHTING_NAMESPACE + "NaturalLight";
		register(NaturalLight.class);
	}
	
	public static final int MOON_SHINE = 0;
	public static final int SUN_SHINE = 1;

	private static final String[] names = {
        "moon_shine", "sun_shine"
    };
	
	public static final NaturalLight moonShine = new NaturalLight(MOON_SHINE);
	public static final NaturalLight sunShine = new NaturalLight(SUN_SHINE);
	
	/**
	 * Returns the list of all class members guaranteeing that no other members
	 * will be created after a call to this method.
	 */
	public static ManagedIndividual[] getEnumerationMembers() {
		return new ManagedIndividual[] {
				moonShine, sunShine
			};
	}
	
	/**
	 * Returns the rating with the given URI. 
	 */
	public static ManagedIndividual getIndividualByURI(String instanceURI) {
		return (instanceURI != null
				&&  instanceURI.startsWith(LightSource.LIGHTING_NAMESPACE))?
						valueOf(instanceURI.substring(LightSource.LIGHTING_NAMESPACE.length()))
						: null;
	}
	
	public static NaturalLight getNaturalLightByOrder(int order) {
        switch (order) {
        case MOON_SHINE: return moonShine;
        case SUN_SHINE: return sunShine;
        default: return null;
        }
	}
	
	public static String getRDFSComment() {
		return "The type of natural light sources.";
	}

	public static String getRDFSLabel() {
		return "Natural Light";
	}
    
    public static final NaturalLight valueOf(String name) {
    	if (name == null)
    		return null;
    	
    	if (name.startsWith(LightSource.LIGHTING_NAMESPACE))
    		name = name.substring(LightSource.LIGHTING_NAMESPACE.length());
    	
        for (int i=MOON_SHINE;  i<=SUN_SHINE; i++)
            if (names[i].equals(name))
                return getNaturalLightByOrder(i);
        
        return null;
    }
    
    private int order;
    
    private NaturalLight(int order) {
    	super(LightSource.LIGHTING_NAMESPACE + names[order]);
        this.order = order;
    }

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	
	public boolean isWellFormed() {
		return true;
	}
    
    public String name() {
        return names[order];
    }
    
    public int ord() {
        return order;
    }

	public void setProperty(String propURI, Object o) {
		// do nothing
	}
}
