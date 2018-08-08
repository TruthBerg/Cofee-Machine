package edu.bu.met.cs665;

/**
 * This class represents a menu item for coffee or tea items
 * @author emmettgreenberg
 *
 */
public class MenuItem {
	private String id;
	private String name;
	
	
	public MenuItem(String item_id, String item_name) {
		id = item_id;
		name = item_name;
	}
	
	public String toString() {
		return id + ". " + name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
