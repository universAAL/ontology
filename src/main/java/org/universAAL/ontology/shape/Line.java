/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung 
	
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
package org.universAAL.ontology.shape;

import org.universAAL.ontology.location.position.Point;

/**
 * 
 * @author chwirth
 *
 */

public class Line extends Path {
	
	public static final String MY_URI;
	
	static {
		MY_URI = uAAL_SHAPE_NAMESPACE + "Line";
		register(Line.class);
	}
		
	/**
	 * Creates a Line object
	 * @param uri the object URI
	 */
	public Line(String uri) {
		super(uri);
	}
	
	/**
	 * Creates a Line object
	 */
	public Line() {
		super();
	}
	
	/**
	 * Creates a Line object. All points have to be in the same coordinate system
	 * @param uri this value can also be a null object
	 * @param points an array of all points of the path
	 */
	public Line(String uri, Point[] points) {
		super(uri,points);
	}

	public Line(Point[] points) {
		super(points);
	}

	/**
	 * Returns a human readable description on the essence of this ontology class.
	 */
	public static String getRDFSComment() {
		return "A path woth linear connections of the points.";
	}
	
	/**
	 * Returns a label with which this ontology class can be introduced to human users.
	 */
	public static String getRDFSLabel() {
		return "Line";
	}

	public float getDistanceTo(Point other) {
		if(other==null) throw new IllegalArgumentException();
		float dist = Float.MAX_VALUE;
		Point[] verts = getPoints();
		for(int i=0;i<verts.length-1;i++) {
			float curdist;
			if((curdist = new LineSegment(verts[0],verts[1]).getDistanceTo(other)) < dist) dist = curdist;
		}
		return dist;
	}
	
	/**
	 * 
	 */
	public float getDistanceTo(Shape shape) {
		// getting the points which define the Line
		Point[] pts = getPoints();
		
		// setting mindist to the highest possible float value
		float mindist = Float.MAX_VALUE;
		
		// iterating all points which describe the line object
		for(int i=0;i<pts.length-1;i++) {
			// the algorithm creates n-1 LineSegment objects of the n points
			// for each of this line segments the distance between the segment
			// and the specified shape parameter will be calculated
			float dist = (new LineSegment(pts[i],pts[i+1])).getDistanceTo(shape);
			
			if(dist < mindist)
				mindist=dist;
		}
		
		
		return mindist;
	}

}
