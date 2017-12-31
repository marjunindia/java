import java.util.ArrayList;

import CreatingInterface.OlivePressImplPress;
import CreatingInterface.Press;
import Olives.Kalamata;
import Olives.Ligurian;
import Olives.Olive;
import Press.OlivePress;

public class Main {

	public static void main(String[] args) {

		ArrayList<Olive> olives = new ArrayList<Olive>();
		
		Olive olive;
		
		/*
		 * create instance of the subclassSS
		 */
		
		olive = new Kalamata();   //polymorphism
		System.out.println(""+olive.name);
		olives.add(olive);

		olive = new Ligurian();
		System.out.println(olive.name);
		olives.add(olive);

		olive = new Kalamata();
		System.out.println(olive.name);
		olives.add(olive);
	
		OlivePress press = new OlivePress();
		press.getOil(olives);
		
		System.out.println("You got " + press.getTotalOil() + 
				" units of oil");
	
		press.getOil(olives);
		
		System.out.println("You got " + press.getTotalOil() + 
				" units of oil");
		
		
		Kalamata kalamata=(Kalamata) olives.get(0);  //downcastiing
		Kalamata kalamata1=(Kalamata) olive;

		kalamata1.getOrigin();
		
		Press press2=new OlivePressImplPress();
		press2.getOil(olives);
		
		for (Olive olive2 : olives) {
			
			System.out.println(olive2.getOrigin());
			
		}
		
//		Olive olive2=new Olive() {
//			
//			@Override
//			public String getOrigin() {
//				// TODO Auto-generated method stub
//				return "anonynous";
//			}
//		};
		
		
		
	}

}
