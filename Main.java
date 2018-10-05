import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("sales.csv");
		SortPrint s1 = new SortPrint();
		s1.print(file);

	}
}
