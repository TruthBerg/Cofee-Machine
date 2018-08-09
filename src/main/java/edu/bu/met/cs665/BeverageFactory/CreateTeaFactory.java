package edu.bu.met.cs665.BeverageFactory;

import edu.bu.met.cs665.Beverage.Beverage;
import edu.bu.met.cs665.Beverage.BlackTea;
import edu.bu.met.cs665.Beverage.ChamomileTea;
import edu.bu.met.cs665.Beverage.GreenTea;

/**
 * Added factory class for creating a tea based on the type
 * 
 * @author emmettgreenberg
 *
 */

public class CreateTeaFactory implements BeverageFactory {

	public Beverage create(String type) {
		Beverage myTea = null;

		if (type.equalsIgnoreCase("black tea")) {
			myTea = new BlackTea();
		}

		else if (type.equalsIgnoreCase("green tea")) {
			myTea = new GreenTea();
		}

		else if (type.equalsIgnoreCase("chamomile tea")) {
			myTea = new ChamomileTea();
		}

		else {
			System.out.println("I don't understand the requested tea type " + type);
		}

		if (myTea != null) {
			System.out.println("One " + myTea.getName() + " coming your way!\n");
			myTea.prepare();

		}
		return myTea;

	}

}
