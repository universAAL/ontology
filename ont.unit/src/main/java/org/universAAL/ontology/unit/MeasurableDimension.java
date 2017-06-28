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

import org.universAAL.middleware.owl.ManagedIndividual;

public class MeasurableDimension extends ManagedIndividual {
	public static final String MY_URI = UnitOntology.NAMESPACE
			+ "MeasurableDimension";

	public static final int _LENGTH = 0;
	public static final int _MASS = 1;
	public static final int _TIME = 2;
	public static final int _CURRENT = 3;
	public static final int _TEMPERATURE = 4;
	public static final int _LUMINANCE = 5;
	public static final int _SUBSTANCE_AMMOUNT = 6;
	public static final int _ADIEMNSIONAL = 7;
	public static final int _COMPUTER_STORAGE = 8;
	public static final int _DERIVED = 9;
	public static final int _CURRENCY = 10;
	public static final int _ROTATION = 11;
	public static final int _COLOR = 12;

	private static final String[] names = { "Length", "Mass", "Time",
			"Current", "Temperature", "Luminance", "SubstanceAmmount",
			"Adiemnsional", "ComputerStorage", "Derived", "Currency",
			"Rotation", "Color" };

	public static final MeasurableDimension Length = new MeasurableDimension(
			_LENGTH);
	public static final MeasurableDimension Mass = new MeasurableDimension(
			_MASS);
	public static final MeasurableDimension Time = new MeasurableDimension(
			_TIME);
	public static final MeasurableDimension Current = new MeasurableDimension(
			_CURRENT);
	public static final MeasurableDimension Temperature = new MeasurableDimension(
			_TEMPERATURE);
	public static final MeasurableDimension Luminance = new MeasurableDimension(
			_LUMINANCE);
	public static final MeasurableDimension SubstanceAmmount = new MeasurableDimension(
			_SUBSTANCE_AMMOUNT);
	public static final MeasurableDimension Adiemnsional = new MeasurableDimension(
			_ADIEMNSIONAL);
	public static final MeasurableDimension ComputerStorage = new MeasurableDimension(
			_COMPUTER_STORAGE);
	public static final MeasurableDimension Derived = new MeasurableDimension(
			_DERIVED);
	public static final MeasurableDimension Currency = new MeasurableDimension(
			_CURRENCY);
	public static final MeasurableDimension Rotational = new MeasurableDimension(
			_ROTATION);
	public static final MeasurableDimension Color = new MeasurableDimension(
			_COLOR);

	private int order;

	private MeasurableDimension(int order) {
		super(UnitOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}

	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}

	public String getClassURI() {
		return MY_URI;
	}

	public static MeasurableDimension getmeasurableDimensionByOrder(int order) {
		switch (order) {
		case _LENGTH:
			return Length;
		case _MASS:
			return Mass;
		case _TIME:
			return Time;
		case _CURRENT:
			return Current;
		case _TEMPERATURE:
			return Temperature;
		case _LUMINANCE:
			return Luminance;
		case _SUBSTANCE_AMMOUNT:
			return SubstanceAmmount;
		case _ADIEMNSIONAL:
			return Adiemnsional;
		case _COMPUTER_STORAGE:
			return ComputerStorage;
		case _DERIVED:
			return Derived;
		case _CURRENCY:
			return Currency;
		case _ROTATION:
			return Rotational;
		case _COLOR:
			return Color;
		default:
			return null;
		}
	}

	public boolean equals(Object other) {
		return other instanceof MeasurableDimension
				&& ((MeasurableDimension) other).order == order;
	}

	public static final MeasurableDimension valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(UnitOntology.NAMESPACE))
			name = name.substring(UnitOntology.NAMESPACE.length());

		for (int i = _LENGTH; i <= _CURRENCY; i++)
			if (names[i].equals(name))
				return getmeasurableDimensionByOrder(i);

		return null;
	}
}
