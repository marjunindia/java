package implementsinterface;

public class BallType implements Drawable {
	String a;
	String b;
	
	public BallType(String a,String b) {
		// TODO Auto-generated constructor stub	
		this.a=a;
		this.b=b;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("its a ball"+a+b);

	}
}
