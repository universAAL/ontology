package org.universAAL.ontology.test;

import org.universAAL.itests.IntegrationTest;
import org.universAAL.ontology.device.DimmerSensor;
import org.universAAL.ontology.device.GlassBreakSensor;
import org.universAAL.ontology.device.HumiditySensor;
import org.universAAL.ontology.device.StatusValue;
import org.universAAL.ontology.device.TemperatureLevelSensor;
import org.universAAL.ontology.device.TemperatureLevelValue;

/**
 * Here developer's of this artifact should code their integration tests.
 * 
 * @author rotgier
 * 
 */
public class ArtifactIntegrationTest extends IntegrationTest {


    public void testComposite() {
	logAllBundles();
    }
    
    public testValues(){
	// This is to test that all Devices can have their values set despite being datatypes or objects
	// Integers
	DimmerSensor ds=new DimmerSensor();
	ds.setHasValue(87);
	// Floats
	HumiditySensor hs=new HumiditySensor();
	hs.setHasValue(8.7f);
	// StatusValue
	GlassBreakSensor gs=new GlassBreakSensor();
	gs.set(StatusValue.Activated);
	// Other *Value
	TemperatureLevelSensor ts=new TemperatureLevelSensor();
	ts.setTemperatureLevel(TemperatureLevelValue.HighTemperature);
    }

}
