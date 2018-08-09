package edu.bu.met.cs665;

import java.util.Scanner;

import edu.bu.met.cs665.Beverage.Beverage;
import edu.bu.met.cs665.BeverageFactory.BeverageFactory;
import edu.bu.met.cs665.BeverageFactory.CreateCoffeeFactory;
import edu.bu.met.cs665.BeverageFactory.CreateTeaFactory;
import edu.bu.met.cs665.Decorator.CondimentFactory;
import edu.bu.met.cs665.Decorator.CreateMilkFactory;
import edu.bu.met.cs665.Decorator.CreateSugarFactory;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// create menu
		Menu myMenu = new Menu();
		myMenu.addItem("C1", "Regular coffee");
		myMenu.addItem("C2", "Espresso");
		myMenu.addItem("C3", "Americano");
		myMenu.addItem("T1", "Black Tea");
		myMenu.addItem("T2", "Green Tea");
		myMenu.addItem("T3", "Chamomile Tea");

		// use factory pattern to create coffee and tea beverages
		BeverageFactory coffeeCreator = new CreateCoffeeFactory();
		BeverageFactory teaCreator = new CreateTeaFactory();

		System.out.println();

		System.out.println("Hi! What would you like to drink today?\n");

		// display the menu
		myMenu.printItems();

		// ask user for coffee
		String input = "";
		while (!myMenu.getItemIds().contains(input)) {

			System.out.println("Please enter your choice (e.g. 'C1' or 'c1' for 'Regular coffee'):");
			input = scan.nextLine().toUpperCase();
		}

		// create beverage using factory pattern
		String bevName = myMenu.getItems().get(input);
		Beverage myBev;
		if (input.startsWith("C")) {
			myBev = coffeeCreator.create(bevName);

		} else {
			myBev = teaCreator.create(bevName);
		}

		// add milk using condiment decorator class and factory class
		CondimentFactory milkCreator = new CreateMilkFactory();
		myBev = milkCreator.create(myBev);

		// add sugar using condiment decorator class and factory class
		CondimentFactory sugarCreator = new CreateSugarFactory();
		myBev = sugarCreator.create(myBev);

		// finish
		System.out.println("Your beverage is ready. Enjoy!");

	}

}
