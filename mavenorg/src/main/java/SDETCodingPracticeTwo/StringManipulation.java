package SDETCodingPracticeTwo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringManipulation {

	public static void main(String[] args) {
		//check for anagram string
		
	//anagramString("tons", "ston");
		
		//updateTheArrays();
		
		//countWords();
		
		//duplicatWordRemoval();
		
		//findDuplicateChar("hackerearth");
		
		//removeDuplicateChar("abcdaefcghf");
		
		
		//reverseAString("This is a string");
		
		//nonSpaceChar("This is a string");
		
		//swapTwoString("This is a string");
		
		collec();
		
		
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
	
	//Write a program to find duplicate characters in a given String.
	
	public static void findDuplicateChar(String str) {
		
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
		
		for(Character e : map.keySet()) {
			if(map.get(e)>1)
			System.out.println(e +" : "+ map.get(e));
		}
		
		
	}
	
	
	//Write a program to remove duplicate characters in a given String.
	
	public static void removeDuplicateChar(String str) {
		
		char[] arr = str.toCharArray();
		int count = 1;
		String str2= "";
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i = 0; i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				
					map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i])+1);
			}

		}
		
		for(Character e : map.keySet()) {
			if(map.get(e)==1) {
				str2=str2+e;
			}
		}
		
		System.out.println(str2);
		
		
		
	}
	
	//Write a program to reverse a given string.
	public static void reverseAString(String str) {
		
		String revString = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			revString = revString+str.charAt(i);
		}
		
		System.out.println(revString);
			
			
			
	}
	
	
	public static void nonSpaceChar(String str) {
		
		int count = 0;
		char c = ' ';
		for(int i =0 ; i<str.length(); i++) {
			if(str.charAt(i)!= c) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	
	public static void swapTwoString(String str) {
		
		
		StringBuilder sb = new StringBuilder(str);
		
		
		System.out.println(sb.reverse().toString());
		
	}
	
	
	public static void collec() {
		
		
		Object[] foo = new Object[4];
		foo[0] = "Akshay";
		foo[1] = 1234;
		foo[2] = true;
		foo[3] = 3.14;
		
		System.out.println(foo[0].getClass());
		System.out.println(foo[1].getClass());
		System.out.println(foo[2].getClass());
		System.out.println(foo[3].getClass());
		
		for(Object o : foo) {
			System.out.println(o);
		}
		
		int num = (Integer)foo[1];
		
		System.out.println(num);
	
		
	}
	
	
	
		
		
	

	










}
