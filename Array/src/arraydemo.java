import java.util.*;
public class arraydemo {

	public static void main (String[]args) {
		
		int arr[] = new int [] {1,2,3,4,5};
			
			int sum = 0;
			
			for(int i=0;i<5;i++) {
				
				sum = sum + arr[i];
				
				
			}
			System.out.println("Sum is = " +sum);
		}
	}
