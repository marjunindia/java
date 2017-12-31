
public class HelloThread extends Thread {
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from"+Thread.currentThread().getName()
				+" creates by extending thread");
	
	}

}
