package edu.bu.met.cs665;

import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * This class represents a menu for coffee and tea items
 * @author emmettgreenberg
 *
 */

public class Menu {
	private Map<String, String> items;
	
	
	public Menu() {
		items = new HashMap<String, String>();
	}
	
	/**
	 * put the <key, value> pair in the hashed map of menu items
	 * @param menu_id
	 * @param name
	 */
	public void addItem(String menu_id, String name) {
		items.put(menu_id, name);
	}
	
	/**
	 * remove the <key, value> pair in the hashed map of menu items
	 * @param menu_id
	 * @param name
	 */
	public void removeItem(String menu_id, String name) {
		items.remove(menu_id, name);
	}
	
	/**
	 * retrieve the hashed map of menu items
	 * @return
	 */
	public Map<String, String> getItems() {
		return items;
	}
	
	/**
	 * retrieve the set of keys in the hashed map of menu items
	 * @return
	 */
	public Set<String> getItemIds(){
		return items.keySet();
	}
	
	/**
	 * retrieve the set of values in hashed map of menu items
	 * @return
	 */
	public Collection<String> getItemNames(){
		return items.values();
	}
	
	/**
	 * display each <key, value> pair in the hashed map of menu items
	 */
	public void printItems() {
		System.out.println("*** MENU ***");
		
		// sort the keys
		SortedSet<String> menuKeys = new TreeSet<>(items.keySet());
		for (String menu_id: menuKeys) {
			System.out.println(menu_id  + ". " + items.get(menu_id));
		}
		System.out.println();
	}
	
}
