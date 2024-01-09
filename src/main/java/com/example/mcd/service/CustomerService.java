package com.example.mcd.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mcd.model.domain.CustomerOrder;
import com.example.mcd.model.domain.Order;
import com.example.mcd.utilities.OrderUtilities;

@Service
public class CustomerService {
	private final static Logger logger = LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	public OrderUtilities orderUtilities;

	public List<String> showMenu() {
		List<String> menuList = new ArrayList<>();
		menuList.add("Peri Peri Fries");
		menuList.add("Cheesy Loaded Fries");
		menuList.add("Cheesy Mexican Burger");
		menuList.add("Maharaja Burger");
		menuList.add("Spicy Paneer Burger");
		
		return menuList;
	}

	public Order takeOrder(List<CustomerOrder> customerOrder) {
		Order order = orderUtilities.makeOrder(customerOrder);
		return order;
	}
	
	

}
