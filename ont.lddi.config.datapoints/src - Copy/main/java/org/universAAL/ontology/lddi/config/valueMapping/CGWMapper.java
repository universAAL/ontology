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
public class CGWMapper extends ManagedIndividual {
	public static final String MY_URI = LDDIDatapointsOntology.NAMESPACE + CGWMapper.class.getSimpleName();

	public String getClassURI() {
		return MY_URI;
	}

	/* (non-Javadoc)
	 * @see org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType(java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return Resource.PROP_SERIALIZATION_FULL;
	}

	public boolean setProperty(String prop, Object val) {
		if (val instanceof ComponentMapper
				&&  prop != null  &&  prop.startsWith("lddi:java#")
				&&  !props.contains(prop)
				&&  ((ComponentMapper) val).setCGWclassName(prop.substring(10))) {
			props.put(prop, val);
			return true;
		}
		return false;
	}
	
	public ComponentMapper getComponentMapper(String cgwClassName) {
		if (cgwClassName == null)
			return null;
		
		Object o = props.get(cgwClassName);
		if (o instanceof ComponentMapper)
			return (ComponentMapper) o;
		
		Class c = null;
		try { Class.forName(cgwClassName); }
		catch (Exception e) { return null; }
		
		while (c != Object.class) {
			c = c.getSuperclass();
			cgwClassName = c.getName();
			o = props.get(cgwClassName);
			if (o instanceof ComponentMapper)
				return (ComponentMapper) o;
		}
		
		return null;
	}
}
