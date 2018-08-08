package edu.bu.met.cs665;

public abstract class Tea extends Beverage {
	String name;
	SteepBehavior steepBehavior;
	int waterTemp;
	int steepTime;
	
	public void prepare() {
		steepBehavior.steep(waterTemp, steepTime);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	

}
