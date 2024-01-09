package com.example.mcd.utilities;

import com.example.mcd.model.dao.Burger;
import com.example.mcd.model.dao.CheesyLoadedFries;
import com.example.mcd.model.dao.CheesyMexican;
import com.example.mcd.model.dao.Fries;
import com.example.mcd.model.dao.MaharajaBurger;
import com.example.mcd.model.dao.PeriPeriFries;
import com.example.mcd.model.dao.SpicyPaneer;

public class FriesFactory {
	
	private Fries fries;
	
	public FriesFactory(String name) {
		if (name == "CheesyLoadedFries") {
			fries = new CheesyLoadedFries();
        } else if (name == "PeriPeriFries") {
        	fries = new PeriPeriFries();
        }
	}
	
	public Fries getFries() {
		
		return this.fries;
	}
	

}
