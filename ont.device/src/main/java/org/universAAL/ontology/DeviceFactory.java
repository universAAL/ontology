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
import org.universAAL.ontology.device.BlindActuator;
import org.universAAL.ontology.device.BlindController;
import org.universAAL.ontology.device.BlindSensor;
import org.universAAL.ontology.device.CO2Meter;
import org.universAAL.ontology.device.CO2Sensor;
import org.universAAL.ontology.device.COMeter;
import org.universAAL.ontology.device.COSensor;
import org.universAAL.ontology.device.ColorLightActuator;
import org.universAAL.ontology.device.ColorLightController;
import org.universAAL.ontology.device.ContactSensor;
import org.universAAL.ontology.device.CurtainActuator;
import org.universAAL.ontology.device.CurtainController;
import org.universAAL.ontology.device.CurtainSensor;
import org.universAAL.ontology.device.DimmerActuator;
import org.universAAL.ontology.device.DimmerController;
import org.universAAL.ontology.device.DimmerSensor;
import org.universAAL.ontology.device.DoorActuator;
import org.universAAL.ontology.device.DoorController;
import org.universAAL.ontology.device.DoorSensor;
import org.universAAL.ontology.device.DosageSensor;
import org.universAAL.ontology.device.EnuresisSensor;
import org.universAAL.ontology.device.EnvironmentMeter;
import org.universAAL.ontology.device.EnvironmentSensor;
import org.universAAL.ontology.device.ExitSensor;
import org.universAAL.ontology.device.FallSensor;
import org.universAAL.ontology.device.FloodSensor;
import org.universAAL.ontology.device.GasMeter;
import org.universAAL.ontology.device.GasSensor;
import org.universAAL.ontology.device.GlassBreakSensor;
import org.universAAL.ontology.device.HeaterActuator;
import org.universAAL.ontology.device.HeaterController;
import org.universAAL.ontology.device.HeaterSensor;
import org.universAAL.ontology.device.HumiditySensor;
import org.universAAL.ontology.device.LightActuator;
import org.universAAL.ontology.device.LightController;
import org.universAAL.ontology.device.LightSensor;
import org.universAAL.ontology.device.MotionSensor;
import org.universAAL.ontology.device.PanicButtonSensor;
import org.universAAL.ontology.device.PresenceSensor;
import org.universAAL.ontology.device.SmokeMeter;
import org.universAAL.ontology.device.SmokeSensor;
import org.universAAL.ontology.device.SwitchActuator;
import org.universAAL.ontology.device.SwitchController;
import org.universAAL.ontology.device.SwitchSensor;
import org.universAAL.ontology.device.TemperatureLevelSensor;
import org.universAAL.ontology.device.TemperatureSensor;
import org.universAAL.ontology.device.WaterFlowActuator;
import org.universAAL.ontology.device.WaterFlowController;
import org.universAAL.ontology.device.WaterFlowSensor;
import org.universAAL.ontology.device.WindowActuator;
import org.universAAL.ontology.device.WindowController;
import org.universAAL.ontology.device.WindowSensor;

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
		case 51:
			return new ColorLightActuator(instanceURI);
		case 52:
			return new ColorLightController(instanceURI);
		}
		return null;
	}
}
