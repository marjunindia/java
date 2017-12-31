package com.acme.explosive;

import com.acme.Order;

public class OrderIncendiary extends Order {

	public OrderIncendiary(String customerid, String orderiid) {
		super(customerid, orderiid);
	}
	
	
	@Override
	public String getShippingAddress() {
		return "add special incendiary instructions";
	}


	@Override
	public String getSpecialShippingAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
