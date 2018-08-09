package edu.bu.met.cs665;

public class CreateCoffeeFactory implements BeverageFactory {

	public Beverage create(String type) {
		// TODO Auto-generated method stub
		Coffee coffee = null;
		
		if (type.equalsIgnoreCase("espresso")) {
			coffee = new Espresso();
		}
		
		else if (type.equalsIgnoreCase("americano")) {
			coffee = new Americano();
		}
		
		else if (type.equalsIgnoreCase("regular coffee")) {
			coffee = new RegularCoffee();
		}
		
		else {
			System.out.println("I don't understand the requested coffee type \"" + type + "\".");
		}
		
		if (coffee != null) {
			System.out.println("One " + coffee.getName() + " coming your way!");
		}
		
		return coffee;
	}

}
