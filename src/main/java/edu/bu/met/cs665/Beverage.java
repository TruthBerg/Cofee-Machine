package edu.bu.met.cs665;

public abstract class Beverage {
	
	private String name;

	 private String description = "unknown beverage";
	  
	 public abstract void prepare(); // function for preparing the beverage

	 public String getDescription() {
		 return description;
	 }

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}
