package Olives;

public class Kalamata extends Olive {

	public Kalamata() {
		super(2);
		this.name = "Kalamata";
		this.flavor = "Grassy";
		this.color = Olive.BLACK;
	}
	
	
	@Override
	public int crush() {
		System.out.println("from subclass");
		return super.crush();
	}


	@Override
	public String getOrigin() {
		// TODO Auto-generated method stub
		return "sadas";
	}
	
	
//	public void getOrigin(){
//		System.out.println("greece");
//	}

}
