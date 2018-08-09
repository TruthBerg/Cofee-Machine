package edu.bu.met.cs665;

public class CreateTeaFactory implements BeverageFactory {

	public Tea create(String type) {
		Tea myTea = null;
		
		if (type.equalsIgnoreCase("black tea")) {
			myTea = new BlackTea();
		}
		
		else if (type.equalsIgnoreCase("green tea")){
			myTea = new GreenTea();
		}
		
		else if (type.equalsIgnoreCase("chamomile tea")){
			myTea = new ChamomileTea();
		}
		
		else {
			System.out.println("I don't understand the requested tea type " + type);
		}
		
		if (myTea != null) {
			System.out.println("One " + myTea.getName() + " coming your way!");
			
		}
		return myTea;

	}

}
