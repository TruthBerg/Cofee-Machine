package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.Behavior.TeaSteep;

/**
 * This class represents a black tea
 * 
 * @author emmettgreenberg
 *
 */

public class BlackTea extends Tea {

	public BlackTea() {
		name = "Black Tea";

		steepBehavior = new TeaSteep();
		waterTemp = 180;
		steepTime = 25;
	}

}
