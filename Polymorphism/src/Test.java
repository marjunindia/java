import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// To test the code
		
		Update update=new I18Update();
		update.evaluate();
		
		Update update1=new NonI18Update();
		update1.evaluate();
		
		
//		ArrayList<Update> arrayList=new ArrayList<>();
//		arrayList.add(new I18Update());
//		arrayList.add(new NonI18Update());
//		
//		for (Update update2 : arrayList) {
//			update2.evaluate();
//			
//		}
		
		
		Factory.build();
		
		
	
		
	}
	
	


}
