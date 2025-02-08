package SDETCodingPractice;

public class WAPForFibonacciSeries {

	public static void main(String[] args) {
		
		int first = 0;
		int second = 1;
		int n = 10;
		
		for(int i=1;i<=n;i++) {
			System.out.print(first + " ");
			int third = first + second ;
			first = second;
			second = third;
			
		}
		
		
		

	}

}
