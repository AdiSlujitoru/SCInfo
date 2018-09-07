
public class Main {

	public static void main(String[] args) {
	Host host=new Host();	
	SmartLamp lamp1=new SmartLamp();
	SmartThermostat thermostat1=new SmartThermostat();
	host.addObj(thermostat1);
	host.addObj(lamp1);
	host.setOn();
	host.show();
	host.state();
	host.calculate();
	}
}
