package implementsinterface;

public class HouseType implements Drawable{
	
	String a;
	String b;
	
	public HouseType(String a,String b) {
		// TODO Auto-generated constructor stub	
		this.a=a;
		this.b=b;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("House Type:"+a+b);

	}
	
	

}
