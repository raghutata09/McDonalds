package com.example.mcd.utilities;

import com.example.mcd.model.dao.Burger;
import com.example.mcd.model.dao.MaharajaBurger;
import com.example.mcd.model.dao.CheesyMexican;
import com.example.mcd.model.dao.SpicyPaneer;

public class BurgerFactory {
	
	private Burger burger;
	
	
	
	public BurgerFactory(String name) {
		if (name == "MahaRajaBurger") {
			burger = new MaharajaBurger();
        } else if (name == "CheesyMexicanBurger") {
			burger = new CheesyMexican();
        } else if (name == "SpicyPaneerBurger") {
			burger = new SpicyPaneer();
        }
	}
	
	
	public Burger getBurger() {
		
		return burger;
	}

}
