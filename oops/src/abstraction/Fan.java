package abstraction;

public class Fan extends Device  implements Switchable{
	
	
	public Fan() {
		setDeviceName("FAN");
	}

	@Override
	public void breakDevice() {
		
		System.out.println(getDeviceName()+"BANG,CRASH....OOPS");
		
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Fan turned on");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
		System.out.println("Fan turned off");

		
	}

}
