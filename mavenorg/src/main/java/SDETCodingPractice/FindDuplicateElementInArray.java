package SDETCodingPractice;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {

		int[] inputArr = {12,2,34,33,33,45,64,64,67,43,67,14};
		
		findDuplicateElement(inputArr);
		
		//using sorting method
		
		findDuplicateUsingSortingMethod(inputArr);
		
		//using set as set don't contains duplicate values
		findDuplicateUsingSet(inputArr);
		
		
		findDuplicateUsingHashMap(inputArr);
		

	}
	
	public static void findDuplicateElement(int arr[]) {
		
		for(int i = 0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {

				if(arr[i]==arr[j]) {
					count ++;
					System.out.println(arr[i] +" Duplicate element found " + count + " times" );

				}
			}
		}
		
	}
	
	public static void findDuplicateUsingSortingMethod(int arr[]) {
		
		Arrays.sort(arr);
		
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]+" is duplicate ");
			}
		}
		
	}
	
	public static void findDuplicateUsingSet(int arr[]) {
		
		Set<Integer> hs = new HashSet<>();
		
		for(int x : arr) {
			if(!hs.add(x)) {
				System.out.println("Duplicate element is "+x);
			}
		}
		
	}
	
	public static void findDuplicateUsingHashMap(int arr[]) {
		Map<Integer,Integer> map = new HashMap<>();
		int count = 1;
		
		for(int x : arr) {
			if(!map.containsKey(x)) {
				map.put(x, count);
			}else {
				map.put(x, map.get(x)+1);
			}
			
	
		}
		
		for(int x : map.keySet()) {
			if(map.get(x)>1)
			System.out.println(x+" has occurred for "+map.get(x));
		}
		
		
		
	}
	
	

}
