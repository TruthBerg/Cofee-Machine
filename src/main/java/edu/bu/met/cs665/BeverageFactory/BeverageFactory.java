package edu.bu.met.cs665.BeverageFactory;

import edu.bu.met.cs665.Beverage.Beverage;

/**
 * Added Factory interface for creating beverage
 * 
 * @author emmettgreenberg
 *
 */

public interface BeverageFactory {
	Beverage create(String type);

}
