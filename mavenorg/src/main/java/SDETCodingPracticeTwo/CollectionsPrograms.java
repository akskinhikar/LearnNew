package SDETCodingPracticeTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsPrograms {
	
	public static void main(String[] args) {
		
		//usingVector();
		//maxNum();
		//maxNumEachRow();
		//searchElement();
		//convertArraysToList();
		//convertCollectionToArray();
		//compareElements();
		//collect();
		//collections();
		copyArrays();
	}
	
	
	public static void usingVector() {
		
		int[] arr = {2,56,76,43,12};
		
		Vector<Integer> v = new Vector<>();
		
		for(int e : arr) {
			v.add(e);
		}
		
		/*
		 * v.add(2); v.add(56); v.add(76); v.add(43); v.add(12);
		 */
		
		System.out.println("Maximum value in the list is "+ Collections.max( v));
		System.out.println("Min value in the list is "+ Collections.min( v));
		
	}
	
	
	public static void  maxNum() {
		
		int mat[][] = { { 1, 3, 4, 19 },
                { 11, 10, 12, 1 },
                { 7, 9, 0, 99 } };
		
		int max = 0;
		
		for(int i = 0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				max = Math.max(mat[i][j], max);
			}
		}
		
		System.out.println(max);
		
		
		
		
	}
	
	public static void  maxNumEachRow() {
		
		int mat[][] = { { 1, 3, 4, 19 },
                { 11, 10, 12, 1 },
                { 7, 9, 0, 99 } };
		
		
		
		for(int i = 0;i<mat.length;i++) {
			int max = 0;
			for(int j=0;j<mat[0].length;j++) {
				max = Math.max(mat[i][j], max);
			}
			System.out.println(max);
		}
		
		int max = 0;
		
		for(int i = 0;i<mat.length;i++) {
			for(int j = 0; j<mat[0].length;j++) {
				if(mat[i][j]>max) {
					max =  mat[i][j];
				}
			}
		}
		
		System.out.println(max);
		
		
		
		
	}
	
	
	public static void searchElement() {
		
		int[] arr = {2,56,76,43,12};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));

		
		int index = Arrays.binarySearch(arr, 43);
	

		
		System.out.println(index);
		
		
		
		
	}
	
	
	public static void convertArraysToList() {
		int[] arr = {2,56,76,43,12};
		String playersArray[]= { "Virat", "Sachin", "Rohit", "Bumrah" };
		System.out.println(Arrays.toString(arr));
		
		List<int[]> newArr = Arrays.asList(arr);
		List<String> newPlayerList = Arrays.asList(playersArray);
		
		System.out.println(newPlayerList);
		
		


	}
	
	
	public static void convertCollectionToArray() {
		
		
		List<String> lst = new ArrayList<>();
		lst.add("abcd");
		lst.add("efdg");
		lst.add("gfre");
		lst.add("qwer");
		lst.add("bgte");
		
		System.out.println(lst);
		
		String[] str = lst.toArray(new String[lst.size()]);
		
		for(String e:str) {
			System.out.println(e);
		}
		
	}
	
	public static void compareElements() {
		
		
		List<Integer> lst = Arrays.asList(10, 07, 16, 2001, 1997, 10052022);
		
		int max = lst.get(0);
		int min = lst.get(0);

		
		for(int e : lst) {
			
			if(e > max) {
				max = e;
				
			} else if (min > e) {
				min = e;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		
	}
		
	
	public static void collect() {
		
		
		/*
		 * Fixed size array
		 * no in built methods
		 * difficult to iterate 
		 */
		
		System.out.println("****** Arrays *****");
		String[] arrays = {"Rahul","Raj","Neel","Rohan"};
				
		/*
		 *  ArrayList are faster in Searching elements
		 *  Dynamic array size
		 *  Addition and removal is possible 
		 */
		
		System.out.println("****** Array List *****");
		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("Rahul");
		arrayList.add("Raj");
		arrayList.add("Neel");
		arrayList.add("Rohan");
		
		System.out.println(arrayList.get(3)); // quickly searches the element
		
		arrayList.add(2, "Akshay"); //will take time to add or remove the element
		arrayList.forEach(System.out::println);
		
		/*
		 *  LinkedList are faster in addition and deletion of elements
		 */
		System.out.println("****** Linked List *****");
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Rahul");
		linkedList.add("Raj");
		linkedList.add("Neel");
		linkedList.add("Rohan");
		
		System.out.println(linkedList.get(3)); // takes time to searches the element
		
		linkedList.add(2, "Akshay"); //quickly add or remove the element
		linkedList.forEach(System.out::println);
		
		/*
		 * No order
		 * No duplicates
		 * Allows null value
		 * don't allow traversing using indexing
		 * Best for removing duplicate elements
		 * By using Hash set the addition, deletion and searching of element takes same time hence performance is very good.
		 */
		
		System.out.println("****** Hash Set *****");
		
		Set<String> setHash = new HashSet<>();
		setHash.add("Rahul");
		setHash.add("Raj");
		setHash.add("Neel");
		setHash.add("Rohan");
		setHash.add(null);
		
		System.out.println(setHash);
		System.out.println(setHash.contains("Rahul"));
		System.out.println(setHash.size());
		
		setHash.forEach(System.out::println);
		
		
		//remvoing the duplicte value;
		
		System.out.println("****** remvoing the duplicte value *****");
		List<String> list = new ArrayList<>();
		
		list.add("Rahul");
		list.add("Raj");
		list.add("Neel");
		list.add("Rohan");
		list.add("Rahul");
		list.add("Neel");
		System.out.println("With Duplicate");
		list.forEach(System.out::println);
		
		System.out.println("Without Duplicate");
		Set<String> set1 = new HashSet<>();
		set1.addAll(list);
		set1.forEach(System.out::println);
		
		/*
		 * Sorted Set
		 * Performance is NOT as good as Hash Set
		 * Should be used if sorted set is required
		 */
		
		System.out.println("****** Tree Set *****");
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Rahul");
		treeSet.add("Raj");
		treeSet.add("Neel");
		treeSet.add("Rohan");
		
		System.out.println(treeSet);
		
		/*
		 * Contains the ordered set i.e. the order in which elements are added in Set
		 * Performance is better than Tree set but not as fast as Hash Set
		 */
		
		System.out.println("****** Linked Hash Set *****");
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Rahul");
		linkedHashSet.add("Raj");
		linkedHashSet.add("Neel");
		linkedHashSet.add("Rohan");
		
		System.out.println(linkedHashSet);
		
		/*
		 *Collection of key and values
		 *Allows duplicate value
		 *Does'nt allow duplicate keys.
		 */
		System.out.println("****** Map *****");
		
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1234, "Akshay Kinhikar");
		hashMap.put(1235, "Shweta Kinhikar");
		hashMap.put(1236, "Apa Kinhikar");
		hashMap.put(1237, "Cha Kinhikar");
		
		System.out.println(hashMap);
	}
	
	  public static void collections(){
	      
	      String str = "My name is akshay kinhikar";
	      
	      String[] arr = str.split(" ");
	      
	      List<String> lst = new ArrayList<>();
	      for(String e : arr){
	          lst.add(e);
	      }
	    
	      
	      lst.forEach(System.out::println);
	      
	  }
	  
	  public static void copyArrays() {
		  
		  List<String> arryaList = new ArrayList<>(Arrays.asList("akshay","kinhi","shweta"));

		  
		  
		  Set<String> hashSet = new HashSet<>();
		  hashSet.addAll(arryaList);
		  
		  Set<String> treeSet = new TreeSet<>();
		  treeSet.addAll(arryaList);
		  
		  Set<String> linkedHashSet = new LinkedHashSet<>();
		  linkedHashSet.addAll(arryaList);
		  
		  
		  List<String> linkedList = new LinkedList<>();
		  linkedList.addAll(arryaList);
		  
		  
		  Iterator<String> it = linkedHashSet.iterator();
		  
		  while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
			
		}
		  
		  
		  System.out.println(hashSet.containsAll(linkedHashSet));
		  System.out.println(hashSet.contains("akshay"));
		  
		  Set<Object> hashSet1 = new HashSet<>(Arrays.asList("Akshay",1234,3.14));
		  
		  for(Object e : hashSet1) {
			  
			  System.out.println(e.getClass());
			  if(e.getClass().toString().contains("Integer")) {
				  System.out.println("Its an intieger");
			  }
		  }
		  
		  
		  
		  
		  
		  
	  }
		

}
