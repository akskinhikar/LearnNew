package SDETCodingPractice;

import java.util.Iterator;

public class StarPatterns {

	public static void main(String[] args) {
	
		/*
		 *     
		 *      * 
				* * 
				* * * 
				* * * * 
				* * * * * 
		 *     
		 *     
		 *     
		 *     
		 *     
		 *     
		 */
		
		for(int i = 1; i<=5; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		
		/*
		 *     
				* 
				* * * 
				* * * * * 
				* * * * * * * 
				* * * * * * * * * 
		 *     
		 *     
		 *     
		 *     
		 *     
		 *     
		 */
		
		int k=1;
		for(int i = 1; i<=5; i++) {
			for(int j=1;j<=k;j++) {
				System.out.print("* ");
			}
			k+=2;
			System.out.println();
		}
		
		System.out.println("===========================");
		
		int i, j, f;
		int rows = 5;
		
		for (i = 1; i <= rows; i++) {
			for(f=1;f<=rows-i;f++) {
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}
	
	

	
	

}
