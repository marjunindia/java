package com.acme.poison;

import com.acme.Order;

public class OrderPoison extends Order{

	public OrderPoison(String customerid, String orderiid) {
		super(customerid, orderiid);
	}

	
	@Override
	public String getShippingAddress() {
		// TODO Auto-generated method stub
		return super.getShippingAddress()+"\n add special instructions for  poison";
	}


	@Override
	public String getSpecialShippingAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
