
public class Bot {
	
	private String name="Robot";

	public final static  String  creatername="Arjun";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	protected void talk(String whattosay){
		
	System.out.println(getName()+""+whattosay);
	
	}
	
	

}
