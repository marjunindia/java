package abstraction;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fan fan=new Fan();
		
		Light light=new Light();
		
//		fan.breakDevice();
//		
//		light.breakDevice();
//		
		Switch switc=new Switch(); 
		
		switc.turnOffSwitchable(fan); //fan implements switchable
		
		switc.turnOffSwitchable(light); //fan implements switchable

		
//		SwitchWithCallback switchWithCallback=new SwitchWithCallback();
//		
//		switchWithCallback.registerCallBack(fan);
//		
//		switchWithCallback.registerCallBack(light);
//
//		
//		switchWithCallback.flipSwitchup();
//		
//		switchWithCallback.flipSwitchDown();
		

		
		
		
		
		
		

	}

}