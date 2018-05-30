/**
 * 
 */
package org.universAAL.ontology.lddi.config.datapoints;


import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * This class helps in the configuration files of {@link CommunicationGateway}s
 * to specify the type of the possible values for each external data-point that
 * is made accessible through the corresponding gateway. Because there may be
 * several data-points with the same value type, it makes sense that the value
 * types are specified separately, by assigning a sequence number to them as
 * their ID. Then in the specification of data-points, the type can be specified
 * by referring to the related sequence number of the corresponding type described separately.
 * 
 * @author mtazari
 *
 */
public class DatapointValueType extends ManagedIndividual {
	
	// class uri
	public static final String MY_URI = LDDIDatapointsOntology.NAMESPACE + "DatapointValueType";
	
	// class properties
	/**
	 * The sequence number starting with zero, used in configuration files as ID for easier reference
	 * when linking data-points to a specific value-type. I.e., the first value type defined in the
	 * configuration file should have id=0, the second one id=1, .., and the nth one id=n-1.
	 * Therefore the value set for this property must be a non-negative integer number.
	 */
	public static final String PROP_VT_ID = LDDIDatapointsOntology.NAMESPACE + "valueTypeID";
	
	/**
	 * The base type for all values of a specific value-type.
	 * The value set for this property must be one of the types pre-defined by {@link SimpleType SimpleType}.
	 */
	public static final String PROP_BASE_TYPE = LDDIDatapointsOntology.NAMESPACE + "baseType";
	
	/**
	 * This is an optional property: If the number of possible values is limited to a given set,
	 * all these values can be listed and saved under this property; the list members are expected
	 * to be of the base-type given for {@link DatapointValueType#PROP_BASE_TYPE PROP_BASE_TYPE}.
	 */
	public static final String PROP_ENUM_VALUES = LDDIDatapointsOntology.NAMESPACE + "enumerationOfAllValues";
	
	/**
	 * This is an optional property, mostly relevant if the base type is {@link SimpleType#dateTime dateTime}
	 * or {@link SimpleType#duration duration}: The value of this property is expected to be a string that should
	 * help parsers to parse values of the specified base type.
	 */
	public static final String PROP_VALUE_FORMAT = LDDIDatapointsOntology.NAMESPACE + "valueFormat";
	
	/**
	 * This is an optional property, mostly relevant if the base type is a number or a {@link SimpleType#dateTime dateTime}:
	 * If this property is set for a value-type, the value of this property specifies the minimum value for all values of the corresponding value-type.
	 */
	public static final String PROP_VALUE_LOWERLIMIT = LDDIDatapointsOntology.NAMESPACE + "minValue";
	
	/**
	 * This is an optional property, mostly relevant if the base type is a number or a {@link SimpleType#dateTime dateTime}
	 * and if a lower limit has been specified: In that case, the possible values of the corresponding value-type will
	 * be one of minValue, minValue+valueStep, minValue+2*valueStep, ...
	 */
	public static final String PROP_VALUE_STEP = LDDIDatapointsOntology.NAMESPACE + "valueStep";
	
	/**
	 * This is an optional property, mostly relevant if the base type is a number or a {@link SimpleType#dateTime dateTime}:
	 * If this property is set for a value-type, the value of this property specifies the maximum value for all values of the corresponding value-type.
	 */
	public static final String PROP_VALUE_UPPERLIMIT = LDDIDatapointsOntology.NAMESPACE + "maxValue";

	public DatapointValueType() {
		super();
	}

	public DatapointValueType(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return getID() > -1  &&  getBaseType() != null;
	}

	// getter / setters

	public int getID() {
		Integer i = (Integer) props.get(PROP_VT_ID);
		return (i == null) ? -1 : i.intValue();
	}
	
	public SimpleType getBaseType() {
		return (SimpleType) props.get(PROP_BASE_TYPE);
	}
	
	public List getEnumValues() {
		return (List) props.get(PROP_ENUM_VALUES);
	}

	public String getValueFormat() {
		return (String) props.get(PROP_VALUE_FORMAT);
	}
	
	public Object getMinValue() {
		return props.get(PROP_VALUE_LOWERLIMIT);
	}
	
	public Object getMaxValue() {
		return props.get(PROP_VALUE_UPPERLIMIT);
	}
	
	public float getValueStep() {
		Float f = (Float) props.get(PROP_VALUE_STEP);
		return (f == null) ? Float.NaN : f.floatValue();
	}

//	@SuppressWarnings("unchecked")
//	public void setID(int seqno) {
//		if (seqno > -1  &&  props.get(PROP_VT_ID) == null)
//			props.put(PROP_VT_ID, (Integer) seqno);
//	}
//	
//	@SuppressWarnings("unchecked")
//	public void setBaseType(SimpleType type) {
//		if (type != null  &&  props.get(PROP_BASE_TYPE) == null)
//			props.put(PROP_BASE_TYPE, type);
//	}
//	
//	public void setEnumValues(List<Object> values) {
//		if (values != null  &&  props.get(PROP_ENUM_VALUES) == null) {
//			
//		}
//	}
//
//	public void setValueFormat(String formatString) {
//	}
//	
//	public void setMinValue(Object val) {
//	}
//	
//	public void setMaxValue(Object val) {
//	}
//	
//	public void setValueStep(Object step) {
//	}
}
