package edu.bu.met.cs665.Decorator;

import edu.bu.met.cs665.Beverage.Beverage;

public class Sugar extends CondimentDecorator {

	private final Integer[] QUANTITIES = new Integer[] {0, 1, 2, 3};
	
	public Sugar(Beverage bev, Integer qty) {
		super(bev, qty);
		this.description = quantity + " units sugar";
		this.setName(beverage.getName() + ", " + this.description);
	}

	/**
	 * @return the quantities
	 */
	public Integer[] getQuantities() {
		return QUANTITIES;
	}

}
