/**
 * The regular coffee object
 */
package edu.bu.met.cs665;

public class RegularCoffee extends Coffee{

	public RegularCoffee() {
		this.setName("Regular Coffee");
		setDescription("regular");
		brewBehavior = new RegularBrew(); //getting the brew behavior
	}
}
