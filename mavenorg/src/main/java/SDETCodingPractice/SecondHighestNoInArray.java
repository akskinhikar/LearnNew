package SDETCodingPractice;

public class SecondHighestNoInArray {

	public static void main(String[] args) {
		int[] arr = {30,10,20,11,56,76,88,23,1};
		int first = 0;
		int second = 0;
		
		
		if(arr[0]>arr[1]) {
			first=arr[0];
			second=arr[1];
		}else if(arr[0]<arr[1]){
			
			first=arr[1];
			second=arr[0];
		}
		
		for(int i=2;i<arr.length;i++) {

			if(arr[i]>first) {
				second = first;
				first=arr[i]; 
			}else if(arr[i]>second && arr[i]<first) {
				second=arr[i];
			}
		}
		
		System.out.println(second);
		
		
		

	}

}
