package org.universAAL.ontology.lddi.config.datapoints;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.xsd.NonNegativeInteger;
import org.universAAL.ontology.phThing.PhysicalThing;


/**
 * Using this class, the set of logical / physical components connected via a {@link CommunicationGateway}
 * can be specified in the configuration file of that {@link CommunicationGateway}. {@link Datapoint}s have
 * to be linked to components by referring to the sequence number defined in this class. Each component must
 * have a type defined in an ontology. If the component corresponds to some physical object, also its
 * location can be specified.
 * 
 * As an example, with an instance of this class you may specify that the component with the sequence id 0
 * is a dimmable multi-color lamp (type) that is in the middle of ceiling of the living room (location).
 * 
 * @author mtazari
 *
 */
public class Component extends ManagedIndividual {
  public static final String MY_URI = LDDIDatapointsOntology.NAMESPACE + "Component";
	
	/**
	 * A property URI that can be used to mark ontological representations of resources to be corresponding to an external component
	 * existing in an external network that has been bound to the universAAL environment trough a communication gateway
	 */
	public static final String PROP_IS_EXTERNAL_COMPONENT = LDDIDatapointsOntology.NAMESPACE + "isExternalComponent";
  
  /**
	 * The sequence number starting with zero, used in configuration files as ID for easier reference
	 * in the specification of {@link Datapoint}s. That is, the first component defined in the
	 * configuration file should have id=0, the second one id=1, .., and the nth one id=n-1.
	 * Therefore the value set for this property must be a non-negative integer number.
	 */
  public static final String PROP_CONFIG_SEQ_NO = LDDIDatapointsOntology.NAMESPACE
    + "configSeqNo";
  
  public static final String PROP_DESCRIPTION = LDDIDatapointsOntology.NAMESPACE
    + "description";
  
  public static final String PROP_EXTERNAL_TYPE_SYSTEM = LDDIDatapointsOntology.NAMESPACE
    + "externalTypeSystem";

	public Component() {
		super();
		addType(MY_URI, true);
	}

	public Component(String uri) {
		super(uri);
		addType(MY_URI, true);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return getSeqNoInConfig()>-1  &&  getTypeURI()!=null  &&  getExternalTypeSystem() != null;
	}

	// getter / setters

	public int getSeqNoInConfig() {
		NonNegativeInteger i = (NonNegativeInteger) props.get(PROP_CONFIG_SEQ_NO);
		return (i == null) ? -1 : i.intValue();
	}
	
	public String getTypeURI() {
		Object o = props.get(PROP_DESCRIPTION);
		return (o instanceof ManagedIndividual)? ((ManagedIndividual) o).getClassURI() : null;
	}
	
	public String getLocationURI() {
		Object o = props.get(PROP_DESCRIPTION);
		o = (o instanceof PhysicalThing)? ((PhysicalThing) o).getLocation() : null;
		return (o instanceof Resource)? ((Resource) o).getURI() : null;
	}
	
	public ManagedIndividual getOntDescription() {
		Object o = props.get(PROP_DESCRIPTION);
		return (o instanceof ManagedIndividual)? (ManagedIndividual) o : null;
	}
	
	public ExternalTypeSystem getExternalTypeSystem() {
		Object o = props.get(PROP_EXTERNAL_TYPE_SYSTEM);
		return (o instanceof ExternalTypeSystem)? (ExternalTypeSystem) o : null;
	}
}
