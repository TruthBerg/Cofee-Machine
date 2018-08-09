package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.Behavior.TeaSteep;

/**
 * This class represents chamomile tea
 * 
 * @author emmettgreenberg
 *
 */

public class ChamomileTea extends Tea {

	public ChamomileTea() {
		name = "Chamomile Tea";

		steepBehavior = new TeaSteep();
		waterTemp = 200;
		steepTime = 30;
	}

}
