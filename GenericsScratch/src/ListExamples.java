import java.util.ArrayList;
import java.util.List;

public class ListExamples {
	
	
	
	public static void main(String[] args) {
		
		Person one=new Person("arjun1", 23); 
		Person two=new Person("muralia", 25);
		
		
		List<Person> persons=new ArrayList<>();
		persons.add(one);
		persons.add(two);
		persons.add(new Person("ddsad", 34));
		
		//persons.add(new Object());
	
		
		System.out.println(persons);


		
	}

}
