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
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.device.*;

public class DeviceFactory implements ResourceFactory {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {
	case 0:
	    return new COSensor(instanceURI);
	case 1:
	    return new WaterFlowActuator(instanceURI);
	case 2:
	    return new WindowController(instanceURI);
	case 3:
	    return new LightController(instanceURI);
	case 4:
	    return new FallSensor(instanceURI);
	case 5:
	    return new SwitchActuator(instanceURI);
	case 6:
	    return new DimmerActuator(instanceURI);
	case 7:
	    return new DosageSensor(instanceURI);
	case 8:
	    return new PanicButtonSensor(instanceURI);
	case 9:
	    return new HeaterSensor(instanceURI);
	case 10:
	    return new CurtainSensor(instanceURI);
	    // case 11:
	    // return new MyService(instanceURI);
	case 12:
	    return new PresenceSensor(instanceURI);
	case 13:
	    return new EnuresisSensor(instanceURI);
	case 14:
	    return new DimmerSensor(instanceURI);
	case 15:
	    return new MotionSensor(instanceURI);
	case 16:
	    return new SmokeSensor(instanceURI);
	case 17:
	    return new CurtainController(instanceURI);
	case 18:
	    return new SwitchController(instanceURI);
	case 19:
	    return new BlindSensor(instanceURI);
	case 20:
	    return new HeaterController(instanceURI);
	case 21:
	    return new SwitchSensor(instanceURI);
	case 22:
	    return new ExitSensor(instanceURI);
	case 23:
	    return new GlassBreakSensor(instanceURI);
	case 24:
	    return new HumiditySensor(instanceURI);
	case 25:
	    return new WaterFlowSensor(instanceURI);
	case 26:
	    return new WaterFlowController(instanceURI);
	case 27:
	    return new TemperatureLevelSensor(instanceURI);
	case 28:
	    return new GasSensor(instanceURI);
	case 29:
	    return new EnvironmentSensor(instanceURI);
	case 30:
	    return new WindowSensor(instanceURI);
	case 31:
	    return new FloodSensor(instanceURI);
	case 32:
	    return new ContactSensor(instanceURI);
	case 33:
	    return new DimmerController(instanceURI);
	case 34:
	    return new CurtainActuator(instanceURI);
	case 35:
	    return new BlindActuator(instanceURI);
	case 36:
	    return new BlindController(instanceURI);
	case 37:
	    return new WindowActuator(instanceURI);
	case 38:
	    return new LightSensor(instanceURI);
	case 39:
	    return new TemperatureSensor(instanceURI);
	case 40:
	    return new HeaterActuator(instanceURI);
	case 41:
	    return new LightActuator(instanceURI);
	case 42:
	    return new DoorActuator(instanceURI);
	case 43:
	    return new DoorController(instanceURI);
	case 44:
	    return new DoorSensor(instanceURI);
	case 45:
	    return new CO2Sensor(instanceURI);
	case 46:
	    return new EnvironmentMeter(instanceURI);
	case 47:
	    return new CO2Meter(instanceURI);
	case 48:
	    return new COMeter(instanceURI);
	case 49:
	    return new GasMeter(instanceURI);
	case 50:
	    return new SmokeMeter(instanceURI);
	}
	return null;
    }
}
