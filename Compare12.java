import java.util.Comparator;

public class Compare12 implements Comparator<Order> {

	public int compare(Order c1, Order c2) {

		return c2.getCant() - c1.getCant();
	}
}