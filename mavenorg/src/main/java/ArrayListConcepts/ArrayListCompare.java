package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		// 1) Sort and use Equals
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));
		
		// 2) Compare by using Additional Element
		//list1.removeAll(list2);
		
		//System.out.println(list1);
		
		// 3) Compare by finding common element
		
		list1.retainAll(list2);
		
		System.out.println(list1);
		
		// 4) Compare by finding missing element
		
		//list2.removeAll(list1);
		//System.out.println(list2);

	}

}
