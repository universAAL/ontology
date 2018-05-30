/**
 * 
 */
package org.universAAL.ontology.lddi.config.datapoints;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * This class helps in the configuration files of {@link CommunicationGateway}s to specify
 * each external data-point that is made accessible through the corresponding gateway.
 * 
 * @author mtazari
 *
 */
public class Datapoint extends ManagedIndividual {

	public static final String MY_URI = LDDIDatapointsOntology.NAMESPACE + "Datapoint";
	
	// class properties
	/**
	 * The sequence number starting with zero, used in configuration files as ID for easier reference
	 * when in {@link Component component views} data-points are mapped to their ontological
	 * counterparts in terms of properties. I.e., the first data-point defined in the
	 * configuration file should have id=0, the second one id=1, .., and the nth one id=n-1.
	 * Therefore the value set for this property must be a non-negative integer number.
	 */
	public static final String PROP_DP_ID = LDDIDatapointsOntology.NAMESPACE + "datapointID";
	
	/**
	 * This property must refer to the sequence number of a {@link DatapointValueType value-type}
	 * specified in the same configuration file. The {@link DatapointValueType value-type} set through
	 * this property for a data-point indicates the type of the values that may be pulled / pushed / set
	 * from / to / for the data-point at hand.
	 */
	public static final String PROP_VALUE_TYPE = LDDIDatapointsOntology.NAMESPACE + "valueType";
	
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
	 * This property can be used to indicate the frequency of value changes for the data-point at hand
	 * in the external system, in terms of an estimation of the number of changes per second (e.g., the
	 * number of measurements by an external sensor per second). Therefore, valid values for this property
	 * can be any positive float number; e.g., a value of 0.001 would mean that the expected time to elapse
	 * between two subsequent events is ca. 1000 seconds.
	 * 
	 */
	public static final String PROP_VALUE_CHANGE_FREQUENCY_PER_SECOND = LDDIDatapointsOntology.NAMESPACE + "valueChangeFrequencyPerSecond";
	
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
	}

	public Datapoint(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return getID()>-1
				&&  getTypeID()>-1
				&&  getComponentID()>-1
				&&  getProperty()!= null
				&&  (getPullAddress()!= null
						||  getPushAddress()!= null
						||  getSetAddress()!= null);
	}

	// getter / setters

	public int getID() {
		Integer i = (Integer) props.get(PROP_DP_ID);
		return (i == null) ? -1 : i.intValue();
	}
	
	public int getTypeID() {
		Integer i = (Integer) props.get(PROP_VALUE_TYPE);
		return (i == null) ? -1 : i.intValue();
	}
	
	public int getComponentID() {
		Integer i = (Integer) props.get(PROP_BELONGS_TO);
		return (i == null) ? -1 : i.intValue();
	}
	
	public float getChangeFrequencyPerSecond() {
		Float f = (Float) props.get(PROP_VALUE_CHANGE_FREQUENCY_PER_SECOND);
		return (f == null) ? Float.NaN : f.floatValue();
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
		return (String) props.get(PROP_RELATED_ONT_PROPERTY);
	}

}
