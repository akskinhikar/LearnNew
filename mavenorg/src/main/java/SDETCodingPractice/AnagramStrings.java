package SDETCodingPractice;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		String str1 = "stop";
		String str2 ="toys";
		boolean flag = false;
		
		char[] arr1=str1.toLowerCase().toCharArray();
		char[] arr2=str2.toLowerCase().toCharArray();
		
		String str3 = "Stop";
		String str4 = "Tops";
		
		
		if(arr1.length == arr2.length){
			System.out.println("As lenght is equal hence it can be Anagram");
			
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					if(arr1[i] == arr2[j]) {						
						flag = true;
						break;
					}else {
						flag = false;
					}
				}
			}
			
			if(flag) {
				System.out.println("Yes !! String is Anagram");
			}else {
				System.out.println("Oops !! String is NOT Anagram");
			}
			
		}else {
			System.out.println("String is NOT Anagram as length is not equal");
		}
		
		
		System.out.println("**** Another ways to compair the arrays ****");
		
		// Another way to write the same code
		
		char[] arr3 = str3.toLowerCase().toCharArray();
		char[] arr4 = str4.toLowerCase().toCharArray();
		
		Arrays.sort(arr3);
		Arrays.sort(arr4);
		
		if(Arrays.equals(arr3, arr4)) {
			System.out.println("Yes !! String is Anagram");
		}else {
			System.out.println("Oops !! String is NOT Anagram");
		}
		
		
		
		
		

	}

}
