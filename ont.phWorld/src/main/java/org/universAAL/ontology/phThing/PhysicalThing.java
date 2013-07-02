/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
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
package org.universAAL.ontology.phThing;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.util.Constants;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.location.Place;
import org.universAAL.ontology.shape.Box;
import org.universAAL.ontology.shape.Shape;

/**
 * Represents the class of physical things that are supposed to have a location.
 * 
 * @author mtazari
 * 
 */
public class PhysicalThing extends ManagedIndividual {
    public static final String MY_URI = PhThingOntology.NAMESPACE + "PhysicalThing";
    public static final String PROP_CARRIED_BY = PhThingOntology.NAMESPACE + "carriedBy";
    public static final String PROP_PART_OF = PhThingOntology.NAMESPACE + "partOf";
    public static final String PROP_IS_IN = PhThingOntology.NAMESPACE + "isIn";
    public static final String PROP_IS_PORTABLE = PhThingOntology.NAMESPACE + "isPortable";
    public static final String PROP_IS_STATIONARY = PhThingOntology.NAMESPACE + "isStationary";
    public static final String PROP_PHYSICAL_LOCATION = PhThingOntology.NAMESPACE + "hasLocation";
    public static final String PROP_HAS_SHAPE = PhThingOntology.NAMESPACE + "hasShape";

    protected PhysicalThing() {
	super();
    }

    public PhysicalThing(String uri) {
	super(uri);
    }

    protected PhysicalThing(String uriPrefix, int numProps) {
	super(uriPrefix, numProps);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public Location getLocation() {
	return (Location) props.get(PROP_PHYSICAL_LOCATION);
    }

    public Shape getShape() {
	return (Shape) props.get(PROP_HAS_SHAPE);
    }

    /**
     * From the point of view of this top most class of things with a location,
     * the location can be represented in its reduced form. As the class has no
     * other property, for all other input, we return
     * {@link ManagedIndividual#PROP_SERIALIZATION_OPTIONAL}.
     * 
     * @see ManagedIndividual#getPropSerializationType(String).
     */
    public int getPropSerializationType(String propURI) {
	if (PROP_PHYSICAL_LOCATION.equals(propURI)
		|| PROP_HAS_SHAPE.equals(propURI))
	    return PROP_SERIALIZATION_REDUCED;
	return PROP_SERIALIZATION_OPTIONAL;
    }

    public boolean setLocation(Location loc) {
	if (loc == null)
	    throw new IllegalArgumentException();
	props.put(PROP_PHYSICAL_LOCATION, loc);
	return true;
    }

    /**
     * 
     * Defines, that the PhysicalThing is located in location o at point x,y,z
     * Warning: This does not set the PROP_PHYSICAL_LOCATION property to o, but
     * to an new anon place, that is "contained in" the given location Note: the
     * coordinates are defining the center of the PhysicalThing relative to the
     * center of the containing location
     * 
     * @param o
     *            the location
     * @param x
     * @param y
     * @param z
     */
    public void setLocation(Place o, float x, float y, float z) {
	if (o != null) {
	    Place place = new Place(this.getShape());
	    if (o instanceof Place)
		((Place) o).addContainedLocation(place, x, y, z);
	    else
		place.setContainingLocation(place, x, y, z);
	    place.setPhysicalThingofLocation(this);
	    props.put(PROP_PHYSICAL_LOCATION, place);
	} else
	    props.remove(PROP_PHYSICAL_LOCATION);
    }

    /**
     * 
     * Defines, that the PhysicalThing is located in location o at point x,y,z
     * Warning: This does not set the PROP_PHYSICAL_LOCATION property to o, but
     * to a new anon place, that is "contained in" the given location Note: the
     * coordinates are defining center of the PhysicalThing relative to the
     * lower, left corner of the containing location, assuming its a box
     * 
     * @param o
     *            the location
     * @param x
     * @param y
     * @param z
     */
    // TODO: what is the real meaning of the coordinates?
    public void setLocationRelativeToCorner(Location o, float x, float y,
	    float z) {
	if (o != null) {
	    Place place = new Place(Constants.uAAL_MIDDLEWARE_LOCAL_ID_PREFIX
		    + this.getLocalName() + "_place", this.getShape());

	    if (o instanceof Place) {
		// assumed, the shape of the place is a box. that needn't be the
		// case
		Box box = (Box) ((Place) o).getShape();
		((Place) o).addContainedLocation(place, (float) (x - box
			.getWidth() / 2f), (float) (y - box.getDepth() / 2f),
			(float) (z - box.getHeight() / 2f));
	    } else
		place.setContainingLocation(place, x, y, z);

	    // associating the location of the furniture and the furniture
	    place.setPhysicalThingofLocation(this);
	    props.put(PROP_PHYSICAL_LOCATION, place);
	} else
	    props.remove(PROP_PHYSICAL_LOCATION);
    }

    /**
     * 
     * Defines, that the PhysicalThing is located in location o at point x,y,z
     * Warning: This does not set the PROP_PHYSICAL_LOCATION property to o, but
     * to an new anon place, that is "contained in" the given location Note: the
     * coordinates are defining corner of the PhysicalThing relative to the
     * lower, left corner of the containing location, assuming its a box
     * 
     * @param o
     *            the location
     * @param x
     * @param y
     * @param z
     */
    public void setLocationCornerRelativeToCorner(Location o, float x, float y,
	    float z) {
	if (o != null) {
	    Place place = new Place(this.getShape());
	    if (o instanceof Place) {
		Box box = (Box) ((Place) o).getShape();
		Box box2 = (Box) this.getShape().getBoundingVolume();
		((Place) o)
			.addContainedLocation(place, (float) (x
				- box.getWidth() / 2f + box2.getWidth() / 2f),
				(float) (y - box.getDepth() / 2f + box2
					.getDepth() / 2f), (float) (z
					- box.getHeight() / 2f + box2
					.getHeight() / 2f));
	    } else
		place.setContainingLocation(place, x, y, z);
	    place.setPhysicalThingofLocation(this);
	    props.put(PROP_PHYSICAL_LOCATION, place);
	} else
	    props.remove(PROP_PHYSICAL_LOCATION);
    }

    public void setShape(Shape o) {
	if (o != null)
	    props.put(PROP_HAS_SHAPE, o);
    }

    public boolean setProperty(String propURI, Object o) {
	if (PROP_PHYSICAL_LOCATION.equals(propURI) && o instanceof Location)
	    return setLocation((Location) o);
	else
	    return super.setProperty(propURI, o);
    }
}
