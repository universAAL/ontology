
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
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.measurement.Measurement;
import org.universAAL.ontology.measurement.MeasurementOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.HvacFactory;
import org.universAAL.ontology.device.*;
import org.universAAL.ontology.unit.*;
/**
 * Represents the class of physical manufactured things that have some
 * capability. It adds no new property to physical things but just provides
 * means for explicit distinction of certain physical things as devices.
 * 
 * @author 
 * 
 */
public class Hvac extends Device {

    public static final String MY_URI = HvacOntology.NAMESPACE + "Hvac";
    
    public static final String PROP_HAS_FAN = HvacOntology.NAMESPACE + "hasFan";

    public static final String PROP_HAS_LEVEL = HvacOntology.NAMESPACE + "hasLevel";

    public static final String PROP_HAS_MODE = HvacOntology.NAMESPACE + "hasMode";

    public static final String PROP_HAS_STATUSVALUE = HvacOntology.NAMESPACE + "hasStatusValue";

    public static final String PROP_HAS_SWING = HvacOntology.NAMESPACE + "hasSwing";
    
    public static final String PROP_HAS_TEMPERATURE = HvacOntology.NAMESPACE + "hasTemperature";

    
    public static final String PROP_HAS_TIMER = HvacOntology.NAMESPACE + "hasTimer";
    
    public static final String PROP_HAS_UNITS = HvacOntology.NAMESPACE + "hasUnits";




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

}



