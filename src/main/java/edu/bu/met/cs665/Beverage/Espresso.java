package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.Behavior.EspressoBrew;

/**
 * This class represents an Espresso
 * 
 * @author emmettgreenberg
 *
 */

public class Espresso extends Coffee {

	public Espresso() {
		name = "Espresso";
		brewBehavior = new EspressoBrew(); // getting the brew behavior

	}

}
