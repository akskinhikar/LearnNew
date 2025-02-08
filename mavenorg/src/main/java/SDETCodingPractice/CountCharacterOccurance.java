package SDETCodingPractice;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		String str = "My name is Akshay Kinhikar";
		char c = 'a';
		String cN = "a";
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == c) {
				count ++;
			}
		}
		System.out.println("Occrance of "+ c + " is "+ count);
		
		System.out.println("Another way to wright this code");
		
		int countN = str.length()-str.replaceAll(cN, "").length();
		System.out.println("Occrance of "+ cN + " is "+ countN);

	}

}
