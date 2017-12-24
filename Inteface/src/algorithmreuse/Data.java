package algorithmreuse;

public class Data {
	

//	public static double average(Country[] objects) {
//
//		double sum = 0;
//
//		for (Country country : objects) {
//
//			sum = sum + country.getArea();
//
//		}
//		if (objects.length > 0) {
//
//			return sum / objects.length;
//		} else {
//			return 0;
//		}
//
//	}
	
	
	
	
	public static double measurableaverage(Measurable[] objects) {

		double sum = 0;
		
		for (Measurable measurable : objects) {
			sum = sum + measurable.getMeasure();
		}
		if (objects.length > 0) {
			return sum / objects.length;
		} else {
			return 0;
		}

	}
	
	
	public static Measurable largest(Measurable[] objects){
		
		Measurable largestsofar=objects[0];
		
		for (int i = 0; i < objects.length; i++) {
			
		Measurable current=objects[i];
		
		if(current.getMeasure()>largestsofar.getMeasure()){
			largestsofar=current;
		}
		}
		return largestsofar;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
