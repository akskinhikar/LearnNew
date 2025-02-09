package SDETCodingPractice;

import java.util.Arrays;


public class FindMissingNumAndInsert {

	public static void main(String[] args) {
		
		int[] numArr= {1,2,3,5,6,7,8,9,10};
		
		int sum=0;
		int sumoftennums = 0;
		
		for(int i=0;i<numArr.length;i++) {
			sum=sum+numArr[i];
		}
		
		for(int i = 0;i<=10;i++) {
			sumoftennums=sumoftennums+i;
		}
		
		System.out.println(sum);
		System.out.println(sumoftennums);
		int missingNum = sumoftennums-sum;
		System.out.println("Missing number = " + missingNum);
		
		insertMissingElementInArray(numArr.length, missingNum, numArr);
		
		

	}
	
	public static void insertMissingElementInArray(int n, int missingNum, int arr[]) {
		
		int newArrayLength = n+1;
		int[] newArray = new int[newArrayLength];
		int i;
		
		System.out.println(Arrays.toString(arr));
		
		for(i = 0; i<newArrayLength;i++) {
			if(arr[i]<missingNum) {
				newArray[i]=arr[i];
				
			}else {
				newArray[i]=missingNum;
				break;
			}
			
			
		}
		System.out.println(Arrays.toString(newArray));
			
		for(int j =i+1;j<newArrayLength;j++) {
			newArray[j]=arr[j-1];
			System.out.println(newArray[j]);
		}			

		System.out.println(Arrays.toString(newArray));
	}

}
