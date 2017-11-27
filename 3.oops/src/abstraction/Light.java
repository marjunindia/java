package abstraction;

public class Light extends Device implements Switchable{
	

	public Light() {

		setDeviceName("LIGHT");
	}

	@Override
	public void breakDevice() {
		// TODO Auto-generated method stub
		System.out.println(getDeviceName()+"Glass Everywhere ...i guess its not bad");

	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Light is turned on");

		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Light is turned off");

	}

}
