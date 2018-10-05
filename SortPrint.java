import java.io.*;
import java.util.ArrayList;

public class SortPrint {
	ArrayList<Order> l1 = new ArrayList<Order>();
	ArrayList<Order> l2 = new ArrayList<Order>();
	ArrayList<Order> l3 = new ArrayList<Order>();
	File f1 = new File("sales-stats.txt");

	public void print(File f) throws IOException {
		Sort s = new Sort(f);
		l1 = s.sorting1();
		l2 = s.sorting2();
		l3 = s.sorting3();
		FileWriter w;
		if (f1.exists()) {
			w = new FileWriter("sales-stats.txt", false);
		} else {
			w = new FileWriter("sales-stats.txt", true);
		}

		w.write("Best Selling Product: \r\n\r\n");
		for (int i = 0; i < l1.size(); i++) {

			w.write(i + 1 + ". " + l1.get(i).getProduct() + " - ");
			w.write(l1.get(i).getCant() + " units \r\n");

		}
		w.write("\r\n");
		w.write("Top Returning Customers: \r\n\r\n");
		for (int i = 0; i < l2.size(); i++) {

			w.write(i + 1 + ". " + l2.get(i).getName() + " - ");
			w.write(l2.get(i).getCant() + " orders \r\n");

		}
		w.write("\r\n");
		w.write("Top Customers: \r\n\r\n");
		for (int i = 0; i < l3.size(); i++) {

			w.write(i + 1 + ". " + l3.get(i).getName() + " - ");
			w.write(l3.get(i).getSpent() + " $ \r\n");

		}
		w.write("\r\n");
		w.close();

	}
}
