package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Static array
		int i[] = new int[4];
		i[0]=100;
		i[1]=101;
		
		System.out.println("** Static Array **");
		System.out.println(i[0]);
		//System.out.println(i[5]); -> Array Index Out of Bound Exception 
		
		//Dynamic Array
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(100);
		arr.add(101);
		arr.add("abcd");
		arr.add('F');
		arr.add(true);
		arr.add(22.34);
		
		System.out.println("** Dynamic Array **");
		System.out.println(arr);
		
		
		ArrayList<String> arStr = new ArrayList<String>();
		arStr.add("Akshay");
		arStr.add("Ameya");
		arStr.add("Alok");
		arStr.add("Avinash");
		
		System.out.println("---------For Loop ---------");
		
		for(int ii=0;ii<arStr.size();ii++) {
			System.out.println(arStr.get(ii));
		}
		
		System.out.println("---------For Each Loop ---------");
		
		for(String s : arStr) {
			System.out.println(s);
		}
		
		System.out.println("-------Stream and Lamda -----------");
		
		arStr.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("-------Iterator-----------");
		
		Iterator<String> it = arStr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		

	}

}
