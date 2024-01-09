package com.example.mcd.model.dao;

import java.util.List;

public abstract class Burger {
	public int price;
	public int quantity;
	public BurgerType burgerType;
	public CheeseType cheeseType;
	public List<Ingredient> ingredients;
	
	abstract public String getName();


}
