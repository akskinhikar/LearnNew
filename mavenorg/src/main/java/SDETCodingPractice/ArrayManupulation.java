package SDETCodingPractice;

public class ArrayManupulation {
	
	/*
	 * update the array to {Sun,Mon,Tue...}
	 */

	public static void main(String[] args) {
		String[] input = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String[] newString = new String[input.length];
		
		for(int i=0;i<input.length;i++) {
			newString[i] = input[i].substring(0, 3);
			
		}
		
		for(String x : newString) {
			System.out.println(x);
		}

	}

}
