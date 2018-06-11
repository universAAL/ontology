/**
 * 
 */
package org.universAAL.ontology.lddi.config.datapoints;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.xsd.NonNegativeInteger;

/**
 * This class helps in the configuration files of {@link CommunicationGateway}s to specify
 * each external data-point that is made accessible through the corresponding gateway.
 * 
 * @author mtazari
 *
 */
public class Datapoint extends ManagedIndividual {

	public static final String MY_URI = LDDIDatapointsOntology.NAMESPACE + "Datapoint";
	
	/**
	 * Configuration files of {@link CommunicationGateway}s have to provide a mapping between the external
	 * world to which they provide a gateway and the ontological model used internally in the universAAL world.
	 * Therefore, people who edit these configuration files must have previously checked which set of ontologies
	 * are going to be used in the context of the gateway that they configure. Then, for each data-point they
	 * must <ol>
	 * <li>use {@link Datapoint#PROP_BELONGS_TO} to specify the sequence number of a {@link Component} defined
	 * in the same configuration file, and</li>
	 * <li>use {@link Datapoint#PROP_RELATED_ONT_PROPERTY} to specify the URI of a property defined in one of
	 * the used ontologies to which this data-point corresponds.</li></ol>
	 * 
	 * For example, if the gateway is using a lighting ontology that says there are dimmable multi-color lamps,
	 * with a property "luminancePercentage" for the current level of brightness as well as a property "color" 
	 * for the current light color, then if the data-point at hand is about the color of a dimmable multi-color
	 * lamp that is in the middle of ceiling of the living room, then {@link Datapoint#PROP_BELONGS_TO} must be
	 * set to the sequence number of that lamp and {@link Datapoint#PROP_RELATED_ONT_PROPERTY} must be set to
	 * the URI of the color property as defined in the used ontology.
	 */
	public static final String PROP_BELONGS_TO = LDDIDatapointsOntology.NAMESPACE + "belongsTo";
	
	/**
	 * Configuration files of {@link CommunicationGateway}s have to provide a mapping between the external
	 * world to which they provide a gateway and the ontological model used internally in the universAAL world.
	 * Therefore, people who edit these configuration files must have previously checked which set of ontologies
	 * are going to be used in the context of the gateway that they configure. Then, for each data-point they
	 * must <ol>
	 * <li>use {@link Datapoint#PROP_BELONGS_TO} to specify the sequence number of a {@link Component} defined
	 * in the same configuration file, and</li>
	 * <li>use {@link Datapoint#PROP_RELATED_ONT_PROPERTY} to specify the URI of a property defined in one of
	 * the used ontologies to which this data-point corresponds.</li></ol>
	 * 
	 * For example, if the gateway is using a lighting ontology that says there are dimmable multi-color lamps,
	 * with a property "luminancePercentage" for the current level of brightness as well as a property "color" 
	 * for the current light color, then if the data-point at hand is about the color of a dimmable multi-color
	 * lamp that is in the middle of ceiling of the living room, then {@link Datapoint#PROP_BELONGS_TO} must be
	 * set to the sequence number of that lamp and {@link Datapoint#PROP_RELATED_ONT_PROPERTY} must be set to
	 * the URI of the color property as defined in the used ontology.
	 */
	public static final String PROP_RELATED_ONT_PROPERTY = LDDIDatapointsOntology.NAMESPACE + "relatedOntProperty";
	
	/**
	 * Property for storing the get / pull / read address of the data-point at hand in the external system.
	 * The value of this property (the address specified) will be treated as a string. It is expected that the
	 * {@link CommunicationGateway} providing access to the data-point is able to extract all info that it needs
	 * for accessing the data-point from this string.
	 * 
	 * If it is not set, it means that the corresponding data-point can not be read, for example because
	 * it is a write-only data-point or for instance if the data-point represents the measurements of a
	 * sensor can neither store its measurements nor supports on-demand measurement, and hence can only
	 * push it measurements according to some internal schedule for its measurements.
	 */
	public static final String PROP_PULL_ADDRESS = LDDIDatapointsOntology.NAMESPACE + "pullAddress";
	
	/**
	 * If the external system has a push mechanism to notify possible subscribers for the data-point at hand,
	 * this property can be used for providing the specific info how to subscribe for these events.
	 * The value of this property (the "push address" specified) will be treated as a string. It is expected that the
	 * {@link CommunicationGateway} providing access to the data-point is able to extract all info that it needs
	 * for subscribing to the related data-point from this string.
	 * 
	 * If it is not set, it means that there is no native evening mechanism for the changes of the data-point values.
	 * However, the {@link CommunicationGateway} may still provide an own eventing mechanism to {@link ComponentIntegrator}s
	 * if the "pull address" is set for the data-point.
	 */
	public static final String PROP_PUSH_ADDRESS = LDDIDatapointsOntology.NAMESPACE + "pushAddress";
	
	/**
	 * Property for storing the set / change address of the data-point at hand in the external system.
	 * The value of this property (the address specified) will be treated as a string. It is expected that the
	 * {@link CommunicationGateway} providing access to the data-point is able to extract all info that it needs
	 * for accessing the data-point from this string.
	 * 
	 * If it is not set, it means that the corresponding data-point can not be written, for example because
	 * it is a read-only data-point, e.g. when the data-point represents the measurements of a sensor.
	 */
	public static final String PROP_SET_ADDRESS = LDDIDatapointsOntology.NAMESPACE + "setAddress";
	
//	/**
//	 * Optional property for storing the trigger address of the data-point at hand in the external system.
//	 * It should be used e.g. when the external system accepts commmands; then, for each command a data-point
//	 * with a "trigger address" can be defined in the configuration file in order to provide related info
//	 * specific to that command. Therefore, if this property is set, it probably will be the only "address"
//	 * property of the data-point.
//	 * The value of this property (the address specified) will be treated as a string. It is expected that the
//	 * {@link CommunicationGateway} providing access to the data-point is able to extract all info that it needs
//	 * for accessing the data-point from this string.
//	 */
//	public static final String PROP_TRIGGER_ADDRESS = CGwDataConfigOntology.NAMESPACE + "triggerAddress";

	public Datapoint() {
		super();
		addType(MY_URI, true);
	}

	public Datapoint(String uri) {
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
		return getComponentID()>-1
				&&  getProperty()!= null
				&&  (getPullAddress()!= null
						||  getPushAddress()!= null
						||  getSetAddress()!= null);
	}

	// getter / setters
	
	public int getComponentID() {
		NonNegativeInteger i = (NonNegativeInteger) props.get(PROP_BELONGS_TO);
		return (i == null) ? -1 : i.intValue();
	}
	
	public String getPullAddress() {
		return (String) props.get(PROP_PULL_ADDRESS);
	}
	
	public String getPushAddress() {
		return (String) props.get(PROP_PUSH_ADDRESS);
	}
	
	public String getSetAddress() {
		return (String) props.get(PROP_SET_ADDRESS);
	}

	public String getProperty() {
		Object o = props.get(PROP_RELATED_ONT_PROPERTY);
		return (o == null)? null : o.toString();
	}

}
