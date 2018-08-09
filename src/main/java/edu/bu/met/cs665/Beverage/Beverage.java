package edu.bu.met.cs665.Beverage;

/**
 * An abstract class for representing beverages such as coffee and tea
 * 
 * @author emmettgreenberg
 *
 */

public abstract class Beverage {

	protected String name;

	/**
	 * the procedure for preparing the beverage
	 */
	public abstract void prepare(); // function for preparing the beverage

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
