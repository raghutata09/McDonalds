	package com.example.mcd.utilities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mcd.model.dao.FoodType;
import com.example.mcd.model.domain.CustomerOrder;
import com.example.mcd.model.domain.Order;
import com.example.mcd.model.domain.Product;

@Service
public class OrderUtilities {
	
	public int GST_PRICE = 2;
	
	
	public Order makeOrder(List<CustomerOrder> customerOrderList) {
		
		int totalCost = 0;
		int gst = 0;
		
		Order order = new Order();
		
		List<Product> productList = new ArrayList<>();
		
		for(int co =0;co<customerOrderList.size();co++ ) {
			Product product = new Product();
			if(customerOrderList.get(co).foodType == FoodType.BURGER) {
				product.price = customerOrderList.get(co).qty * getPrice(customerOrderList.get(co).burger.getName());
				product.name = customerOrderList.get(co).burger.getName();
			}
			else if(customerOrderList.get(co).foodType == FoodType.FRIES){
				product.name = customerOrderList.get(co).fries.getName();
				product.price = customerOrderList.get(co).qty * getPrice(customerOrderList.get(co).fries.getName());
			}
			totalCost +=product.price;
			product.qty = customerOrderList.get(co).qty;
			productList.add(product);
			
		}
		
		order.productInfoList = productList;
		order.total = getTotal(totalCost);
		order.gst = GST_PRICE;
		return order;
		
	}
	
	public int getPrice(String name) {
		return 10;
	}
	
	public int getTotal(int totalPriceWithoutTax) {
		
		return totalPriceWithoutTax + totalPriceWithoutTax*GST_PRICE;
	}

}
