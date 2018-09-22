
public class Employee {
	private String name;
	private int years;
	
	
	public Employee(String name, int years) {
		this.name=name;
		this.years=years;
	}
	public String getName() {
		return name;
	}
	public String getEmployee() {
		return name+" "+years;
	}
	public int getYear() {
		return years;
	}

}
