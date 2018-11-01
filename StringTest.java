
public class StringUtils {
	public String numbers(String s) {
		String s0=s;
		
		for(int j=0; j<s0.length(); j++) {
		if((s0.charAt(j)=='O'||s0.charAt(j)=='o')&&(s0.charAt(j+1)=='N'||
				s0.charAt(j+1)=='n')&&(s0.charAt(j+2)=='E'||s0.charAt(j+2)=='e'))
		{
			s0=s0.substring(0, j)+"1"+s0.substring(j+3, s0.length());
			
		}		
		
		}
		for(int j=0; j<s0.length(); j++) {
			if((s0.charAt(j)=='T'||s0.charAt(j)=='t')&&(s0.charAt(j+1)=='W'||
					s0.charAt(j+1)=='w')&&(s0.charAt(j+2)=='O'||s0.charAt(j+2)=='o'))
			{
				s0=s0.substring(0, j)+"2"+s0.substring(j+3, s0.length());
				
			}
			}
			for(int j=0; j<s0.length(); j++) {
				if((s0.charAt(j)=='T'||s0.charAt(j)=='t')&&(s0.charAt(j+1)=='H'||
						s0.charAt(j+1)=='h')&&(s0.charAt(j+2)=='R'||s0.charAt(j+2)=='r')&&
						(s0.charAt(j+3)=='E'||
						s0.charAt(j+3)=='e')&&(s0.charAt(j+4)=='E'||s0.charAt(j+4)=='e'))
				{
					s0=s0.substring(0, j)+"3"+s0.substring(j+5, s0.length());
					
				}		
				}
			for(int j=0; j<s0.length(); j++) {
				if((s0.charAt(j)=='F'||s0.charAt(j)=='f')&&(s0.charAt(j+1)=='O'||
						s0.charAt(j+1)=='o')&&(s0.charAt(j+2)=='U'||s0.charAt(j+2)=='u')&&
						(s0.charAt(j+3)=='R'||
						s0.charAt(j+3)=='r'))
				{
					s0=s0.substring(0, j)+"4"+s0.substring(j+4, s0.length());
					
				}
				}
			for(int j=0; j<s0.length(); j++) {
				if((s0.charAt(j)=='F'||s0.charAt(j)=='f')&&(s0.charAt(j+1)=='I'||
						s0.charAt(j+1)=='i')&&(s0.charAt(j+2)=='V'||s0.charAt(j+2)=='v')&&
						(s0.charAt(j+3)=='E'||
						s0.charAt(j+3)=='e'))
				{
					s0=s0.substring(0, j)+"5"+s0.substring(j+4, s0.length());
					
				}
				}
			for(int j=0; j<s0.length(); j++) {
				if((s0.charAt(j)=='S'||s0.charAt(j)=='s')&&(s0.charAt(j+1)=='I'||
						s0.charAt(j+1)=='i')&&(s0.charAt(j+2)=='X'||s0.charAt(j+2)=='x'))
				{
					s0=s0.substring(0, j)+"6"+s0.substring(j+3, s0.length());
					
				}
				}	
			for(int j=0; j<s0.length(); j++) {
				if((s0.charAt(j)=='S'||s0.charAt(j)=='s')&&(s0.charAt(j+1)=='E'||
						s0.charAt(j+1)=='e')&&(s0.charAt(j+2)=='V'||s0.charAt(j+2)=='v')&&
						(s0.charAt(j+3)=='E'||
						s0.charAt(j+3)=='e')&&(s0.charAt(j+4)=='N'||s0.charAt(j+4)=='n'))
				{
					s0=s0.substring(0, j)+"7"+s0.substring(j+5, s0.length());
					
				}		
				}
			for(int j=0; j<s0.length(); j++) {
				if((s0.charAt(j)=='E'||s0.charAt(j)=='e')&&(s0.charAt(j+1)=='I'||
						s0.charAt(j+1)=='i')&&(s0.charAt(j+2)=='G'||s0.charAt(j+2)=='g')&&
						(s0.charAt(j+3)=='H'||
						s0.charAt(j+3)=='h')&&(s0.charAt(j+4)=='T'||s0.charAt(j+4)=='t'))
				{
					s0=s0.substring(0, j)+"8"+s0.substring(j+5, s0.length());
					
				}		
				}
			for(int j=0; j<s0.length(); j++) {
				if((s0.charAt(j)=='N'||s0.charAt(j)=='n')&&(s0.charAt(j+1)=='I'||
						s0.charAt(j+1)=='i')&&(s0.charAt(j+2)=='N'||s0.charAt(j+2)=='n')&&
						(s0.charAt(j+3)=='E'||
						s0.charAt(j+3)=='e'))
				{
					s0=s0.substring(0, j)+"9"+s0.substring(j+4, s0.length());
					
				}		
				}			
			
		return s0;
	}
	
	public String space(String s) {
		String s0=s.replaceAll("\\s", "");
		
		return s0;
	}	
	
}
