
public class Host extends SmartDevices{
	private SmartDevices[] list=new SmartDevices[11];
		
	private int objCount=0;
	
	public void addObj(SmartDevices x) {
		list[objCount]=new SmartDevices();
		list[objCount]=x;
		objCount++;		
	}
	public void setOn() {
		for(int i=0; i<objCount; i++) {
			list[i].setOn();
		}
	}
	public void setOff() {
		for(int i=0; i<objCount; i++) {
			list[i].setOff();
		}
	}
	public void state() {
		for(int i=0; i<objCount; i++) {
			if(list[i].getOn()) {
			System.out.print("Turned on  ");
		}
			else	{
				System.out.print("Turned off  ");
		}
		
		}
		System.out.println();
	}
	public void calculate() {
		int x=0;
		for(int i=0; i<objCount; i++) {
			x+=list[i].getCons();
		}
		System.out.println("Consum total : " + x);
	}
	public void show() {
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i]+", ");
		}
		System.out.println();
	}	
	
}
