package com.example.mcd.model.dao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheesyMexican extends Burger {

	@Override
	public String getName() {
		return "Cheesy Mexican Burger";
	}
}
