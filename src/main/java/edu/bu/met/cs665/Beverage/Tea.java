package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.Behavior.SteepBehavior;

/**
 * An abstract class for representing tea types
 * 
 * @author emmettgreenberg
 *
 */

public abstract class Tea extends Beverage {
	protected String name;
	protected SteepBehavior steepBehavior;
	protected int waterTemp;
	protected int steepTime;

	public void prepare() {
		steepBehavior.steep(waterTemp, steepTime);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
