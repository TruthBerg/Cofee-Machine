//package edu.bu.met.cs665;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Client {
//
//	public Client() {
//		
//	}
//	// start the bvg automatic process
//	//public void start() {
//	
//	public void init() {
//		
//		// use factory pattern to create an espresso coffee beverage
//		//CoffeeFactory coffeeCreator = (CoffeeFactory) new CreateCoffeeFactory();
//		//Coffee myCoffee = coffeeCreator.createCoffee("espresso");
//		
//		// try to create a coffee type that is not supported
//		//myCoffee = coffeeCreator.createCoffee("bumble");
//		
//		
////		@SuppressWarnings("resource")
////		Scanner input = new Scanner(System.in);
////		
////		//ArrayList coffeeOptions = new ArrayList<String>();
////		//ArrayList teaOptions = new ArrayList<String>();
////		//ArrayList milkOptions = new ArrayList<String>();
////		//ArrayList sugarOptions = new ArrayList<String>();
////		
////		//coffeeOptions.add("regular");
////		//System.out.println(coffeeOptions.get(0));
////		
////		ArrayList<Beverage> coffeeItems = new ArrayList<Beverage>();
////		coffeeItems.add(new RegularCoffee());
////		coffeeItems.add(new Espresso());
////		coffeeItems.add(new Americano());
////		
////		ArrayList<String> coffeeMenu = new ArrayList<String>();
////		for (Beverage bev: coffeeItems) {
////			coffeeMenu.add(bev.getDescription());
////		}
////		
////		ArrayList<Beverage> teaItems = new ArrayList<Beverage>();
////		teaItems.add(new BlackTea());
////		teaItems.add(new GreenTea());
////		teaItems.add(new Chamomile());
////		
////		ArrayList<String> teaMenu = new ArrayList<String>();
////		for (Beverage bev: teaItems) {
////			teaMenu.add(bev.getDescription());
////		}
////	
////		// Ask user if they want coffee or tea
////		String bevType = "";
////		while (!(bevType.equals("coffee")||bevType.equals("tea"))) {
////			//Scanner input = new Scanner(System.in);
////			System.out.println("Welcome!");
////			System.out.println("Would you like \"coffee\" or \"tea\"?\n(Enter your choice)");
////			bevType = input.nextLine().toLowerCase();
////		}
////
////		
////		// Display the coffee or tea options 
////		System.out.println(String.format("Here are your %s options:", bevType));
////		if (bevType.toLowerCase().equals("coffee")) {
////			// show coffee options
////			for (Beverage bev: coffeeItems) {
////				System.out.println(bev.getDescription());
////			}
////		} else if (bevType.equals("tea")) {
////			// show tea options
////			for (Beverage bev: teaItems) {
////				System.out.println(bev.getDescription());
////			}	
////		}
////		
////		// Get user's coffee or tea choice
////		String bevChoice = "";
////		System.out.println("(Enter your choice)");
////		bevChoice = input.nextLine();
////		
////		// Prepare the beverage of the user's choice
////		Beverage beverage = null;
////		
////		if (bevType.toLowerCase().equals("coffee")) {
////			for (Beverage bvg: coffeeItems) {
////				if(bvg.getDescription().equals(bevChoice)) {
////					beverage = bvg;
////				}
////			}
////		}
////		else if (bevType.toLowerCase().equals("tea")) {
////			for (Beverage bvg: teaItems) {
////				if(bvg.getDescription().equals(bevChoice)) {
////					beverage = bvg;
////				}
////			}
////		}
////		beverage.prepare();
////		
////		// Add milk
////		int n = -1;
////		while (n < 0 || n > 3) {
////			System.out.println("Would you like to add any milk (0-3 Tbsp?)\n(Enter an integer 0-3)");
////			n = input.nextInt();
////		}
////		beverage = new Milk(beverage, n); // wraps beverage in condiment (i.e. the decorator pattern)
////		
////		// Add sugar
////		n = -1;
////		while (n < 0 || n > 3) {
////			System.out.println("Would you like to add any sugar (0-3 tsp?)\n(Enter an integer 0-3)");
////			n = input.nextInt();
////		}
////		beverage = new Sugar(beverage, n);
////	
////		
////		System.out.println(String.format("Your %s is ready. Please enjoy!", beverage.getDescription()));
////		 
//	}
//
//}
