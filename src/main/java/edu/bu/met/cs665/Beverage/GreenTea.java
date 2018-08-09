package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.Behavior.TeaSteep;

/**
 * This class represents a green tea
 * 
 * @author emmettgreenberg
 *
 */

public class GreenTea extends Tea {

	public GreenTea() {
		name = "Green Tea";

		steepBehavior = new TeaSteep();
		waterTemp = 180;
		steepTime = 20;
	}

}
