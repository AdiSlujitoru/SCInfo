import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SortTest {
	File file = new File("sales.csv");

	Sort sort = new Sort(file);
	ArrayList<Order> list;
	ArrayList<Order> list1 = new ArrayList<Order>();
	Order o1 = new Order();
	Order o2 = new Order();
	Order o3 = new Order();
	Order o4 = new Order();
	Order o5 = new Order();

	private boolean method12(ArrayList<Order> x) {
		int c = 0;
		for (int i = 1; i < x.size(); i++) {
			if (x.get(i - 1).getCant() >= x.get(i).getCant()) {
				c++;
			}

		}
		if (c == x.size() - 1) {
			return true;
		} else {
			return false;
		}

	}

	private boolean method3(ArrayList<Order> x) {
		int c = 0;
		for (int i = 1; i < x.size(); i++) {
			if (x.get(i - 1).getSpent() >= x.get(i).getSpent()) {
				c++;
			}

		}
		if (c == x.size() - 1) {
			return true;
		} else {
			return false;
		}

	}

	// Best Selling Product Test
	@Test
	void test1() throws IOException {
		list = sort.sorting1();
		o1.setProduct("Product1");
		o2.setProduct("Product2");
		o3.setProduct("Product3");
		o4.setProduct("Product4");
		o5.setProduct("Product5");

		o1.setCant(80);
		o2.setCant(65);
		o3.setCant(55);
		o4.setCant(45);
		o5.setCant(30);
		list1.add(o1);
		list1.add(o2);
		list1.add(o3);
		list1.add(o4);
		list1.add(o5);

		assertEquals(method12(list), method12(list1));
		list1.clear();
	}

	// Top Returning Customers Test
	@Test
	void test2() throws IOException {
		list = sort.sorting2();
		o1.setName("Name1");
		o2.setName("Name2");
		o3.setName("Name3");
		o4.setName("Name4");
		o5.setName("Name5");

		o1.setCant(30);
		o2.setCant(25);
		o3.setCant(22);
		o4.setCant(20);
		o5.setCant(5);
		list1.add(o1);
		list1.add(o2);
		list1.add(o3);
		list1.add(o4);
		list1.add(o5);

		assertEquals(method12(list), method12(list1));
		list1.clear();
	}

	// Top Customers Test
	@Test
	void test3() throws IOException {
		list = sort.sorting3();
		o1.setName("Name1");
		o2.setName("Name2");
		o3.setName("Name3");
		o4.setName("Name4");
		o5.setName("Name5");
		o1.addSpent(800);
		o2.addSpent(750);
		o3.addSpent(500);
		o4.addSpent(460);
		o5.addSpent(220);
		list1.add(o1);
		list1.add(o2);
		list1.add(o3);
		list1.add(o4);
		list1.add(o5);

		assertEquals(method3(list), method3(list1));
		list1.clear();
	}

}
