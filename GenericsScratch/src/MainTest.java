import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person one=new Person("arjun", 23); 
		Person two=new Person("murali", 25);
		
		Person[] personArray={one,two};
		
		Person three=new Person("kane", 55);
		
		personArray=add(three,personArray);
		
		System.out.println(Arrays.toString(personArray));
		
		
		SortedPair<Integer> pair=new SortedPair<Integer>(1, 2);
		System.out.println(pair.getFirst().intValue());
		System.out.println(pair.getSecond().intValue());


		

		SortedPair<Integer> pair1=new SortedPair<Integer>(2, 1);
		System.out.println(pair1.getFirst().intValue());
		System.out.println(pair1.getSecond().intValue());
		
		
		
		

	}

	private static Person[] add(Person person, Person[] array) {
		int length=array.length;
		array=Arrays.copyOf(array, length+1);
		array[length]=person;
		return array;
	}

}
