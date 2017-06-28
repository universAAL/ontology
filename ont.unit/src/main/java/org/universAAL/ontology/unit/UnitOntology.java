/*******************************************************************************
 * Copyright 2012 UPM - Universidad Politécnica de Madrid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.unit;

import org.universAAL.middleware.owl.AllValuesFromRestriction;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.HasValueRestriction;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.owl.TypeURI;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.UnitFactory;
import org.universAAL.ontology.unit.color.CMYKColorModel;
import org.universAAL.ontology.unit.color.ColorModel;
import org.universAAL.ontology.unit.color.ColorTemperature;
import org.universAAL.ontology.unit.color.HSVColorModel;
import org.universAAL.ontology.unit.color.RGBColorModel;
import org.universAAL.ontology.unit.services.UnitConversionService;
import org.universAAL.ontology.unit.services.UnitService;
import org.universAAL.ontology.unit.system.BinarySystem;
import org.universAAL.ontology.unit.system.InternationalSystem;
import org.universAAL.ontology.unit.system.TimeSystem;
import org.universAAL.ontology.unit.system.Util;

/**
 * @author universAAL Studio
 */
public final class UnitOntology extends Ontology {

	private static UnitFactory factory = new UnitFactory();
	public static final String NAMESPACE = "http://ontology.universAAL.org/Unit.owl#";

	public UnitOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("The Unit Ontology");
		r.setResourceLabel("Unit");
		addImport(DataRepOntology.NAMESPACE);
		addImport(ServiceBusOntology.NAMESPACE);

		// ******* Declaration of enumeration classes of the ontology ******* //

		OntClassInfoSetup oci_measurableDimension = createNewAbstractOntClassInfo(MeasurableDimension.MY_URI);

		// ******* Declaration of enumeration classes of the ontology ******* //

		OntClassInfoSetup oci_ColorModel = createNewAbstractOntClassInfo(ColorModel.MY_URI);

		// ******* Declaration of regular classes of the ontology ******* //
		OntClassInfoSetup oci_Unit = createNewOntClassInfo(Unit.MY_URI,
				factory, 1);
		OntClassInfoSetup oci_UnitSystem = createNewOntClassInfo(
				UnitSystem.MY_URI, factory, 2);
		OntClassInfoSetup oci_Prefix = createNewOntClassInfo(Prefix.MY_URI,
				factory, 3);
		OntClassInfoSetup oci_MultipliedUnit = createNewOntClassInfo(
				MultipliedUnit.MY_URI, factory, 4);
		OntClassInfoSetup oci_DividedUnit = createNewOntClassInfo(
				DividedUnit.MY_URI, factory, 5);
		OntClassInfoSetup oci_DerivedUnit = createNewAbstractOntClassInfo(DerivedUnit.MY_URI);
		OntClassInfoSetup oci_UnitService = createNewOntClassInfo(
				UnitService.MY_URI, factory, 6);
		OntClassInfoSetup oci_UnitConversionService = createNewOntClassInfo(
				UnitConversionService.MY_URI, factory, 7);
		OntClassInfoSetup oci_RGBColorModel = createNewOntClassInfo(
				RGBColorModel.MY_URI, factory, 8);
		OntClassInfoSetup oci_HSVColorModel = createNewOntClassInfo(
				HSVColorModel.MY_URI, factory, 9);
		OntClassInfoSetup oci_CMYKColorModel = createNewOntClassInfo(
				CMYKColorModel.MY_URI, factory, 10);
		OntClassInfoSetup oci_ColorTemp = createNewOntClassInfo(
				ColorTemperature.MY_URI, factory, 11);

		// ******* Add content to enumeration classes of the ontology ******* //

		oci_measurableDimension
				.setResourceComment("List of all measurable dimensions");
		oci_measurableDimension.setResourceLabel("MeasurableDimension");
		oci_measurableDimension.toEnumeration(new ManagedIndividual[] {
				MeasurableDimension.Length, MeasurableDimension.Mass,
				MeasurableDimension.Time, MeasurableDimension.Current,
				MeasurableDimension.Temperature, MeasurableDimension.Luminance,
				MeasurableDimension.SubstanceAmmount,
				MeasurableDimension.Adiemnsional,
				MeasurableDimension.ComputerStorage,
				MeasurableDimension.Derived, MeasurableDimension.Currency,
				MeasurableDimension.Rotational, MeasurableDimension.Color });

		// ******* Add content to regular classes of the ontology ******* //
		oci_DividedUnit
				.setResourceComment("Any Unit that is derived by dividing one unit by another");
		oci_DividedUnit.setResourceLabel("DividedUnit");
		oci_DividedUnit.addSuperClass(DerivedUnit.MY_URI);
		oci_DividedUnit.addObjectProperty(DividedUnit.PROP_DIVIDED_BY)
				.setFunctional();
		oci_DividedUnit.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						DividedUnit.PROP_DIVIDED_BY, Unit.MY_URI, 1, 1));
		oci_DividedUnit.addObjectProperty(DividedUnit.PROP_DIVIDED_BY_PREFIX)
				.setFunctional();
		oci_DividedUnit
				.addRestriction(MergedRestriction
						.getAllValuesRestrictionWithCardinality(
								DividedUnit.PROP_DIVIDED_BY_PREFIX,
								Prefix.MY_URI, 0, 1));

		oci_UnitSystem
				.setResourceComment("A unit System is a collection of units and prefixes");
		oci_UnitSystem.setResourceLabel("UnitSystem");
		oci_UnitSystem.addSuperClass(ManagedIndividual.MY_URI);
		oci_UnitSystem.addObjectProperty(UnitSystem.PROP_UNITS).setFunctional();
		oci_UnitSystem.addRestriction(MergedRestriction
				.getAllValuesRestriction(UnitSystem.PROP_UNITS, Unit.MY_URI));

		oci_UnitSystem.addDatatypeProperty(UnitSystem.PROP_NAME);
		oci_UnitSystem.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(UnitSystem.PROP_NAME,
						TypeMapper.getDatatypeURI(String.class), 1, 1));

		oci_UnitSystem.addObjectProperty(UnitSystem.PROP_PREFIXES)
				.setFunctional();
		oci_UnitSystem.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						UnitSystem.PROP_PREFIXES, Prefix.MY_URI, 1, 1));

		oci_Unit.setResourceComment("A unit of measurement is a definite magnitude of a physical quantity");
		oci_Unit.setResourceLabel("Unit");
		oci_Unit.addSuperClass(ManagedIndividual.MY_URI);
		oci_Unit.addObjectProperty(Unit.PROP_UNIT_SYSTEM).setFunctional();
		oci_Unit.addRestriction(MergedRestriction.getAllValuesRestriction(
				Unit.PROP_UNIT_SYSTEM, UnitSystem.MY_URI));

		oci_Unit.addDatatypeProperty(Unit.PROP_NAME);
		oci_Unit.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Unit.PROP_NAME,
						TypeMapper.getDatatypeURI(String.class), 1, 1));

		oci_Unit.addDatatypeProperty(Unit.PROP_SYMBOL);
		oci_Unit.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Unit.PROP_SYMBOL,
						TypeMapper.getDatatypeURI(String.class), 1, 1));

		oci_Unit.addObjectProperty(Unit.PROP_DIMENSION).setFunctional();
		oci_Unit.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Unit.PROP_DIMENSION,
						MeasurableDimension.MY_URI, 1, 1));

		oci_DerivedUnit.setResourceComment("Any unit based upon other units");
		oci_DerivedUnit.setResourceLabel("DerivedUnit");
		oci_DerivedUnit.addSuperClass(Unit.MY_URI);
		oci_DerivedUnit.addObjectProperty(DerivedUnit.PROP_BASE_UNIT)
				.setFunctional();
		oci_DerivedUnit.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						DerivedUnit.PROP_BASE_UNIT, Unit.MY_URI, 1, 1));
		oci_DerivedUnit.addRestriction(MergedRestriction
				.getFixedValueRestriction(DerivedUnit.PROP_DIMENSION,
						MeasurableDimension.Derived));
		oci_DerivedUnit.addObjectProperty(DerivedUnit.PROP_BASE_PREFIX)
				.setFunctional();
		oci_DerivedUnit.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						DerivedUnit.PROP_BASE_PREFIX, Prefix.MY_URI, 0, 1));

		oci_Prefix
				.setResourceComment("A symbol that placed in front of the unit modifies by a sacalar factor the value of the unit");
		oci_Prefix.setResourceLabel("Prefix");
		oci_Prefix.addSuperClass(ManagedIndividual.MY_URI);
		oci_Prefix.addDatatypeProperty(Prefix.PROP_NAME);
		oci_Prefix.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Prefix.PROP_NAME,
						TypeMapper.getDatatypeURI(String.class), 1, 1));

		oci_Prefix.addDatatypeProperty(Prefix.PROP_POWER);
		oci_Prefix.addRestriction(MergedRestriction.getCardinalityRestriction(
				Prefix.PROP_POWER, 1, 1));

		oci_Prefix.addDatatypeProperty(Prefix.PROP_BASE);
		oci_Prefix.addRestriction(MergedRestriction.getCardinalityRestriction(
				Prefix.PROP_BASE, 1, 1));

		oci_Prefix.addDatatypeProperty(Prefix.PROP_SYMBOL);
		oci_Prefix.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Prefix.PROP_SYMBOL,
						TypeMapper.getDatatypeURI(String.class), 1, 1));

		oci_MultipliedUnit
				.setResourceComment("Any Unit that is derived by multiplying one unit by another");
		oci_MultipliedUnit.setResourceLabel("MultipliedUnit");
		oci_MultipliedUnit.addSuperClass(DerivedUnit.MY_URI);
		oci_MultipliedUnit.addObjectProperty(MultipliedUnit.PROP_MULTIPLIED_BY)
				.setFunctional();
		oci_MultipliedUnit.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						MultipliedUnit.PROP_MULTIPLIED_BY, Unit.MY_URI, 1, 1));
		oci_MultipliedUnit.addObjectProperty(
				MultipliedUnit.PROP_MULTIPLIED_BY_PREFIX).setFunctional();
		oci_MultipliedUnit.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						MultipliedUnit.PROP_MULTIPLIED_BY_PREFIX,
						Prefix.MY_URI, 0, 1));

		oci_UnitService
				.setResourceComment("Root service concept that allows providing services that handle Unit operations");
		oci_UnitService.setResourceLabel("UnitService");
		oci_UnitService.addSuperClass(Service.MY_URI);
		oci_UnitService.addObjectProperty(UnitService.PROP_CONTROLS);
		oci_UnitService
				.addRestriction(MergedRestriction.getAllValuesRestriction(
						UnitService.PROP_CONTROLS, Unit.MY_URI));

		oci_UnitConversionService
				.setResourceComment("Service for Unit conversion operations");
		oci_UnitConversionService.setResourceLabel("UnitConversionService");
		oci_UnitConversionService.addSuperClass(Service.MY_URI);
		oci_UnitConversionService
				.addObjectProperty(UnitConversionService.PROP_FROM_UNIT);
		oci_UnitConversionService.addRestriction(MergedRestriction
				.getAllValuesRestriction(UnitConversionService.PROP_FROM_UNIT,
						Unit.MY_URI));
		oci_UnitConversionService
				.addObjectProperty(UnitConversionService.PROP_TO_UNIT);
		oci_UnitConversionService.addRestriction(MergedRestriction
				.getAllValuesRestriction(UnitConversionService.PROP_TO_UNIT,
						Unit.MY_URI));
		oci_UnitConversionService
				.addObjectProperty(UnitConversionService.PROP_FROM_PREFIX);
		oci_UnitConversionService.addRestriction(MergedRestriction
				.getAllValuesRestriction(
						UnitConversionService.PROP_FROM_PREFIX, Prefix.MY_URI));
		oci_UnitConversionService
				.addObjectProperty(UnitConversionService.PROP_TO_PREFIX);
		oci_UnitConversionService.addRestriction(MergedRestriction
				.getAllValuesRestriction(UnitConversionService.PROP_TO_PREFIX,
						Prefix.MY_URI));
		oci_UnitConversionService.addDatatypeProperty(
				UnitConversionService.PROP_FROM_VALUE).setFunctional();
		// oci_UnitConversionService
		// .addRestriction(MergedRestriction.getAllValuesRestriction(
		// UnitConversionService.PROP_FROM_VALUE,
		// TypeMapper.getDatatypeURI(Double.class)));
		oci_UnitConversionService.addDatatypeProperty(
				UnitConversionService.PROP_TO_VALUE).setFunctional();
		// oci_UnitConversionService
		// .addRestriction(MergedRestriction.getAllValuesRestriction(
		// UnitConversionService.PROP_TO_VALUE,
		// TypeMapper.getDatatypeURI(Double.class)));

		/*
		 * INDIVIDUAL CONCEPTS
		 */

		oci_UnitSystem.addInstance(InternationalSystem.IND_SI);

		oci_Unit.addInstance(InternationalSystem.IND_UNIT_SI_METER);
		oci_Unit.addInstance(InternationalSystem.IND_UNIT_SI_GRAM);
		oci_Unit.addInstance(InternationalSystem.IND_UNIT_SI_SECOND);
		oci_Unit.addInstance(InternationalSystem.IND_UNIT_SI_AMPERE);
		oci_Unit.addInstance(InternationalSystem.IND_UNIT_SI_KELVIN);
		oci_Unit.addInstance(InternationalSystem.IND_UNIT_SI_CANDELA);
		oci_Unit.addInstance(InternationalSystem.IND_UNIT_SI_MOLE);

		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_YOTTA);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_ZETTA);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_EXA);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_PETA);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_TERA);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_GIGA);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_MEGA);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_KILO);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_HECTO);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_DECA);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_DECI);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_CENTI);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_MILI);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_MICRO);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_NANO);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_PICO);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_FEMTO);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_ATTO);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_ZEPTO);
		oci_Prefix.addInstance(InternationalSystem.IND_PREFIX_SI_YOCTO);

		oci_UnitSystem.addInstance(TimeSystem.IND_TS);

		oci_Unit.addInstance(TimeSystem.IND_UNIT_TS_SECOND);
		oci_Unit.addInstance(TimeSystem.IND_UNIT_TS_MINUTE);
		oci_Unit.addInstance(TimeSystem.IND_UNIT_TS_HOUR);
		oci_Unit.addInstance(TimeSystem.IND_UNIT_TS_DAY);
		oci_Unit.addInstance(TimeSystem.IND_UNIT_TS_WEEK);
		oci_Unit.addInstance(TimeSystem.IND_UNIT_TS_MONTH);
		oci_Unit.addInstance(TimeSystem.IND_UNIT_TS_YEAR);
		oci_Unit.addInstance(TimeSystem.IND_UNIT_TS_LUSTRUM);
		oci_Unit.addInstance(TimeSystem.IND_UNIT_TS_DECADE);
		oci_Unit.addInstance(TimeSystem.IND_UNIT_TS_CENTURY);
		oci_Unit.addInstance(TimeSystem.IND_UNIT_TS_MILENIUM);

		oci_UnitSystem.addInstance(BinarySystem.IND_BS);

		oci_Unit.addInstance(BinarySystem.IND_UNIT_BS_BIT);
		oci_Unit.addInstance(BinarySystem.IND_UNIT_BS_BYTE);

		oci_Prefix.addInstance(BinarySystem.IND_PREFIX_BS_KIBI);
		oci_Prefix.addInstance(BinarySystem.IND_PREFIX_BS_MEBI);
		oci_Prefix.addInstance(BinarySystem.IND_PREFIX_BS_GIBI);
		oci_Prefix.addInstance(BinarySystem.IND_PREFIX_BS_TEBI);
		oci_Prefix.addInstance(BinarySystem.IND_PREFIX_BS_PEBI);
		oci_Prefix.addInstance(BinarySystem.IND_PREFIX_BS_EXBI);
		oci_Prefix.addInstance(BinarySystem.IND_PREFIX_BS_ZEBI);
		oci_Prefix.addInstance(BinarySystem.IND_PREFIX_BS_YOBI);

		oci_Unit.addInstance(Util.IND_UNIT_UNITY);
		oci_Unit.addInstance(Util.IND_UNIT_PERCENT);
		oci_DividedUnit.addInstance(Util.IND_UNIT_HERTZ);
		oci_DividedUnit.addInstance(Util.IND_UNIT_VOLT);

		// Color stuff

		oci_ColorModel.setResourceLabel("Color Model");
		oci_ColorModel
				.setResourceComment("An abstract mathematical model describing the way colors can be represented as tuples of numbers.");
		oci_ColorModel.addSuperClass(ManagedIndividual.MY_URI);
		oci_ColorModel.addObjectProperty(ColorModel.PROP_COLOR_UNIT);

		MergedRestriction crest = new MergedRestriction(
				ColorModel.PROP_COLOR_UNIT);
		// it is a unit
		crest.addRestriction(new AllValuesFromRestriction(
				ColorModel.PROP_COLOR_UNIT, new TypeURI(Unit.MY_URI, false)));
		// mandatory, 1
		crest.addRestriction(MergedRestriction.getCardinalityRestriction(
				ColorModel.PROP_COLOR_UNIT, 1, 1));
		// which measured dimension is Color
		crest.addRestriction(new AllValuesFromRestriction(
				ColorModel.PROP_COLOR_UNIT, new HasValueRestriction(
						Unit.PROP_DIMENSION, MeasurableDimension.Color)));

		oci_ColorModel.addRestriction(crest);

		oci_RGBColorModel.setResourceLabel("RGB Color Model");
		oci_RGBColorModel
				.setResourceComment("An additive color model in which red, green and blue light are added"
						+ " together in various ways to reproduce a broad array of colors.");
		oci_RGBColorModel.addSuperClass(ColorModel.MY_URI);
		oci_RGBColorModel.addDatatypeProperty(RGBColorModel.PROP_RED);
		oci_RGBColorModel.addDatatypeProperty(RGBColorModel.PROP_BLUE);
		oci_RGBColorModel.addDatatypeProperty(RGBColorModel.PROP_GREEN);
		// TODO restrict datatype properties to numeric?
		oci_RGBColorModel.addInstance(RGBColorModel.IND_UNIT_RGB);
		oci_RGBColorModel.addRestriction(MergedRestriction
				.getFixedValueRestriction(ColorModel.PROP_COLOR_UNIT,
						RGBColorModel.IND_UNIT_RGB));

		oci_HSVColorModel.setResourceLabel("HSV Color Model");
		oci_HSVColorModel
				.setResourceComment("HSV stands for hue, saturation, and value,"
						+ " a common cylindrical-coordinate representations of points"
						+ " in an RGB color model.");
		oci_HSVColorModel.addSuperClass(ColorModel.MY_URI);
		oci_HSVColorModel.addDatatypeProperty(HSVColorModel.PROP_HUE);
		oci_HSVColorModel.addDatatypeProperty(HSVColorModel.PROP_SATURATION);
		oci_HSVColorModel.addDatatypeProperty(HSVColorModel.PROP_VALUE);
		// TODO restrict datatype properties to numeric?
		oci_HSVColorModel.addInstance(HSVColorModel.IND_UNIT_HSV);
		oci_HSVColorModel.addRestriction(MergedRestriction
				.getFixedValueRestriction(ColorModel.PROP_COLOR_UNIT,
						HSVColorModel.IND_UNIT_HSV));

		oci_CMYKColorModel.setResourceLabel("CMYK Color Model");
		oci_CMYKColorModel.setResourceComment("The CMYK color model is a"
				+ " subtractive color model, used in color printing, and is "
				+ "also used to describe the printing process itself.");
		oci_CMYKColorModel.addSuperClass(ColorModel.MY_URI);
		oci_CMYKColorModel.addDatatypeProperty(CMYKColorModel.PROP_CYAN);
		oci_CMYKColorModel.addDatatypeProperty(CMYKColorModel.PROP_MAGENTA);
		oci_CMYKColorModel.addDatatypeProperty(CMYKColorModel.PROP_YELLOW);
		oci_CMYKColorModel.addDatatypeProperty(CMYKColorModel.PROP_BLACK);
		// TODO restrict datatype properties to numeric?
		oci_CMYKColorModel.addInstance(CMYKColorModel.IND_UNIT_CMYK);
		oci_CMYKColorModel.addRestriction(MergedRestriction
				.getFixedValueRestriction(ColorModel.PROP_COLOR_UNIT,
						CMYKColorModel.IND_UNIT_CMYK));

		oci_ColorTemp.setResourceLabel("Color Temperature");
		oci_ColorTemp
				.setResourceComment("The color temperature of a light source "
						+ "is the temperature of an ideal black-body radiator that "
						+ "radiates light of a color comparable to that of the light source.");
		oci_ColorTemp.addSuperClass(ColorModel.MY_URI);
		oci_ColorTemp.addDatatypeProperty(ColorTemperature.PROP_DEGREES);
		// TODO restrict datatype properties to numeric?
		oci_ColorTemp.addInstance(ColorTemperature.IND_UNIT_COLOR_TEMPERATURE);
		oci_ColorTemp.addRestriction(MergedRestriction
				.getFixedValueRestriction(ColorModel.PROP_COLOR_UNIT,
						ColorTemperature.IND_UNIT_COLOR_TEMPERATURE));
	}
}
