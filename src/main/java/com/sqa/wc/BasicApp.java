/**
 *   File Name: BasicApp.java<br>
 *
 *   Chan, William<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 4, 2017
 *
 */

package com.sqa.wc;

import com.sqa.wc.helpers.*;

/**
 * BasicApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chan, William
 * @version 1.0.0
 * @since 1.0
 *
 */
public class BasicApp {

	/**
	 * Core method to run as Application
	 *
	 * @param args
	 *            supplied arguments to main method
	 */

	static String appName = "Pet Registration";

	public static void main(String[] args) {
		String user = AppBasics.welcomeUserAndName(appName);
		registerPets();
		AppBasics.farewellUser(appName, user);

	}

	/**
	 *
	 */
	private static void registerPets() {
		int i = 0;
		float priceOfRegistration = 45;
		float costToRegister = 0;
		int numOfPets = AppBasics.requestInt("How many pets do you want to register?");
		while (i < numOfPets) {
			int yearsToRegister = AppBasics.requestInt("How many years to register the pet # " + (i + 1) + "?");
			costToRegister += yearsToRegister * priceOfRegistration;
			i++;
		}
		System.out.println("Total price to register the pets is $" + costToRegister + ".");

	}

}
