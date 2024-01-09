package com.example.mcd.model.domain;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Order {
	
	public List<Product> productInfoList;
	public int total;
	public int gst;

}
