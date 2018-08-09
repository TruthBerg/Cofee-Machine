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

public class CreateSugarFactory implements CondimentFactory {
	Scanner scan = new Scanner(System.in);

	private static final Integer[] QUANTITIES = new Integer[] { 0, 1, 2, 3 };

	public Beverage create(Beverage bev) {
		List<Integer> sugarQuantites = Arrays.asList(QUANTITIES);
		Integer qty = -1;
		while (!sugarQuantites.contains(qty)) {
			System.out.println("Care for some sugar? You may add 0-3 units: ");
			try {
				qty = scan.nextInt();
				if (qty > 3 || qty < 0) {
					continue;
				}
			} catch (InputMismatchException ime) {
				System.out.println("Invalid input. No sugar added.");
				qty = 0;
			}

		}

		Beverage bevWithSugar = new Sugar(bev, qty);

		System.out.println("One " + bevWithSugar.getName() + " coming your way!\n");
		if (qty != 0) {
			bevWithSugar.prepare();
		}

		return bevWithSugar;
	}

}
