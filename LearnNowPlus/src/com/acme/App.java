package com.acme;

import com.acme.explosive.OrderIncendiary;
import com.acme.poison.OrderPoison;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fulfilment fulfilment=new Fulfilment();
		Order order1=new OrderIncendiary("1", "arjun");
		Order order2=new OrderPoison("2", "arvind");
//		Order order3=new Order("", "");     cannot allow to create
//		Order order4=new Order("3", "rakesh");


		try {
			fulfilment.process(order1,order2);
		} catch (OrderFulfilmentException e) {
			// TODO Auto-generated catch block
			
			System.out.println(""+e.getMessage());
		}

		
		System.out.println("(order3==order4)="+(order1==order2));
		System.out.println("(order3==order4)="+(order1.equals(order2)));


	}

}
