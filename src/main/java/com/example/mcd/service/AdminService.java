package com.example.mcd.service;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.mcd.controller.AdminController;
import com.example.mcd.model.dao.FoodType;
import com.example.mcd.model.domain.CustomerOrder;
import com.example.mcd.model.domain.Item;
import com.example.mcd.model.domain.Order;
import com.example.mcd.model.domain.Product;
import com.example.mcd.utilities.AdminUtil;

@Service
public class AdminService {
	private final static Logger logger = LoggerFactory.getLogger(AdminService.class);
	

	public String addInInventory(List<Item> itemList) {
		logger.info("Raghu -----------------------2");
		AdminUtil adminUtil = AdminUtil.getInstance();
		logger.info("Raghu -----------------------3");
		return adminUtil.addProductInInventory(itemList);
	}
	
	
}
