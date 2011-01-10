/*
	Copyright 2008-2010 SPIRIT, http://www.spirit-intl.com/
	SPIRIT S.A. E-BUSINESS AND COMMUNICATIONS ENGINEERING 
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package org.universAAL.ontology.profile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.phThing.PhysicalThing;


/**
 * @author KAgnantis
 *
 */
public class PropertyBag extends ManagedIndividual {
	public static final String MY_URI;
	public static final String PROP_HAS_PROPERTY_ENTRY;
	
	
	static{
		MY_URI= Profile.PROFILING_NAMESPACE + "PropertyBag";
		PROP_HAS_PROPERTY_ENTRY = Profile.PROFILING_NAMESPACE + "hasPropertyEntry";
		
		register(PropertyBag.class);
	}
			
	public static Restriction getClassRestrictionsOnProperty (String propURI){
		if(PROP_HAS_PROPERTY_ENTRY.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					PropertyEntry.MY_URI, -1, 0); 
		return PhysicalThing.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		String[] inherited = ManagedIndividual.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length+1];
		int i = 0;
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
		toReturn[i++] = PROP_HAS_PROPERTY_ENTRY;
		return toReturn;
	}
	
	
	public static String RDFSComment(){
		return "The class of a PropertyMap";
	}
	
	public static String getRDFSLabel(){
		return "PropertyMap";
	}
	
	public PropertyBag (){
		super();
	}
	
	public PropertyBag(String uri){
		super(uri);
	}

	
		
	public List/*<PropertyEntry>*/ getPropertyEntries(){
		Object o = props.get(PROP_HAS_PROPERTY_ENTRY);
		return (o instanceof List) ? (List) o : new ArrayList(0); 
	}
	
	
	public void setPropertyEntries(List list){
		if(list == null)
			return;
		
		for (Iterator it = list.iterator(); it.hasNext();)
			if (!(it.next() instanceof PropertyEntry))
					it.remove();
		props.put(PROP_HAS_PROPERTY_ENTRY, list);
	}
	
	public void addPropertyEntry(PropertyEntry entry) {
		List entries;
		Object o = props.get(PROP_HAS_PROPERTY_ENTRY);
		if (o instanceof List) 
			entries = (List) o;
		else {
			entries = new ArrayList();
			entries.add(entry);
			return;
		}
		
		//replace value
		//equals check is done using just the entry.path
		if (entries.contains(entry)) {
			entries.remove(entry);
		}
		entries.add(entry);
		props.put(PROP_HAS_PROPERTY_ENTRY, entries);
	}
	
	public void removePropertyEntry(PropertyEntry entry) {
		Object o = props.get(PROP_HAS_PROPERTY_ENTRY);
		if (o instanceof List)  {
			List entries = (List) o;
			entries.remove(entry);
			props.put(PROP_HAS_PROPERTY_ENTRY, entries);
		}
	}
	
//	public Object getPropertyEntryValue(String[] path) {
//		Object o = props.get(PROP_HAS_PROPERTY_ENTRY);
//		if (!(o instanceof List))  
//				return null;
//
//		List entries = (List) o;
//		PropertyEntry key = new PropertyEntry(null, path);
//		for (int i = 0; i < entries.size(); ++i) {
//			Object other = entries.get(i);
//			if (key.equals(other)) {
//				return ((PropertyEntry)entries.get(i)).getValue();
//			}
//		}
//		return null;
//	}
	
//	public Object getPropertyEntryValue(PropertyEntry entry) {
//		if (entry == null)
//			return null;
//		
//		Object o = props.get(PROP_HAS_PROPERTY_ENTRY);
//		if (!(o instanceof List))  
//				return null;
//
//		List entries = (List) o;
//		for (int i = 0; i < entries.size(); ++i) {
//			Object other = entries.get(i);
//			if (entry.equals(other)) {
//				return ((PropertyEntry)entries.get(i)).getValue();
//			}
//		}
//		return null;
//	}
		
		
	public int getPropSerializationType(String propURI){
		return PROP_SERIALIZATION_FULL;
		
	}
		
	public void setProperty(String propURI, Object o) {
		if (PROP_HAS_PROPERTY_ENTRY.equals(propURI) && o instanceof List)
			setPropertyEntries((List)o);
		else
			super.setProperty(propURI, o);
	}
	
	public boolean isWellFormed(){
		return true;
	}

}
