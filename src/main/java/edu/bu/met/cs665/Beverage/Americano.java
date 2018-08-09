package edu.bu.met.cs665;

public class Americano extends Coffee{

	public Americano() {
		this.setName("Americano");
		setDescription("americano");
		brewBehavior = new AmericanoBrew(); //getting the brew behavior
	}

}
