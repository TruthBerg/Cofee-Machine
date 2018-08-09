/**
 * The regular coffee object
 */
package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.Behavior.RegularBrew;

/**
 * This class represents a regular coffee
 * @author emmettgreenberg
 *
 */

public class RegularCoffee extends Coffee{

	public RegularCoffee() {
		name ="Regular Coffee";
		brewBehavior = new RegularBrew(); //getting the brew behavior
	}
}
