package ThreadSynchronization;

public class Blocksynchronizatiion {
	
	
	public static void main(String[] args) {
		
		CountDown countDown=new CountDown();
		
		
		Runnable r=()->{
			
				synchronized (countDown) {		
					countDown.printCount();

				}	
			};
		
		Thread one=new Thread(r,"one");
		Thread two=new Thread(r,"two");
		
		one.start();
		two.start();


	}
	
	

}
