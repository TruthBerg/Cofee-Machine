package edu.bu.met.cs665.Behavior;

/**
 * This class implements the brewing procedure for an Espresso
 * 
 * @author emmettgreenberg
 *
 */

public class EspressoBrew implements BrewBehavior {

	public void brew() {
		System.out.println("Brewing espresso...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done.");

	}

}
