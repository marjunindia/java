package ThreadJoin;

public class ThreadJoinClass extends Thread{
	
	
	public ThreadJoinClass(String name) {
		
		super(name);
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++){
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread "+Thread.currentThread().getName()+" "+i);
			
		}
		
	}

}
