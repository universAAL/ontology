
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;


import org.universAAL.ontology.device.*;

public class DeviceFactory extends ResourceFactoryImpl {


  public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

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
//     case 11:
//       return new MyService(instanceURI);
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

	}
	return null;
  }
}
