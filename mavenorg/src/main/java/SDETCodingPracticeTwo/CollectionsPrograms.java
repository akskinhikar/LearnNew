package SDETCodingPracticeTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CollectionsPrograms {
	
	public static void main(String[] args) {
		
		//usingVector();
		//maxNum();
		//maxNumEachRow();
		//searchElement();
		//convertArraysToList();
		//convertCollectionToArray();
		compareElements();
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
		
		

}
