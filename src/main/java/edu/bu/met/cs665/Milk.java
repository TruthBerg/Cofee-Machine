package edu.bu.met.cs665;

public class Milk extends CondimentDecorator {

	private static final Integer[] QUANTITIES = new Integer[] {0, 1, 2, 3};
	
	Beverage beverage;
	String name;
	int quantity; // amount to be added to Beverage: 0-3 Tbsp

	

	public Milk(Beverage beverage, int quantity) {
		
		this.beverage = beverage;
		this.quantity = quantity;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + String.format(", %d Tbsp milk", quantity);
	}

	@Override
	public void prepare() {
		//preparing behavior
	}

	/**
	 * @return the quantities
	 */
	public static Integer[] getQuantities() {
		return QUANTITIES;
	}
	
	

}
