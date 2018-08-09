/**
 * Abstract class for coffee-type objects
 */
package edu.bu.met.cs665;

public abstract class Coffee extends Beverage{
	
	int menu_id;
	BrewBehavior brewBehavior;
		
	public void prepare() {
		brewBehavior.brew();
	}
	


	
	public int getMenu_id() {
		return menu_id;
	}

}
