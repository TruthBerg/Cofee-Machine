
package edu.bu.met.cs665.Decorator;

import edu.bu.met.cs665.Beverage.Beverage;

/**
 * Decorator class for wrapping beverages with condiments such as milk and sugar
 * 
 * @author emmettgreenberg
 */

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	protected Integer quantity;
	protected String description;

	public CondimentDecorator(Beverage bev, Integer qty) {
		beverage = bev;
		quantity = qty;

	}

	@Override
	public void prepare() {
		System.out.println("Adding " + this.description + "...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done.");
	}

	public String getDescription() {
		return description;
	}

}
