package instanstingfunctionalInterface;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleInterface simpleInterface=()->
		System.out.println("dummy text");
		simpleInterface.doSomething();
		
		InterfaceWithArgs interfaceWithArgs=(v1,v2)->
		{
			int res=v1+v2;
			System.out.println("the result is"+res);
		};
		interfaceWithArgs.doSomething(10, 5);
		
	}

}
