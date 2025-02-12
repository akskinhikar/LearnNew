package SDETCodingPracticeTwo;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringsRelatedPrgs {

	public static void main(String[] args) {

		//upperToLower();
		//replaceStringWithSpecialChar();
		//reverseEachWordInString();
		firtNonRepetativeChar();
		
		
		

	}
	
	
	public static void upperToLower() {
		String str = "My Name Is Akshay Kinhikar !";
		
		String newStr = "";
		
		StringBuffer sb = new StringBuffer(str);
		
		
		for(int i = 0; i<str.length();i++) {
			if(sb.charAt(i)== ' ') {
				newStr = newStr + sb.charAt(i);
				
			
			}else if(sb.charAt(i)>='a' && sb.charAt(i)<='z'){
				
				newStr = newStr + Character.toUpperCase(sb.charAt(i));
				
			}else if(sb.charAt(i)>='A' && sb.charAt(i)<='Z'){
				
				newStr = newStr + Character.toLowerCase(sb.charAt(i));
			}else {
				newStr = newStr + sb.charAt(i);
			}
		}
		
		System.out.println(newStr);
	}
	
	
	public static void replaceStringWithSpecialChar() {
		String str = "My Name Is Akshay Kinhikar !";
		char[] sb = str.toCharArray();
		String newStr="";
		

		
		for(int i = 0; i<sb.length;i++) {
			if(sb[i]=='a') {
				sb[i]='*';
				newStr=newStr+sb[i];
			}else {
				newStr=newStr+sb[i];
			}
		}
		
		System.out.println(newStr);
		
	}
	
	public static void reverseEachWordInString() {
		
		String str = "My Name is Akshay Kinhikar";
		String[] arr = str.split(" ");
		String newString ="";
		
		for(int i = 0;i<arr.length;i++) {
			
			char[] ch = arr[i].toCharArray();
			String revWord ="";
			for(int j =ch.length-1;j>=0;j--) {
				revWord=revWord+ch[j];
			}
			newString=newString+revWord+" ";
			
		}
		
		System.out.println(newString);
	}
	
	public static void firtNonRepetativeChar() {
		
		
		String str = "fdsfdgergergfga";
		
		char[] arr = str.toCharArray();
		
		int count = 1;
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
				
			}else {
				map.put(arr[i], map.get(arr[i])+1);
				
			}
		}
		
		for(Character e: map.keySet()) {
			//System.out.println(e+" : "+map.get(e));
			if(map.get(e)==1) {
			System.out.println(e+" : "+map.get(e));
			break;
			}
		}
		
		
		
	}
	

}
