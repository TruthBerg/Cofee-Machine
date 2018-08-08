package edu.bu.met.cs665;

public class ChamomileTea extends Tea {

	public ChamomileTea() {
		name = "Chamomile Tea";
		setDescription("chamomile tea");
		
		steepBehavior = new TeaSteep();
		waterTemp = 200;
		steepTime = 30;
	}
	

}
