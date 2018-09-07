
public class SmartDevices implements Device{
	
	private boolean isOn;
	
	private int consum;
	
	public boolean getOn() {return isOn;}

	public void setOn() {
		isOn=true;
		consum=2;
	}
	public void setOff() {
		isOn=false;
		consum=0;
	}
	public int getCons() {
		return consum;
	}
	public void calculateConsum() {
		System.out.println(consum);
	}
	public void state() {}
}
