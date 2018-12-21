/*******************************************************************************
 * Copyright 2018 PHAM Van Cu, Tan laboratory, Japan Advanced Institute of Science and Technology (JAIST),
 *  Japan as a part of the CARESSES project (http://www.caressesrobot.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.universAAL.ontology.echonetontology.values;


import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonetontology.EchonetOntology;

public class AutomaticHeatingMenu extends ManagedIndividual{

	protected AutomaticHeatingMenu(String uri) {
		super(uri);
	}
	public static final String MY_URI = EchonetOntology.NAMESPACE + "AutomaticHeatingMenu";
	
	public static final int FULLY_AUTOMATIC = 0;
	public static final int REHEATING_BOILED_RICE = 1;
	public static final int REHEATING_COOKED_DISH = 2;
	public static final int WARM_SAKE = 3;
	public static final int WARM_MILK = 4;
	public static final int BOILING_LEAFY_VEGETABLES = 5;
	public static final int BOILING_FRUIT_FLOWER_VEGETABLES = 6;
	public static final int BOILING_ROOT_VEGETABLES = 7;
	public static final int DEFROSTING_MEAT = 8;
	public static final int DEFROSTING_SASHIMI = 9;
	public static final int GRILL_HAMBURGER_STEAKS = 10;
	public static final int BAKE_GRATINS = 11;
	public static final int MAKE_CHAWAN_MUSHI = 12;
	public static final int COOKING_RICE = 13;
	public static final int REHEATING_FRIES = 14;
	public static final int FRIES = 15;
	public static final int BAKE_SPONGE_CAKES = 16;
	public static final int BAKE_CHIFFON_CAKES = 17;
	public static final int BAKE_COOKIES = 18;
	public static final int BAKE_CREAM_PUFFS= 19;
	public static final int BAKE_ROLLS = 20;
	public static final int TOAST_BREAD = 21;
	public static final int USER_DEFINE = 22;
	public static final int NOT_SPECIFIED = 23;

	private static final String[] names = { "fullyAutomatic", "reheatingBoiledRice","reheatingCookedDish","warmSake","warmMilk","boilingLeafyVegetables",
											"boilingFruitFlowerVegetables","boilingRootVegetables","defrostingMeat","defrostingSashimi","grillHamburgerSteak",
											"bakeGratin","makeChawanMushi","cookingRice","reheatingFries","fries","bakeSpongeCakes","bakeChiffonCakes",
											"bakeCookies","bakeCreamPuffs","bakeRolls","toastBread","userDefine","notSpecified"};
	
	public static final AutomaticHeatingMenu FullyAutomatic = new AutomaticHeatingMenu(FULLY_AUTOMATIC);
	public static final AutomaticHeatingMenu ReheatingBoiledRice = new AutomaticHeatingMenu(REHEATING_BOILED_RICE);
	public static final AutomaticHeatingMenu ReheatingCookedDish = new AutomaticHeatingMenu(REHEATING_COOKED_DISH);
	public static final AutomaticHeatingMenu WarmSake = new AutomaticHeatingMenu(WARM_SAKE);
	public static final AutomaticHeatingMenu WarmMilk = new AutomaticHeatingMenu(WARM_MILK);
	public static final AutomaticHeatingMenu BoilingLeafyVegetables = new AutomaticHeatingMenu(BOILING_LEAFY_VEGETABLES);
	public static final AutomaticHeatingMenu BoilingFruitFlowerVegetables = new AutomaticHeatingMenu(BOILING_FRUIT_FLOWER_VEGETABLES);
	public static final AutomaticHeatingMenu BoilingRootVegetables = new AutomaticHeatingMenu(BOILING_ROOT_VEGETABLES);
	public static final AutomaticHeatingMenu DefrostingMeat = new AutomaticHeatingMenu(DEFROSTING_MEAT);
	public static final AutomaticHeatingMenu DefrostingSashimi = new AutomaticHeatingMenu(DEFROSTING_SASHIMI);
	public static final AutomaticHeatingMenu GrillHamburgerSteak = new AutomaticHeatingMenu(GRILL_HAMBURGER_STEAKS);
	public static final AutomaticHeatingMenu BakeGratin = new AutomaticHeatingMenu(BAKE_GRATINS);
	public static final AutomaticHeatingMenu MakeChawanMushi = new AutomaticHeatingMenu(MAKE_CHAWAN_MUSHI);
	public static final AutomaticHeatingMenu CookingRice = new AutomaticHeatingMenu(COOKING_RICE);
	public static final AutomaticHeatingMenu ReheatingFries = new AutomaticHeatingMenu(REHEATING_FRIES);
	public static final AutomaticHeatingMenu Fries = new AutomaticHeatingMenu(FRIES);
	public static final AutomaticHeatingMenu BakeSpongeCakes = new AutomaticHeatingMenu(BAKE_SPONGE_CAKES);
	public static final AutomaticHeatingMenu BakeChiffonCakes = new AutomaticHeatingMenu(BAKE_CHIFFON_CAKES);
	public static final AutomaticHeatingMenu BakeCookies = new AutomaticHeatingMenu(BAKE_COOKIES);
	public static final AutomaticHeatingMenu BakeCreamPuffs = new AutomaticHeatingMenu(BAKE_CREAM_PUFFS);
	public static final AutomaticHeatingMenu BakeRolls = new AutomaticHeatingMenu(BAKE_ROLLS);
	public static final AutomaticHeatingMenu ToastBread = new AutomaticHeatingMenu(TOAST_BREAD);
	public static final AutomaticHeatingMenu UserDefine = new AutomaticHeatingMenu(USER_DEFINE);
	public static final AutomaticHeatingMenu NotSpecified = new AutomaticHeatingMenu(NOT_SPECIFIED);

	
	
	private int order;

	private AutomaticHeatingMenu(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static AutomaticHeatingMenu getAutomaticHeatingMenuByOrder(int order) {
		switch (order) {
		case FULLY_AUTOMATIC:
			return FullyAutomatic;
		case REHEATING_BOILED_RICE:
			return ReheatingBoiledRice;
		case REHEATING_COOKED_DISH:
			return ReheatingCookedDish;
		case WARM_SAKE:
			return WarmSake;
		case WARM_MILK:
			return WarmMilk;
		case BOILING_LEAFY_VEGETABLES:
			return BoilingLeafyVegetables;
		case BOILING_FRUIT_FLOWER_VEGETABLES:
			return BoilingFruitFlowerVegetables;
		case BOILING_ROOT_VEGETABLES:
			return BoilingRootVegetables;
		case DEFROSTING_MEAT:
			return DefrostingMeat;
		case DEFROSTING_SASHIMI:
			return DefrostingSashimi;
		case GRILL_HAMBURGER_STEAKS:
			return GrillHamburgerSteak;
		case BAKE_GRATINS:
			return BakeGratin;
		case MAKE_CHAWAN_MUSHI:
			return MakeChawanMushi;
		case COOKING_RICE:
			return CookingRice;
		case REHEATING_FRIES:
			return ReheatingFries;
		case FRIES:
			return Fries;
		case BAKE_SPONGE_CAKES:
			return BakeSpongeCakes;
		case BAKE_CHIFFON_CAKES:
			return BakeChiffonCakes;
		case BAKE_COOKIES:
			return BakeCookies;
		case BAKE_CREAM_PUFFS:
			return BakeCreamPuffs;
		case BAKE_ROLLS:
			return BakeRolls;
		case TOAST_BREAD:
			return ToastBread;
		case USER_DEFINE:
			return UserDefine;
		case NOT_SPECIFIED:
			return NotSpecified;
		default:
			return null;
		}
	}

	public static final AutomaticHeatingMenu valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = FULLY_AUTOMATIC; i <= NOT_SPECIFIED; i++)
			if (names[i].equals(name))
				return getAutomaticHeatingMenuByOrder(i);
		return null;
	}
	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
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

}
