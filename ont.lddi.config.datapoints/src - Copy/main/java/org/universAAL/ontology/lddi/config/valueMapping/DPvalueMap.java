/**
 * 
 */
package org.universAAL.ontology.lddi.config.valueMapping;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.ontology.lddi.config.datapoints.LDDIDatapointsOntology;

/**
 * @author mtazari
 *
 */
public class DPvalueMap extends ManagedIndividual {
	public static final String MY_URI = LDDIDatapointsOntology.NAMESPACE + DPvalueMap.class.getSimpleName();
	
	public static final String PROP_INTERNAL_VALUE = LDDIDatapointsOntology.NAMESPACE + "internalValue";
	public static final String PROP_EXTERNAL_VALUE = LDDIDatapointsOntology.NAMESPACE + "externalValue";

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return (PROP_INTERNAL_VALUE.equals(propURI)
				||  PROP_EXTERNAL_VALUE.equals(propURI))
				? Resource.PROP_SERIALIZATION_FULL
						: Resource.PROP_SERIALIZATION_OPTIONAL;
	}

	public Object getInternalValue() {
		return props.get(PROP_INTERNAL_VALUE);
	}

	public Object getExternalValue() {
		return props.get(PROP_EXTERNAL_VALUE);
	}

	public void setInternalValue(Object v) {
		props.put(PROP_INTERNAL_VALUE, v);
	}

	public void setExternalValue(Object v) {
		props.put(PROP_EXTERNAL_VALUE, v);
	}
}
