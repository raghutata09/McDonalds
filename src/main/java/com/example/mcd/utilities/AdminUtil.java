package com.example.mcd.utilities;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.mcd.model.domain.Item;
import com.example.mcd.service.AdminService;

public class AdminUtil {
	private final static Logger logger = LoggerFactory.getLogger(AdminUtil.class);
	
	
	private InventoryManager inventoryManager;
	
	private static AdminUtil adminUtil = null;
	
	private AdminUtil() {
		try {
			if(inventoryManager ==null) {
				inventoryManager = new InventoryManager();
			}
		} catch (Exception e) {
            // Handle the exception if needed
            logger.error("Error initializing AdminUtil: {}", e.getMessage());
        }
	}
	
	
	public static AdminUtil getInstance() {
		if(adminUtil == null) {
			adminUtil = new AdminUtil();
		}
		return adminUtil;
	}
	
	public String addProductInInventory(List<Item> itemList) {
		
		for(int i =0 ;i<itemList.size();i++) {
			Item item = itemList.get(i);
			inventoryManager.addItemName(item.name).addItemQty(item.qty).save();
		}
		
		return "Products Added";
	}

	
}
