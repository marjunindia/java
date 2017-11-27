package abstraction;

public abstract class Device {
	
	protected String ison;

	protected String deviceName;
	
	public abstract void breakDevice();

	
	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getIson() {
		return ison;
	}

	public void setIson(String ison) {
		this.ison = ison;
	}


	
}
