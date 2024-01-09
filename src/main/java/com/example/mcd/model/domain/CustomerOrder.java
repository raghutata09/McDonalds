package com.example.mcd.model.domain;

import com.example.mcd.model.dao.Burger;
import com.example.mcd.model.dao.FoodType;
import com.example.mcd.model.dao.Fries;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerOrder {
	public Burger burger;
	public Fries fries;
	public int qty;
	public FoodType foodType;

}
