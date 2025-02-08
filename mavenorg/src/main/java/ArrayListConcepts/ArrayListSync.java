package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSync {

	public static void main(String[] args) {
		// 2 ways of synchronization of Array list
		
		//1)
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Akshay");
		nameList.add("Ajay");
		nameList.add("Girish");
		nameList.add("Partha");
		
		synchronized (nameList) {
			System.out.println(nameList);
			
			Iterator<String> it = nameList.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		
		
		//2)
		CopyOnWriteArrayList<String> nameList1 = new CopyOnWriteArrayList<String>();
		nameList1.add("Kin");
		nameList1.add("few");
		nameList1.add("xxx");
		nameList1.add("rer");
		
		Iterator<String> it1 = nameList1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
		

	}

}
