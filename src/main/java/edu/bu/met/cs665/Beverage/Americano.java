package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.Behavior.AmericanoBrew;

/**
 * This class represents an Americano coffee
 * 
 * @author emmettgreenberg
 *
 */

public class Americano extends Coffee {

	public Americano() {
		name = "Americano";
		brewBehavior = new AmericanoBrew(); // getting the brew behavior for an Americano
	}

}
