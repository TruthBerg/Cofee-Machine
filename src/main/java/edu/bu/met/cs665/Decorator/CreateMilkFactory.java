package edu.bu.met.cs665.Decorator;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.bu.met.cs665.Beverage.Beverage;

/**
 * Added factory class for implementing beverage condiments
 * 
 * @author emmettgreenberg
 *
 */

public class CreateMilkFactory implements CondimentFactory {

	Scanner scan = new Scanner(System.in);
	private static final Integer[] QUANTITIES = new Integer[] { 0, 1, 2, 3 };

	/**
	 * Creates new beverage by decorating the beverage with the condiment
	 * 
	 * @Override
	 */
	public Beverage create(Beverage bev) {
		List<Integer> milkQuantites = Arrays.asList(QUANTITIES);
		Integer qty = -1;
		while (!milkQuantites.contains(qty)) {
			// Added exception handling
			try {
				System.out.println("Care for some milk? You may add 0-3 units: ");
				qty = scan.nextInt();
				if (qty > 3 || qty < 0) {
					continue;
				}
			} catch (InputMismatchException ime) {
				System.out.println("Invalid input. No milk added.");
				qty = 0;
			}
		}

		Beverage bevWithMilk = new Milk(bev, qty);

		System.out.println("One " + bevWithMilk.getName() + " coming your way!\n");

		if (qty != 0) {
			bevWithMilk.prepare();
		}

		return bevWithMilk;
	}

}
