import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImplementGenerictype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Person one=new Person("arjun1", 23); 
		Person three=new Person("lingam", 45);
		Person two=new Person("muralia", 35);


		
		List<Person> persons=new ArrayList<>();
		persons.add(one);
		persons.add(two);
		persons.add(three);
		
		Collections.sort(persons,new AgeComparator());
		
		System.out.println(persons);


	}

}
