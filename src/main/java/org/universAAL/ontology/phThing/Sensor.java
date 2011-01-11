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
package org.universAAL.ontology.phThing;

import org.universAAL.middleware.owl.Restriction;

/**
 * @author <a href="mailto:alfiva@itaca.upv.es">Alvaro Fides Valero</a>
 *
 */
public class Sensor extends Device {

	public static final String MY_URI;
	public static final String PROP_MEASURED_VALUE;
	
	static{
		MY_URI=Device.uAAL_DEVICE_NAMESPACE+"Sensor";
		PROP_MEASURED_VALUE=Device.uAAL_DEVICE_NAMESPACE+"measuredValue";
		register(Sensor.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_MEASURED_VALUE.equals(propURI))
			return Restriction.getCardinalityRestriction(propURI, 1, 1);
		return Device.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		String[] inherited = Device.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length+1];
		int i = 0;
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
		toReturn[i] = PROP_MEASURED_VALUE;
		return toReturn;
	}
	
	public Sensor(){
	}
	
	public Sensor(String uri){
		super(uri);
	}
	
	public static String getRDFSComment() {
		return "A Sensor Device";
	}
	
	public static String getRDFSLabel() {
		return "Sensor";
	}
	
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}
	
	public boolean isWellFormed() {
		return true;
	}
	


}
