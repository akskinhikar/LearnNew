package SDETCodingPractice;

import java.util.HashMap;
import java.util.Map;

//Code to return the counts of the words

public class CountWords {
	
	public static void main(String [] args) {
		
		String str = "I am learning learning java programing";
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		Integer count = 1;
		String[] arr = str.split(" ");
		System.out.println(str);
		
		
		for(int i=0; i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
				
			}else {
				System.out.println(map.get(arr[i])+1);
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(String x :  map.keySet()) {
			System.out.println("The count of words "+x+" = "+ map.get(x));
		}
		
		
		
	}

}
