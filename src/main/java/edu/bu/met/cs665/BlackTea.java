package edu.bu.met.cs665;

public class BlackTea extends Tea {
	//private int steepTime;
	
	public BlackTea() {
		name = "Black Tea";
		
		setDescription("black tea");
		
		steepBehavior = new TeaSteep();
		waterTemp = 180;
		steepTime = 25;
	}

}
