package com.acme;

import com.acme.explosive.OrderIncendiary;
import com.acme.poison.OrderPoison;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fulfilment fulfilment=new Fulfilment();
		Shipment OrderIncendiary=new OrderIncendiary("1", "arjun");
		Shipment OrderPoison=new OrderPoison("coyote", "arvind");
		Shipment gift=new Gift("coyote", "rakesh");
//		Order order3=new Order("", "");     cannot allow to create
//		Order order4=new Order("3", "rakesh");


		try {
			fulfilment.process(OrderIncendiary,OrderPoison,gift);
		} catch (FulfilmentException e) {
			// TODO Auto-generated catch block
			
			System.out.println(""+e.getMessage());
		}

		
//		System.out.println("(order3==order4)="+(order1==order2));
//		System.out.println("(order3==order4)="+(order1.equals(order2)));


	}

}
