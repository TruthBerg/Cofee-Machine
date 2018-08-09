package edu.bu.met.cs665.Behavior;

public class RegularBrew implements BrewBehavior {

	/**
	 * This class implements the brewing procedure for a Regular coffee
	 * 
	 * @author emmettgreenberg
	 *
	 */
	public void brew() {
		System.out.println("Brewing regular coffee...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done.");
	}
}
