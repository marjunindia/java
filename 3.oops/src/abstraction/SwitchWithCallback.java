package abstraction;

import java.awt.List;
import java.util.ArrayList;

public class SwitchWithCallback {
	
	
	private  ArrayList<Switchable> items=new ArrayList<>();
	
	
	public void registerCallBack(Switchable switchable){
		items.add(switchable);
	}
	
	public void UnregisterCallBack(Switchable switchable){
		items.remove(switchable);
		
	}
	
	public void flipSwitchup(){
		
		for (Switchable switchable : items) {
			switchable.turnOn();			
		}
		
	}
	
		public void flipSwitchDown(){
		
		for (Switchable switchable : items) {
			switchable.turnOff();			
		}
		
	}
	
	
	

}
