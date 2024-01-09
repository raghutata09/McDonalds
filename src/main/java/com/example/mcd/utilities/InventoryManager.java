package com.example.mcd.utilities;

import lombok.Getter;
import lombok.Setter;

public class InventoryManager {
	
	private Inventory inventory;
	
	public InventoryManager() {
		this.inventory = new Inventory();
	}
	
	public InventoryManager addItemName(String name) {
		this.inventory.name = name;
		return this;
	}
	
	public InventoryManager addItemQty(int qty) {
		this.inventory.qty = qty;
		return this;
	}
	
	public Inventory save() {
		//Save in DB
		return this.inventory;
	}
	
	@Getter
	@Setter
	class Inventory{
		
		
		private String name;
		private int qty;
	}
	

}
