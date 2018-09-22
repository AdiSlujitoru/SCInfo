import java.util.Comparator;

public class Sorting implements Comparator<Employee> {

	
	public int compare(Employee a, Employee b) {
		return a.getYear()-b.getYear();
	}

}
