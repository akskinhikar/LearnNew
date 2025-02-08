package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo2 {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("Akshay","Karan","Isha","Shilpa"));
		
		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("Chum","Shruti"));
		
		//arr1.addAll(arr2);
		
		arr1.addAll(2, arr2);
		
		System.out.println(arr1);
		
		System.out.println(arr1.indexOf("Shruti"));
		System.out.println(arr1.lastIndexOf("Chum"));
		
		
		
		
		
		
		
	}

}
