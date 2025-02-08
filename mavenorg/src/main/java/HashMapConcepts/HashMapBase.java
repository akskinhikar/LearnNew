package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hashMap1 = new HashMap<String, String>();
		hashMap1.put("India", "Nagpur");
		hashMap1.put("Canada", "Montreal");
		hashMap1.put("USA", "NY");
		hashMap1.put("PK", "Karachi");
		hashMap1.put(null, "Bahanamas");
		hashMap1.put("Chaina", null);
		hashMap1.put("UK", null);
		
		Iterator<String> it = hashMap1.keySet().iterator();
		
		System.out.println("----------Using Key Set ------------");
		
		
		while(it.hasNext()) {
			String Key = it.next();
			String Value = hashMap1.get(Key);
			System.out.println("Keys = "+ Key+" "+ "Values = " + Value);
			
			
		}
		
		System.out.println("-----------Using Entry Set -----------");
		
		
		Iterator<Entry<String,String>> it1 = hashMap1.entrySet().iterator();
		
		while(it1.hasNext()) {
			Entry<String,String> entry = it1.next();
			System.out.println("Key = "+entry.getKey()+ " "+"Values = "+entry.getValue());
		}
		
		System.out.println("-----------Using Streams -----------");
		
		hashMap1.forEach((k,v) -> System.out.println("Key = "+k+" "+ "Value = "+ v));
		
	}

}
