package SDETCodingPractice;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWordRemoval {

	public static void main(String[] args) {
		String str = "Hello world how how are you";
		
		String[] strArr = str.split(" ");
		
		Set<String> mySet = new LinkedHashSet<>();
		
		for(String x : strArr) {
			mySet.add(x);
		}
		
		Iterator<String> itr = mySet.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		
		

	}

}
