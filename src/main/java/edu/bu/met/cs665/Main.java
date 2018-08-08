package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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

		// myMenu.addItem(new MenuItem("C1", "Regular coffee"));
		// myMenu.addItem(new MenuItem("C2", "Espresso"));
		// myMenu.addItem(new MenuItem("C3", "Americano"));
		// myMenu.addItem(new MenuItem("T1", "Black Tea"));
		// myMenu.addItem(new MenuItem("T2", "Green Tea"));
		// myMenu.addItem(new MenuItem("T3", "Chamomile Tea"));

		// use factory pattern to create an espresso coffee beverage
		BeverageFactory coffeeCreator = new CreateCoffeeFactory();

		BeverageFactory teaCreator = new CreateTeaFactory();
		// Beverage myCoffee = coffeeCreator.create("Espresso");

		System.out.println();

		// try to create a coffee type that is not supported
		// myCoffee = coffeeCreator.create("bumble");

		System.out.println("Hi! What would you like to drink today?\n");

		// display the menu
		myMenu.printItems();

		// ask user for coffee (A)
		String input = "";
		while (!myMenu.getItemIds().contains(input)) {

			System.out.println("Please enter your choice (e.g. 'C1' or 'c1' for 'Regular coffee'):");
			input = scan.nextLine().toUpperCase();
		}

		String bevName = myMenu.getItems().get(input);
		Beverage myBev;
		if (input.startsWith("C")) {
			myBev = coffeeCreator.create(bevName);

		} else {
			myBev = teaCreator.create(bevName);
		}

		// add milk

		List<Integer> milkQuantites = Arrays.asList(Milk.getQuantities());
		System.out.println("milk qu " + milkQuantites);
		Integer qty = -1;
		while (! milkQuantites.contains(qty)) {
			System.out.println("Care for some milk? You may add 0-3 units: ");
			qty = scan.nextInt();
		}
		System.out.println(qty);
			
		myBev = new Milk(myBev, qty); // wraps beverage in condiment (i.e. the
		//// decorator pattern)
		////
		//// // Add sugar
		//// n = -1;
		//// while (n < 0 || n > 3) {
		//// System.out.println("Would you like to add any sugar (0-3 tsp?)\n(Enter an
		//// integer 0-3)");
		//// n = input.nextInt();
		//// }
		//// beverage = new Sugar(beverage, n);
		////

	}

}
