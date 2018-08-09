package edu.bu.met.cs665.Decorator;

import edu.bu.met.cs665.Beverage.Beverage;

public class Milk extends CondimentDecorator {

	public static final Integer[] QUANTITIES = new Integer[] { 0, 1, 2, 3 }; // stores the possible quantities that can be added to the beverage

	public Milk(Beverage bvg, int qty) {
		super(bvg, qty);
		this.description = quantity + " units milk";
		this.setName(beverage.getName() + ", " + this.getDescription());
	}

	/**
	 * @return the quantities
	 */
	public static Integer[] getQuantities() {
		return QUANTITIES;
	}
}
