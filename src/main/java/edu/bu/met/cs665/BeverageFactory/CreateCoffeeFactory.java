package edu.bu.met.cs665.BeverageFactory;

import edu.bu.met.cs665.Beverage.Americano;
import edu.bu.met.cs665.Beverage.Beverage;
import edu.bu.met.cs665.Beverage.Espresso;
import edu.bu.met.cs665.Beverage.RegularCoffee;

/**
 * Added factory class for creating a coffee based on the type
 * 
 * @author emmettgreenberg
 *
 */

public class CreateCoffeeFactory implements BeverageFactory {

	public Beverage create(String type) {
		// TODO Auto-generated method stub
		Beverage coffee = null;

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
			System.out.println("One " + coffee.getName() + " coming your way!\n");
			coffee.prepare();
		}

		return coffee;
	}

}
