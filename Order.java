public class Order {
	private String client;
	private String product;
	private int spent;
	private int cant;

	public Order() {
	}

	public Order(String name, String product, int spent) {

		this.spent = spent;
		this.product = product;
		this.client = name;
	}

	public String getName() {
		return client;
	}

	public String getProduct() {
		return product;
	}

	public int getSpent() {
		return spent;
	}

	public int getCant() {
		return cant;
	}

	public void addCant() {
		cant++;

	}

	public void setName(String x) {
		this.client = x;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public void addSpent(int x) {
		spent = spent + x;
	}

	public void setCant(int x) {
		this.cant = x;
	}

}
