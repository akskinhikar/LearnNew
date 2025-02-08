package SDETCodingPractice;



public class PalindromeChecker {

	public static void main(String[] args) {
		
		String str = "abcdexcb";
		String newString = "";
		
		if(isPalandrome(str)) {
			System.out.println(str + " is Palandrom");
		} else {
			System.out.println(str + " is NOT Palandrom");
		}
		
		
		
		
		StringBuffer sb = new StringBuffer(str);
		
		if(str.equals(sb.reverse().toString())) {
			System.out.println(str + " is Palandrom");
		} else {
			System.out.println(str + " is NOT Palandrom");
		}
		
		
		for(int i = str.length()-1;i>=0;i--) {
			newString = newString + str.charAt(i);
			
		}
		
		if(str.equals(newString)) {
			System.out.println(str + " is Palandrom");
		} else {
			System.out.println(str + " is NOT Palandrom");
		}
		

	}
	
	public static boolean isPalandrome(String str) {
		
		if(str == null) {
			return false;
		}
		
		if(str.length()==1) {
			return true;
		}
		
		String first = str.substring(0,1);
		String last = str.substring(str.length()-1,str.length());
		
		if(!first.equals(last)) {
			return false;
		}else {
			return isPalandrome(str.substring(1,str.length()-1));
		}
		
	}
	
	
	
	

}
