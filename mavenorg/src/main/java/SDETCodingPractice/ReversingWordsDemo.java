package SDETCodingPractice;

public class ReversingWordsDemo {

	public static void main(String[] args) {
		
		String str = "We are learning java";
		
		String arr[] = str.split(" ");
		
		String newString = "";
		
		for(int i = arr.length-1; i>=0;i--) {
			//System.out.println(arr[i]);
			newString = newString + arr[i] + " ";
			
		}
		
		System.out.println(newString);

	}

}
