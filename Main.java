import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Computer\\eclipse-workspace\\Work\\Employees.csv");
		FileReader read=new FileReader(file);
		ManagingSystem manag=new ManagingSystem(read);			
		manag.showList();		
	}
}
