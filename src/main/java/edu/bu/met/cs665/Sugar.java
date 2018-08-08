package edu.bu.met.cs665;

public class Sugar extends CondimentDecorator {
	Beverage beverage;
	int quantity; // amount to be added to Beverage: 0-3 tsp

	private static final Integer[] QUANTITIES = new Integer[] {0, 1, 2, 3};
	
	public Sugar(Beverage beverage, int quantity) {
		this.beverage = beverage;
		this.quantity = quantity;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + String.format(", %d tsp sugar", quantity);
	}

	@Override
	public void prepare() {
		//preparing behavior
	}

}
