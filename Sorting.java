import java.util.*;

public class Sorting<T> {
	List<Node> list;

	public Sorting(List<Node> list) {
		this.list = list;
	}

	public void sort() {
		if (list.get(0).getValue() instanceof String) {
			java.util.Collections.sort(list, new Comparator<Node>() {

				@Override
				public int compare(Node arg0, Node arg1) {
					return arg0.getValue().toString().compareTo(arg1.getValue().toString());

				}
			});
		}
		if (list.get(0).getValue() instanceof Integer) {
			java.util.Collections.sort(list, new Comparator<Node>() {
				@Override
				public int compare(Node arg0, Node arg1) {
					return arg1.getValue().toString().compareTo(arg0.getValue().toString());
				}
			});
		}
	}

}
