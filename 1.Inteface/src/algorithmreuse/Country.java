package algorithmreuse;

public class Country implements Measurable {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSqft() {
		return sqft;
	}

	public void setSqft(int sqft) {
		this.sqft = sqft;
	}

	String name;
	int sqft;

	public Country(String n, int s) {
		// TODO Auto-generated constructor stub

		name = n;
		sqft = s;

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

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+name;
	}
	
}
