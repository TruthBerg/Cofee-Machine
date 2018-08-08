/**
 * Concrete class containing the tea-steeping behavior
 */

package edu.bu.met.cs665;

public class TeaSteep implements SteepBehavior {
	SteepBehavior steepBehavior;
	

	public void steep(int temperature, int time ) {
		
		// Heating water...
		System.out.println(String.format("Heating water to %d degrees Fahrenheit...", temperature));
		
		// Pausing for one second...
		try {
		    Thread.sleep(1000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		// Steeping...
		System.out.println(String.format("Steeping your tea for %d seconds...", time));
		
	}



}
