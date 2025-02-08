package SDETCodingPractice;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int num = 433224;
		
		System.out.println(reverseNumber(num));

	}
	
	
	public static int reverseNumber(int num) {
		int revNum = 0;
		
		while(num>0) {
		revNum = revNum*10+num%10;
		num=num/10;
		}
		
		return revNum;
		
	}

}
