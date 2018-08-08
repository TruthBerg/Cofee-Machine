/**
 * Decorator class for wrapping beverages with condiments
 */
package edu.bu.met.cs665;

public abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription(); // condiment decorators must re-implement this method

}
