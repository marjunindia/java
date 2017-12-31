package ThreadJoin;

public class ThreadJoinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadJoinClass t1=new ThreadJoinClass("t1");
		ThreadJoinClass t2=new ThreadJoinClass("t2");
		ThreadJoinClass t3=new ThreadJoinClass("t3");
		
		t1.start();
		
		try {
			t1.join(); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// t2 and t3 wont until t1 finished.
		// t2 and t3 run concurrently
		
		t2.start();
		t3.start();

	}

}
