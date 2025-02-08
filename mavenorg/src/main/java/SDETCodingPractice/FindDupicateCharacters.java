package SDETCodingPractice;

import java.util.HashMap;
import java.util.Map;

public class FindDupicateCharacters {

	public static void main(String[] args) {
		String str = "AkshayKinhikar";
		char[] arr = str.toCharArray();
		int count = 1;
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i = 0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
				
			} else {
				map.put(arr[i], map.get(arr[i])+1);
			}
					
			
		}
		
		for(char x : map.keySet()) {
			if(map.get(x)>1)
			System.out.println("count of "+ x + " is "+ map.get(x));
		}
		

	}

}
