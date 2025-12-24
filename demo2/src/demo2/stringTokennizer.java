package demo2;
import java.util.StringTokenizer;
public class stringTokennizer {

	public static void main(String[] args) {
		String s="department of computer technology";
		StringTokenizer st= new StringTokenizer(s," ");
	
		
		while(st.hasMoreTokens()==true)
		{
			System.out.println(st.nextToken());//pointer is on the the -1 that why we need to print from next token
			
		}
		
				}

}
