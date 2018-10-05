import java.util.Comparator;

public class Compare3 implements Comparator<Order> {

	public int compare(Order c1, Order c2) {

		return c2.getSpent() - c1.getSpent();
	}
}