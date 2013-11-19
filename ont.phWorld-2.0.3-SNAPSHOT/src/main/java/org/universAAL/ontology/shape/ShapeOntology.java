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
package org.universAAL.ontology.shape;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.ShapeFactory;
import org.universAAL.ontology.location.position.CoordinateSystem;
import org.universAAL.ontology.location.position.Point;

/**
 * 
 * @author Carsten Stockloew
 * 
 */
public class ShapeOntology extends Ontology {

    public static final String NAMESPACE = "http://ontology.universaal.org/Shape.owl#";

    private static ShapeFactory factory = new ShapeFactory();

    public ShapeOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("Ontology for shapes. "
		+ "It is part of the Physical World upper ontology concept, "
		+ "which defines the most general concepts from the physical "
		+ "world as opposed to the virtual realm.");
	r.setResourceLabel("Shapes");

	OntClassInfoSetup oci;

	// load Shape
	oci = createNewAbstractOntClassInfo(Shape.MY_URI);
	oci.setResourceComment("The root class for all shapes.");
	oci.setResourceLabel("Shape");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addObjectProperty(Shape.PROP_POINT_REPRESENTATION).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Shape.PROP_POINT_REPRESENTATION, Point.MY_URI, 0, 1));
	oci.addObjectProperty(Shape.PROP_LOCAL_COORDINATE_SYSTEM)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Shape.PROP_LOCAL_COORDINATE_SYSTEM,
			CoordinateSystem.MY_URI, 1, 1));
	oci.addObjectProperty(Shape.PROP_BOUNDING_VOLUME).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Shape.PROP_BOUNDING_VOLUME, Shape.MY_URI, 1, 1));

	// load Shape2D
	oci = createNewAbstractOntClassInfo(Shape2D.MY_URI);
	oci.setResourceComment("The root class for all 2d shapes.");
	oci.setResourceLabel("Shape2D");
	oci.addSuperClass(Shape.MY_URI);

	// load Shape3D
	oci = createNewAbstractOntClassInfo(Shape3D.MY_URI);
	oci.setResourceComment("The root class for all 3d shapes.");
	oci.setResourceLabel("Shape3D");
	oci.addSuperClass(Shape.MY_URI);
	oci.addObjectProperty(Shape3D.PROP_2D_REPRESENTATION).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Shape3D.PROP_2D_REPRESENTATION, Shape2D.MY_URI, 0, 1));

	// load BooleanShape
	oci = createNewAbstractOntClassInfo(BooleanShape.MY_URI);
	oci
		.setResourceComment("A boolean shape: Merge, Intersect or Substract.");
	oci.setResourceLabel("BooleanShape");
	oci.addSuperClass(Shape.MY_URI);
	oci.addObjectProperty(BooleanShape.PROP_SHAPES);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			BooleanShape.PROP_SHAPES, Point.MY_URI, 2, -1));

	// load Box
	oci = createNewOntClassInfo(Box.MY_URI, factory, 0);
	oci.setResourceComment("A box.");
	oci.setResourceLabel("Box");
	oci.addSuperClass(Shape3D.MY_URI);
	oci.addDatatypeProperty(Box.PROP_WIDTH).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Box.PROP_WIDTH,
			TypeMapper.getDatatypeURI(Double.class), 1, 1));
	oci.addDatatypeProperty(Box.PROP_HEIGHT).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Box.PROP_HEIGHT,
			TypeMapper.getDatatypeURI(Double.class), 1, 1));
	oci.addDatatypeProperty(Box.PROP_DEPTH).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Box.PROP_DEPTH,
			TypeMapper.getDatatypeURI(Double.class), 1, 1));

	// load Ellipse
	oci = createNewOntClassInfo(Ellipse.MY_URI, factory, 1);
	oci.setResourceComment("An ellipse.");
	oci.setResourceLabel("Ellipse");
	oci.addSuperClass(Shape2D.MY_URI);
	oci.addDatatypeProperty(Ellipse.PROP_MINOR_AXIS_LENGTH).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Ellipse.PROP_MINOR_AXIS_LENGTH, TypeMapper
				.getDatatypeURI(Double.class), 1, 1));
	oci.addDatatypeProperty(Ellipse.PROP_MAJOR_AXIS_LENGTH).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Ellipse.PROP_MAJOR_AXIS_LENGTH, TypeMapper
				.getDatatypeURI(Double.class), 1, 1));

	// load Circle
	oci = createNewOntClassInfo(Circle.MY_URI, factory, 2);
	oci.setResourceComment("A circle.");
	oci.setResourceLabel("Circle");
	oci.addSuperClass(Ellipse.MY_URI);

	// load Path
	oci = createNewAbstractOntClassInfo(Path.MY_URI);
	oci.setResourceComment("A path.");
	oci.setResourceLabel("Path");
	oci.addSuperClass(Shape3D.MY_URI);
	oci.addObjectProperty(Path.PROP_POINTS);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Path.PROP_POINTS,
			Point.MY_URI, 2, -1));

	// load Line
	oci = createNewOntClassInfo(Line.MY_URI, factory, 3);
	oci.setResourceComment("A path woth linear connections of the points.");
	oci.setResourceLabel("Line");
	oci.addSuperClass(Path.MY_URI);

	// load LineSegment
	oci = createNewOntClassInfo(LineSegment.MY_URI, factory, 4);
	oci
		.setResourceComment("A segment of a line defined by a start and a endpoint.");
	oci.setResourceLabel("LineSegment");
	oci.addSuperClass(Line.MY_URI);

	// load ConeSegment
	oci = createNewOntClassInfo(ConeSegment.MY_URI, factory, 5);
	oci
		.setResourceComment("A segment of a cone defined by a start and a endpoint.");
	oci.setResourceLabel("ConeSegment");
	oci.addSuperClass(LineSegment.MY_URI);
	oci.addDatatypeProperty(ConeSegment.PROP_RADIUS_END).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ConeSegment.PROP_RADIUS_END, TypeMapper
				.getDatatypeURI(Float.class), 1, 1));
	oci.addDatatypeProperty(ConeSegment.PROP_RADIUS_START).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ConeSegment.PROP_RADIUS_START, TypeMapper
				.getDatatypeURI(Float.class), 1, 1));

	// load Polygon
	oci = createNewOntClassInfo(Polygon.MY_URI, factory, 6);
	oci.setResourceComment("A polgyon.");
	oci.setResourceLabel("Polygon");
	oci.addSuperClass(Shape3D.MY_URI);
	oci.addObjectProperty(Polygon.PROP_VERTICES);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Polygon.PROP_VERTICES,
			Point.MY_URI, 3, -1));

	// load Triangle
	oci = createNewOntClassInfo(Triangle.MY_URI, factory, 7);
	oci.setResourceComment("A triangle.");
	oci.setResourceLabel("Triangle");
	oci.addSuperClass(Polygon.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Polygon.PROP_VERTICES,
			Point.MY_URI, 3, 3));

	// load Sphere
	oci = createNewOntClassInfo(Sphere.MY_URI, factory, 8);
	oci.setResourceComment("A sphere.");
	oci.setResourceLabel("Sphere");
	oci.addSuperClass(Shape3D.MY_URI);
	oci.addDatatypeProperty(Sphere.PROP_RADIUS).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Sphere.PROP_RADIUS,
			TypeMapper.getDatatypeURI(Double.class), 1, 1));

	// load QuasiCylinder
	oci = createNewOntClassInfo(QuasiCylinder.MY_URI, factory, 9);
	oci.setResourceComment("A quasi cylinder.");
	oci.setResourceLabel("QuasiCylinder");
	oci.addSuperClass(Shape3D.MY_URI);
	oci.addObjectProperty(QuasiCylinder.PROP_HEAD).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			QuasiCylinder.PROP_HEAD, Ellipse.MY_URI, 1, 1));
	oci.addObjectProperty(QuasiCylinder.PROP_FOOT).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			QuasiCylinder.PROP_FOOT, Ellipse.MY_URI, 1, 1));

	// load Polyhedron
	oci = createNewOntClassInfo(Polyhedron.MY_URI, factory, 10);
	oci.setResourceComment("A polgyhedron.");
	oci.setResourceLabel("Polyhedron");
	oci.addSuperClass(Shape3D.MY_URI);
	oci.addObjectProperty(Polyhedron.PROP_FACES);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Polyhedron.PROP_FACES,
			Point.MY_URI, 4, -1));

	// load MergedShape
	oci = createNewOntClassInfo(MergedShape.MY_URI, factory, 11);
	oci.setResourceComment("A merged boolean shape.");
	oci.setResourceLabel("MergedShape");
	oci.addSuperClass(BooleanShape.MY_URI);
    }
}
