/*
	Copyright 2008-2010 Vodafone Italy, http://www.vodafone.it
	Vodafone Omnitel N.V.
	
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
package org.universAAL.ontology.location.extra;

/**
 * A RoomPlace it a Place with room place type
 * @author smazzei
 *
 */
public class RoomPlace extends Place {
	
	public static final String MY_URI;
	
	static {
		MY_URI = uAAL_VOCABULARY_NAMESPACE + "RoomPlace";
		register(RoomPlace.class);
	}
	
	/**
	 * Creates a RoomPlace object
	 * @param uri the object URI
	 */
	public RoomPlace(String uri) {
		super(uri, PlaceType.roomPlaceType);
	}
	
	/**
	 * Creates a RoomPlace object
	 */
	public RoomPlace() {
		super(PlaceType.roomPlaceType);
	}
	
	/**
	 * Creates a RoomPlace object
	 * @param uri this value can also be a null object
	 * @param name The place name. A null object is not allowed
	 */
	public RoomPlace(String uri, String name) {
		super(uri,PlaceType.roomPlaceType, name);
	}
}
