
public class HelloRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from"+Thread.currentThread().getName()
				+"  thread created by implementing a Runnable interface");
		
	}

}
