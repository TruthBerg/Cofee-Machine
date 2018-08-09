package edu.bu.met.cs665;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.bu.met.cs665.Beverage.Beverage;
import edu.bu.met.cs665.Beverage.Espresso;
import edu.bu.met.cs665.Beverage.RegularCoffee;
import edu.bu.met.cs665.BeverageFactory.BeverageFactory;
import edu.bu.met.cs665.BeverageFactory.CreateCoffeeFactory;

class TestCoffee {
	BeverageFactory coffeeCreator = new CreateCoffeeFactory();
	Beverage myCoffee;

	@Test
	void createEspresso() {
		myCoffee = coffeeCreator.create("espresso");
		assertTrue(myCoffee instanceof Espresso);
	}
	
	@Test
	void createRegular() {
		myCoffee = coffeeCreator.create("regular");
		assertTrue(myCoffee instanceof RegularCoffee);
	}

}
