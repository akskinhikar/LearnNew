package SDETCodingPracticeTwo;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class AllDuplicationRelatedPrg {

	public static void main(String[] args) {
	/*
	 * 
	 */
		
		
		//duplicateWordRemoval();
		//duplicateCharCount();
		findDuplicateElementIntArray();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void duplicateWordRemoval() {
		String str = "My name name is is Akshay Kinhikar Akshay";
		String newStr = "";
		
		String[] arr = str.split(" ");
		
		Set<String> set = new LinkedHashSet<>();
		
		for(String e : arr) {
			
			set.add(e);
		}
		
		for(String e : set) {
			newStr = newStr + e + " ";
		}
		
		System.out.println(newStr);
		
		
		
	}
	
	public static void duplicateCharCount() {
		
		String str = "abcddefachjdwkd";
		
		char[] arr = str.toCharArray();
		int count=1;
		
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
			map.put(arr[i], count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Character e: map.keySet()) {
			if(map.get(e)>1) {
				System.out.println("Charecter "+ e + " is appearing "+ map.get(e)+ " times");
			}
		}
		
	}
	
	
	public static void findDuplicateElementIntArray() {
		
		int[] arr = {12,43,54,62,22,12,43,62,22,54};
		int count = 1;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		
		for(int e: arr) {
			if(!map.containsKey(e)) {
				map.put(e, count);
			}else {
				map.put(e, map.get(e)+1);
				
			}
		}
		
		for(int e : map.keySet()) {
			if(map.get(e)>1)
			System.out.println(e + " is appreaing for : "+map.get(e));
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			int c = 0;
			for(int j=i;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					c++;
				}
			}
			
			if(c>1) {
				System.out.println(arr[i]+" is appreaing for : "+ c);
			}
		}
		
		
		
	}

}
