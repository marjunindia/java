package ThreadSynchronization;

public class MethodSynchroniization {
	
	static int counter=1;
	
	public static int getID(){
		return counter++; // you will get samecountervalue sometimes
	}

	public static synchronized int getID1(){
		return counter++; // to overcome race condtion.two methods cannot access same time
	}

	public static void main(String[] args) {
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(""+getID1());  
			}
		};
		
		Thread one=new Thread(runnable,"thread 1");
		one.start();
		
		Thread two=new Thread(runnable,"thread 2");
		two.start();
		
	}

}
