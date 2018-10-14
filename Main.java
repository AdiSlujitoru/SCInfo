
public class Main {
	public static void main(String[] args) {
		BinaryTree<String> tree = new BinaryTree<String>();
		BinaryTree<Integer> tree1 = new BinaryTree<Integer>();

		tree1.add(12);
		tree1.add(111);
		tree1.add(2);
		tree.add("Banana");
		tree.add("Apple");
		tree.add("Lemon");
		tree1.getElements();
		tree.getElements();
	}
}
