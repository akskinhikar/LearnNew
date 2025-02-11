package SDETCodingPracticeTwo;

import java.util.Set;
import java.util.TreeSet;

public class SortingAnArray {

	public static void main(String[] args) {
		
		
		sortingArray();
		//largetstSmallestNo();
		secondLargestElem();
		

	}
	
	public static void sortingArray() {
		int[] arr = {65,34,22,66,55,10,32,87,34,10};
		
		
		Set<Integer> treeSet = new TreeSet<>();
		for(Integer e: arr) {
			treeSet.add(e);
		}
		
		System.out.println(treeSet);
		
		
	}
	
	public static void largetstSmallestNo() {
		int[] arr = {65,34,22,66,55,10,32,87,34,10};
		
		int large = arr[0];
		int small = arr[0];
		
		for(int i = 1; i<arr.length;i++) {
			
			if(arr[i]>large) {
				large = arr[i];
			} else if(arr[i]<small) {
				small=arr[i];
			}
			
		}
		
		System.out.println("small = "+ small+" large = "+ large);
		
		
	}
	
	public static void secondLargestElem() {
		
		int[] arr = {65,34,22,66,55,10,32,87,34,10};
		
		int firstL=0;
		int secondL=0;
		
		if(arr[0]>arr[1]) {
			firstL=arr[0];
			secondL=arr[1];
		}else if(arr[1]>arr[0]) {
			
			firstL=arr[1];
			secondL=arr[0];
		}
		
		for(int i = 2; i<arr.length;i++) {
			
			if(arr[i]>firstL) {
				secondL=firstL;
				firstL=arr[i];
			} else if(arr[i]> secondL && arr[i]<firstL) {
				secondL=arr[i];
			}
			
		}
		
		System.out.println("First Lagest = "+ firstL);
		System.out.println("Second Lagest = "+ secondL);
		
	}

}
