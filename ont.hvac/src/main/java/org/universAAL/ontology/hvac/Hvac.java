
package org.universAAL.ontology.hvac;

import org.universAAL.middleware.owl.supply.LevelRating;
import org.universAAL.middleware.*;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.device.DeviceOntology;
import org.universAAL.ontology.hvac.DEVICE.Actuator;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.measurement.Measurement;
import org.universAAL.ontology.measurement.MeasurementOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.HvacFactory;import org.universAAL.ontology.device.*;
/**
 * Represents the class of physical manufactured things that have some
 * capability. It adds no new property to physical things but just provides
 * means for explicit distinction of certain physical things as devices.
 * 
 * @author mtazari
 * 
 */
public class Hvac extends Device {

    public static final String MY_URI = HvacOntology.NAMESPACE + "Hvac";
    
    public static final String PROP_HAS_SWING = HvacOntology.NAMESPACE + "hasSwing";
    
    public static final String PROP_HAS_FAN = HvacOntology.NAMESPACE + "hasFan";

    public static final String PROP_HAS_MODE = HvacOntology.NAMESPACE + "hasMode";
    
    public static final String PROP_HAS_TIMER = HvacOntology.NAMESPACE + "hasTimer";
    
    //public static final String PROP_HAS_TEMPERATURE = HvacOntology.NAMESPACE + "hasTemperature";

//    public static final String PROP_BATTERY_LEVEL = PhThingOntology.NAMESPACE
//	    + "batteryLevel";

    public Hvac() {
	super();
    }

    public Hvac(String uri) {
	super(uri);
    }

    public Hvac(String uriPrefix, int numProps) {
	super(uriPrefix, numProps);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

//    public LevelRating getBatteryLevel() {
//	return (LevelRating) props.get(PROP_BATTERY_LEVEL);
//    }
//
//    public void setBatteryLevel(LevelRating value) {
//	props.put(PROP_BATTERY_LEVEL, value);
//    }
}




////////////////////////////////////////////////////////////////////////
////////////////////
/////////////////////////////////////////////////////////////////




// ESTO ES LO QUE YO TENIA ECHOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
//package org.universAAL.ontology.hvac;
//
//import org.universAAL.*;
//import org.universAAL.middleware.owl.supply.LevelRating;
//import org.universAAL.ontology.phThing.PhThingOntology;
//import org.universAAL.ontology.hvac.HvacOntology;
//import org.universAAL.ontology.hvac.DEVICE.*;
//public class Hvac //extends Device{
//{	
//public static final String MY_URI = HvacOntology.NAMESPACE + "Hvac";
//
//protected static Swing swing;
//protected  static Mode mode;
//    protected static Fan fan;
//    protected static Timer timer;
//    protected StatusValue statusvalue;
//    public Hvac(){
//    	swing=Hvac.swing;
//    	fan=Hvac.fan;
//    	mode=Hvac.mode;
//    	timer=Hvac.timer;
//    }
//  
//    public Hvac(String uri) {
//    	uri=this.MY_URI;
//        } 
//
//	public String getClassURI() {
//	return MY_URI;
//    }
//
//     	
//   
//  
//    
//}


