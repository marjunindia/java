
public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new Thread(new HelloRunnable()).start();
		
		new HelloThread().start();
		
		
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello from"+Thread.currentThread().getName()+" Not using lambda exp");
			}
		};
		
		new Thread(r1,"My Thread 1").start();
		
		
		Runnable r2=()->System.out.println("Hello from"+Thread.currentThread().getName()+" Using lambda");
		
		Thread t1=new Thread(r2);
		t1.start();
		
		
	}

}
