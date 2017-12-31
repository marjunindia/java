package com.acme;

public class Fulfilment {
	
	public void process(Order... orders) throws OrderFulfilmentException{
		
		for (Order order : orders) {
			
			if("".equals(order.getCustomerid())){
				throw new OrderFulfilmentException("Cannot ship without a customerid");
				
			}
		}
		
		for (Order order : orders) {
			System.out.println(order);
			System.out.println(order.getShippingAddress());
			//order.print();
			System.out.println();
			
		}
	}
	
	

}
