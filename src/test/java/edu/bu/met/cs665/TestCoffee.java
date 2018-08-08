package edu.bu.met.cs665;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
