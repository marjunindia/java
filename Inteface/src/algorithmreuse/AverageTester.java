package algorithmreuse;

public class AverageTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Country[] countries = { new Country("india", 10), new Country("pakistan", 110), new Country("australis", 200)

		};

		Car[] cars = { new Car("india", 100), new Car("pakistan", 1410), new Car("australis", 2600)

		};
		
		double c = Data.measurableaverage(cars);

		double d = Data.measurableaverage(countries);

		
		Measurable largest=Data.largest(countries);
		
		System.out.println(largest);
		
		
		try{
			Country largestCountry=(Country)largest;
			

		}
		catch (Exception e) {
			// TODO: handle exception
		}
		

		
		
		
//		System.out.println("Cars " + c);
//
//		System.out.println("Countres " + d);
	}

}
