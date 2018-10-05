import java.io.*;
import java.util.ArrayList;

public class Read {
	private ArrayList<Order> list = new ArrayList<Order>();

	private void read1(File f) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = br.readLine();
		while (line != null) {
			String[] str = line.split(",");
			String name = str[3];
			String product = str[1];
			int spent = Integer.parseInt(str[2]);
			Order x = new Order(name, product, spent);
			list.add(x);
			line = br.readLine();
		}
		br.close();
	}

	public ArrayList<Order> getList(File x) throws IOException {
		read1(x);
		return list;
	}

}
