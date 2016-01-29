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
package org.universAAL.ontology.hvac;

public abstract class Target_Temperature extends ValueHvac {
    public static final String MY_URI = HvacOntology.NAMESPACE + "Target_Temperature";
    public static final String PROP_HAS_TEMPERATURE = HvacOntology.NAMESPACE + "hasTemperature";
    //protected static Temperatura temperatura;
    public Target_Temperature() {
	//super(swing, mode, fan, timer);
    	super();
    }

    public Target_Temperature(String uri) {
    	super(uri);
        }

    public String getClassURI() {
	return MY_URI;
    }

  

    public boolean isWellFormed() {
	return true;
    }
}