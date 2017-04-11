package org.universAAL.ontology.test;

import org.universAAL.middleware.bus.junit.OntTestCase;
import org.universAAL.ontology.device.DimmerSensor;
import org.universAAL.ontology.device.GlassBreakSensor;
import org.universAAL.ontology.device.HumiditySensor;
import org.universAAL.ontology.device.StatusValue;

/**
 * Here developer's of this artifact should code their integration tests.
 * 
 * @author rotgier
 * 
 */
public class ValuesTest extends OntTestCase {


   
    public void testValues(){
	// This is to test that all Devices can have their values set despite being datatypes or objects
	// Integers
	DimmerSensor ds=new DimmerSensor();
	ds.setValue(87);
	// Floats
	HumiditySensor hs=new HumiditySensor();
	hs.setValue(8.7f);
	// StatusValue
	GlassBreakSensor gs=new GlassBreakSensor();
	gs.setValue(StatusValue.Activated);
	// Other *Value
//	TemperatureLevelSensor ts=new TemperatureLevelSensor();
//	ts.set(TemperatureLevelValue.HighTemperature);
    }

}
