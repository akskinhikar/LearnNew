package SDETCodingPracticeTwo;

public class RegularPrograms {

	public static void main(String[] args) {
	
		//fabonacciSer();
		
		//palandrom();
		
		//reverseNo();
		arith();
		
		

	}
	
	
	public static void fabonacciSer() {
		
		int first = 0;
		int second = 1;
		int third;
		int number = 10;

		
		for(int i=1;i<=number;i++) {
			System.out.print(first+" ");
			third = first + second;
			first = second;
			second = third;

		}
		
		
	}
	
	
	public static void palandrom() {
		String str = "nitind";
		String revStr = "";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			revStr=revStr+str.charAt(i);
		}
		System.out.println(revStr);
		
		if(str.equals(revStr)) {
			System.out.println("Yes! the no is palandrom");
			
		}else {
			System.out.println("Opps! the no is NOT palandrom");
		}
	}
	
	
	public static void reverseNo() {
		
		int a = 10;
		int b = 15;
		System.out.println("a = "+a+" "+"b = "+ b);
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = "+a+" "+"b = "+ b);
		
	}
	
	
	public static void arith() {
		
		System.out.println(9.0/0);
		System.out.println(12.33f/0);
		System.out.println(10/0.0);
		System.out.println(19.9999d/0);
		System.out.println(0.0/0);
		System.out.println(0.0/0.0);
		
	}

}
