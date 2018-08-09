package edu.bu.met.cs665.Behavior;

/**
 * This class implements the brewing procedure for an Americano
 * 
 * @author emmettgreenberg
 *
 */

public class AmericanoBrew implements BrewBehavior {

	public void brew() {
		System.out.println("Brewing an Americano...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done.");

	}

}
