
package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.Behavior.BrewBehavior;

/**
 * Abstract class for coffee-type objects
 * 
 * @author emmettgreenberg
 */

public abstract class Coffee extends Beverage {

	protected String name;
	protected BrewBehavior brewBehavior; // contains the procedure for brewing coffee

	/**
	 * the procedure for preparing coffee
	 */
	public void prepare() {
		brewBehavior.brew();
	}

	public String getName() {
		return name;
	}

}
