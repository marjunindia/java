package implementsinterface;

public class CarType implements Drawable,Movable{
	
	String a;
	String b;
	
	public CarType(String a,String b) {
		// TODO Auto-generated constructor stub	
		this.a=a;
		this.b=b;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Car type:"+a+b);
	
	}

	@Override
	public void move(int second) {
		// TODO Auto-generated method stub
		System.out.println("Speed of the car"+second);
		
	}
	

}
