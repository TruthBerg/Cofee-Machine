package edu.bu.met.cs665.Decorator;

import edu.bu.met.cs665.Beverage.Beverage;

/**
 * Factory interface for adding beverage condiments
 * 
 * @author emmettgreenberg
 *
 */

public interface CondimentFactory {
	Beverage create(Beverage bev);
}
