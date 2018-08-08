package edu.bu.met.cs665;

public class Espresso extends Coffee{

	//BrewBehavior brewBehavior;

	public Espresso() {
		this.setName("Espresso");
		setDescription("espresso");
		brewBehavior = new EspressoBrew(); //getting the brew behavior
		
	}

}
