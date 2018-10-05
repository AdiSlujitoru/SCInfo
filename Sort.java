import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Sort {

	File file;

	public Sort(File f) {
		this.file = f;
	}

	Read read = new Read();

	ArrayList<Order> list;
	ArrayList<String> singlesList = new ArrayList<String>();

	private ArrayList<Order> getList() throws IOException {
		list = read.getList(file);
		return list;
	}

	private void comp12(List<Order> x) {
		x.sort(new Compare12());
	}

	private void comp3(List<Order> x) {
		x.sort(new Compare3());
	}

	// Best Selling Product
	public ArrayList<Order> sorting1() throws IOException {

		list = getList();
		ArrayList<Order> list1 = new ArrayList<Order>();

		for (int i = 0; i < list.size(); i++) {
			if (!singlesList.contains(list.get(i).getProduct())) {
				Order p = new Order();
				p.setProduct(list.get(i).getProduct());
				list1.add(p);
				singlesList.add(list.get(i).getProduct());
			}
		}
		for (int j = 0; j < list1.size(); j++) {
			for (int j1 = 0; j1 < list.size(); j1++) {
				if (list1.get(j).getProduct().equals(list.get(j1).getProduct())) {
					list1.get(j).addCant();
				}
			}
		}
		list.clear();
		singlesList.clear();
		comp12(list1);
		return list1;
	}

	// Top Returning Customers
	public ArrayList<Order> sorting2() throws IOException {
		list = getList();
		ArrayList<Order> list2 = new ArrayList<Order>();
		for (int i = 0; i < list.size(); i++) {
			if (!singlesList.contains(list.get(i).getName())) {
				singlesList.add(list.get(i).getName());
				Order order = new Order();
				order.setName(list.get(i).getName());
				list2.add(order);
			}
		}
		for (int i1 = 0; i1 < list2.size(); i1++) {
			for (int j = 0; j < list.size(); j++) {
				if (list2.get(i1).getName().equals(list.get(j).getName())) {
					list2.get(i1).addCant();
				}
			}
		}
		list.clear();
		singlesList.clear();
		comp12(list2);
		return list2;

	}

	// Top Customers
	public ArrayList<Order> sorting3() throws IOException {
		list = getList();
		ArrayList<Order> list3 = new ArrayList<Order>();
		for (int i0 = 0; i0 < list.size(); i0++) {
			if (!singlesList.contains(list.get(i0).getName())) {
				singlesList.add(list.get(i0).getName());
				Order ord = new Order();
				ord.setName(list.get(i0).getName());
				list3.add(ord);
			}
		}
		for (int i1 = 0; i1 < list3.size(); i1++) {
			for (int i = 0; i < list.size(); i++) {
				if (list3.get(i1).getName().equals(list.get(i).getName())) {
					list3.get(i1).addSpent(list.get(i).getSpent());
				}
			}
		}
		list.clear();
		singlesList.clear();
		comp3(list3);
		return list3;
	}
}
