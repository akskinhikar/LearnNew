package SDETCodingPractice;

public class ExtractStringPart {

	public static void main(String[] args) {
		
		String str = "www.amazon.com";
		
		System.out.println(str.substring(0, 4));
		
		System.out.println(str.substring(10,str.length()));
		
		System.out.println(str.substring(4,str.length()-4));


	}

}
