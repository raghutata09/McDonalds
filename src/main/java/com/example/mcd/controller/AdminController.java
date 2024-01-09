package com.example.mcd.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import com.example.mcd.model.domain.Item;
import com.example.mcd.model.domain.Product;
import com.example.mcd.service.AdminService;

@RestController
public class AdminController {
	private final static Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	public AdminService adminService;
	
	@GetMapping("/addStock")
	public String getAvaialbleData() {
		logger.info("Raghu -----------------------1");
		List<Item> itemList = new ArrayList<Item>();
		Item item = new Item();
		item.name = "Bun";
		item.qty = 5;
		itemList.add(item);
		
		item = new Item();
		item.name = "Potato";
		item.qty = 200;
		itemList.add(item);
		
		item = new Item();
		item.name = "Chillies";
		item.qty = 100;
		itemList.add(item);
		
		
		return adminService.addInInventory(itemList);
	}

}
