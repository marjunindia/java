package com.acme;

public class Fulfilment {
	
	public void process(Shipment... orders) throws FulfilmentException{
		
		for (Shipment order : orders) {
			
			if("".equals(order.getCustomerid())){
				throw new FulfilmentException("Cannot ship without a customerid");
				
			}
		}
		
		for (Shipment order : orders) {
			System.out.println(order);
			System.out.println(order.getShippingAddress());
			//order.print();
			System.out.println();
			
		}
	}
	
	

}
