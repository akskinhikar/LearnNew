package SDETCodingPracticeTwo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StringManipulation {

	public static void main(String[] args) {
		//check for anagram string
		
	//anagramString("tons", "ston");
		
		//updateTheArrays();
		
		//countWords();
		
		//duplicatWordRemoval();
		
	}
	
	
	public static void anagramString(String str1,String str2) {
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		boolean flag = false;
		
		if(ch1.length == ch2.length) {
			System.out.println("Strings can be Anagram as lenght matches -- Need to check more");
			for(int i = 0; i<ch1.length;i++) {
				for(int j = 0; j<ch2.length;j++) {
					if(ch1[i]==ch2[j]) {
						flag = true;
						break;
						
					} else {
						flag = false;
						
					}
				}
				
			}
			if(flag) {
				System.out.println("Yes ! Its a Anagram String");
			}else {
				System.out.println("Opps ! Its not a Anagram String");
			}
			
			
			
		} else {
			System.out.println("String is Not Anagram as Length don't match.");
		}
		
		
	}

	public static void updateTheArrays() {
		
		String[] str = {"Sunday", "Monday","Tuesday","Wednesday"};
		String[] newStr = new String[str.length];
		for(int i=0;i<str.length;i++) {
			newStr[i] = str[i].substring(0,3);
		}
		
		
		for(String e : newStr)
		System.out.println(e);
		
 		
		
	}
	
	
	public static void countWords() {
		
		String str = "How was your morning today your" ;
		String[] arr = str.split(" ");
		int count = 1;
		
		Map<String,Integer> map = new HashMap<>();
		
		for(int i = 0; i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
				
				
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
			
		}
		
		for(String e : map.keySet()) {
			System.out.println(e +" : "+ map.get(e) );
		}
			
		
	}
	
	
	public static void duplicatWordRemoval() {
		
		String str = "One two One two three four ";
		String [] arr = str.split(" ");
		String newStr ="";
		
		Set<String> set = new LinkedHashSet<>();
		
		for(String e : arr) {
			set.add(e);
			
		}
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		
		
		for(String s : set) {
			newStr = newStr+ s +" ";
		}
		System.out.println(newStr);
		
		
	}
	
	
	










}
