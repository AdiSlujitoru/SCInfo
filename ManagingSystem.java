import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagingSystem {
	private Reader reader;
	
	public ManagingSystem(Reader reader) {
		this.reader=reader;
	}	
	
	//Lista Junior
	public List<Junior> juniors() throws IOException{
		BufferedReader br=new BufferedReader(reader);
		int x=0;
	    List<Junior> list=new ArrayList<Junior>();		
		String line= br.readLine();	
		System.out.print("Juniors List: ");
		while (line!=null) {			
			String[] str=line.split(",");
			if("Junior".equals(str[0])) {
				list.add(new Junior(str[1], Integer.parseInt(str[2])));
				System.out.print(list.get(x).getName()+"; ");
				x++;
			}	
			line=br.readLine();		
		}
		System.out.println();
		return list;
		}	
	
	//Lista Manager
		public List<Manager> managers() throws IOException{
			BufferedReader br=new BufferedReader(reader);
			int x=0;
		    List<Manager> list=new ArrayList<Manager>();			
			String line= br.readLine();	
			System.out.print("Managers List: ");
			while (line!=null) {			
				String[] str=line.split(",");
				if("Manager".equals(str[0])) {
					list.add(new Manager(str[1], Integer.parseInt(str[2])));
					System.out.print(list.get(x).getName()+"; ");
					x++;
				}	
				line=br.readLine();		
			}
			System.out.println();
			return list;			
		}	
		
	//Gasirea angajatilor fara loc de parcare
	private List<Employee> nospaceList() throws IOException{		
		List<Employee> employ =new ArrayList<Employee>();
			BufferedReader br=new BufferedReader(reader);
			String line=br.readLine();			
			while(line!=null) {
			String[] str=line.split(",");
			if("No".equals(str[3])) {
			employ.add(new Employee(str[1], Integer.parseInt(str[2])));
			}
			line=br.readLine();			
			}
			return  employ;			
	}
	
	//Sortarea listei pe baza senioritatii
	private List<Employee> sortList() throws IOException  {
		ManagingSystem mg=new ManagingSystem(reader);		
		List<Employee> sorted=new ArrayList<Employee>();
		sorted=mg.nospaceList();		
		Collections.sort(sorted, new Sorting());
		return sorted;		
	}
	
	//Afisarea listei sortate
	public void showList() throws IOException {
		List<Employee> list =null;
		ManagingSystem obj=new ManagingSystem(reader);
		list=obj.sortList();
		System.out.print("Employees without parking spaces: ");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getName()+"; ");
		}
		System.out.println();
		
	}	
	
	}
