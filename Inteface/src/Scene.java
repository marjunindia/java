import java.util.ArrayList;
import java.util.Iterator;

import implementsinterface.BallType;
import implementsinterface.CarType;
import implementsinterface.DogType;
import implementsinterface.Drawable;
import implementsinterface.HouseType;
import implementsinterface.Movable;

public class Scene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<House> houses = new ArrayList<House>();
		houses.add(new House("chrompet", "water proble"));
		houses.add(new House("palavarma", "pollution problem"));
		houses.add(new House("perugalathur", "tlemransport prob"));

		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("a", "dfdfdsf"));
		dogs.add(new Dog("b", "dfdfdsfds"));
		dogs.add(new Dog("c", "wdsdadsadas"));

		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car("honda", "beautiful"));
		cars.add(new Car("suzuki", "wow"));
		cars.add(new Car("hero", "fantastic"));

//		for (Dog dog : dogs) {
//			
//			dog.draw();
//
//		}
//
//		for (House house : houses) {
//			house.draw();
//
//		}
//
//		for (Car car : cars) {
//
//			car.draw();
//		}
//		
		
		
		
		
		
		ArrayList<Drawable> drawables = new ArrayList<Drawable>();
		drawables.add(new HouseType("chrompet", "water proble"));
		drawables.add(new DogType("palavarma", "pollution problem"));
		drawables.add(new CarType("perugalathur", "tlemransport prob"));
		drawables.add(new BallType("ball", "out of the stadium"));
		
		// add new of type of circle which implements drawable draw method
		// achieve polymorphism
		DogType dogType=new DogType("sdsd","dfdf");
		dogType.move(10);
		
		drawables.add(dogType);

		
		for (Drawable drawable : drawables) {
			
			if (drawable instanceof Movable) {
				Movable movable=(Movable)drawable;
				movable.move(10);
				
			}
			
		}
		
		
		
		Drawable drawable=new DogType("sad", "sadasd");
		drawable.draw();
		
		
		
		
//		for (Drawable drawable : drawables) {
//		
//			drawable.draw();
//		
//		}
//		
		
		
			

	}

}
