package SDETCodingPractice;

public class ArrayManupulation {

	public static void main(String[] args) {
		String[] input = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String[] newString = new String[input.length];
		
		for(int i=0;i<input.length;i++) {
			newString[i] = input[i].substring(0, 3).toString();
			
		}
		
		for(String x : newString) {
			System.out.println(x);
		}

	}

}
