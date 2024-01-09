package com.example.mcd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import com.example.mcd.model.dao.BurgerType;
import com.example.mcd.model.dao.CheeseType;
import com.example.mcd.model.dao.FoodType;
import com.example.mcd.model.dao.FriesType;
import com.example.mcd.model.domain.CustomerOrder;
import com.example.mcd.model.domain.Order;
import com.example.mcd.service.CustomerService;
import com.example.mcd.utilities.*;

import io.micrometer.common.lang.NonNull;

@RestController
public class CustomerController {
	
	private final static Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerService customerService;
	
	
	@GetMapping("/showMenu")
	public List<String> showMcdMenu() {
		return customerService.showMenu();
	}
	
//	@PostMapping("/takeOrder")
//	public List<String> takeOrder(@RequestBody @NonNull CustomerOrder customerOrder) {
//		return customerService.showMenu();
//	}
	
	@GetMapping("/takeOrder")
	public Order takeOrder() {
		List<CustomerOrder> customerOrderList = new ArrayList<CustomerOrder>();
		BurgerFactory  factory = new BurgerFactory("MahaRajaBurger");
		CustomerOrder customerOrder = new CustomerOrder();
		
		customerOrder.foodType = FoodType.BURGER;
		customerOrder.burger = factory.getBurger();
		customerOrder.burger.burgerType = BurgerType.Vegeterian;
		customerOrder.burger.cheeseType = CheeseType.DoubleCheese;
		customerOrder.qty = 2;
		customerOrderList.add(customerOrder);
		
		
		FriesFactory friesFactory = new FriesFactory("PeriPeriFries");
		customerOrder = new CustomerOrder();
		customerOrder.foodType = FoodType.FRIES;
		customerOrder.fries = friesFactory.getFries();
		customerOrder.fries.friesType = FriesType.Large;
		customerOrder.qty = 3;
		customerOrderList.add(customerOrder);
		
//		int id = 1;
		return customerService.takeOrder(customerOrderList);
	}

}
