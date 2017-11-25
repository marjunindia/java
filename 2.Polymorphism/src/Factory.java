
public class Factory {
	
	static boolean check=true;
	
		static Consumer build(){
			Update u=check ? new I18Update() :new NonI18Update();
			return new Consumer(u);
		}
	
	

}
