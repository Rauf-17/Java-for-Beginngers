import java.lang.*;
import java.util.*;

public class Stdemo {
	
	public static void main (String[]args) {
		
		String s1 = "Rauf Islam Shuvo";
	    String s2 = new String ("Rauf Islam Shuvo");
		
	    char s3[]= {'R','a','u','f'};
	    
	    
		
	    System.out.println("S1 = " + s1);
		System.out.println("S2 = " + s2);
		System.out.println(s3); 
		
		int x = s1.length();
		System.out.println("Length is = " + x );
		
		if(s1.equals(s2)){
		 
			System.out.println("Equal");
		
		} else  {
			
			System.out.println("Not Equal");
		}
		
	}
}
