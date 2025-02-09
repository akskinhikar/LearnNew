package SDETCodingPractice;

public class FactorialNumber {

	public static void main(String[] args) {
		
		
		int num = 3;
		int factorial=1;
		
		for(int i=num;i>=1;i--) {
			factorial = factorial * i;
		}
		
		System.out.println("factorial of the number "+ num + " is "+ factorial);
		
		System.out.println("factorial of the number "+ num + " is "+ factorial(num));

	}
	
	
	public static int factorial(int no) {
		
		if(no<=1){
			return 1;
			
		}else {
			return no*factorial(no-1);
		}
		
	}
	
	

}
