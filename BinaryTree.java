import java.util.*;

public class BinaryTree<T> {
	private Node root, root1;
	private List<Node> list = new ArrayList<Node>();

	public void add(T value) {
		root = addElem(value);
	}

	private Node addElem(T val) {
		Node<T> node = new Node<T>(val);
		if (root == null) {
			root = node;
			root1 = root;
			return root;
		} else if (root.getLeft() == null) {
			root.setLeft(node);

		} else if (root.getRight() == null) {
			root.setRight(node);
			root = root.getLeft();

		}

		return root;
	}

	private void show(Node root) {
		Sorting sort = new Sorting(list);
		if (root != null) {

			show(root.getLeft());
			list.add(root);
			show(root.getRight());
			sort.sort();

		}

	}

	public void getElements() {
		show(root1);
		for (Node s : list) {
			System.out.print(s.getValue() + " ");
		}
		System.out.println("");
	}

}
