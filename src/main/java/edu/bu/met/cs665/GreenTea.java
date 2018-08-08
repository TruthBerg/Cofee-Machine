package edu.bu.met.cs665;

public class GreenTea extends Tea {

	
	public GreenTea() {
		name = "Green Tea";
		
		setDescription("green tea");
		
		steepBehavior = new TeaSteep();
		waterTemp = 180;
		steepTime = 20;
	}

}
