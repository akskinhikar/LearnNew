package SDETCodingPractice;

import java.util.Arrays;

public class LargestSmallestElementInArray {

	public static void main(String[] args) {
		
		
		int[] arr= {12,23,22,22,34,-11,45,67,0};
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			} else if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Largest element = " +largest);
		System.out.println("Smallest element = " +smallest);
		

	}

}
