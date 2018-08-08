package edu.bu.met.cs665;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestMenuItems {

	@Test
	void createMenuItems() {
		ArrayList<MenuItem> menu = new ArrayList<>();
		
		menu.add(new MenuItem("C1", "Regualar coffee"));
		assertTrue(menu.get(0) instanceof MenuItem);
	}

}
