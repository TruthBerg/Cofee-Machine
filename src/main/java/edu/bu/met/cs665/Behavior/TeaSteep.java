
package edu.bu.met.cs665.Behavior;

/**
 * This class implements the steeping procedure for tea
 * 
 * @author emmettgreenberg
 *
 */

public class TeaSteep implements SteepBehavior {
	SteepBehavior steepBehavior;

	public void steep(int temperature, int time) {

		// Heating water...
		System.out.println(String.format("Heating water to %d degrees Fahrenheit...", temperature));

		// Pausing for one second...
		try {
			Thread.sleep(500); // 1000 milliseconds is one second.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Steeping...
		System.out.println(String.format("Steeping your tea for %d seconds...", time));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Finished
		System.out.println("Done.");
	}

}
