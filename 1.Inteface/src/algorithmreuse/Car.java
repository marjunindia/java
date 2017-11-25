package algorithmreuse;

public class Car implements Measurable {
	
	

	String name;
	int sqft;

	public Car(String n, int s) {
		// TODO Auto-generated constructor stub

		name = n;
		sqft = s;

	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+name+""+sqft;
	}

//	public int getArea() {
//
//		return sqft * 100;
//
//	}

	@Override
	public double getMeasure() {
		// TODO Auto-generated method stub
		return sqft * 100;
	}

}
