package SDETCodingPractice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "programming";
		int count = 1;
		
		Map<Character,Integer> map = new HashMap<>();
		char[] arr = str.toLowerCase().toCharArray();
		
		for(int i = 0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Character x: map.keySet()) {
			if(map.get(x) == 1) {
				System.out.println("First Non repetative character is : " + x );
				break;
			}
			
			
		}
		


	}

}
