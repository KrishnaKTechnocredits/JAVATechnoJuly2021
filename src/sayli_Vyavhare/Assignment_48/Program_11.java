/* Assignment - 48 : 9th Oct'2021
program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1. */

package sayli_Vyavhare.Assignment_48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program_11 {
	
	static void duplicateUsingarray(Integer[] arr) {
		System.out.println("Duplicate numbers in array");
		for(int index=0; index<arr.length; index++) {
			for(int index1=index+1; index1<arr.length; index1++) {
				if(arr[index]==arr[index1]) {
					System.out.print(arr[index1] + " ");
				}
			}
		}
	}
	
	static void usingArrayList(Integer[] arr) {
		System.out.println();
		System.out.println("Duplicate numbers in array using arraylist");
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		for(int index=0; index<al.size(); index++) {
			if(al.lastIndexOf(al.get(index))!=al.indexOf(al.get(index))) {
				System.out.print(al.get(index) + " ");
				al.remove(al.get(index));
			}
		}
	}
	
	static void usingSet(Integer[] arr) {
		System.out.println();
		System.out.println("Duplicate numbers in array using set");
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		Set<Integer> set = new HashSet<Integer>();
		for(int index=0; index<al.size(); index++) {
			if(set.contains(al.get(index)))
				System.out.print(al.get(index) + " ");
			else
				set.add(al.get(index));
		}
	}
	
	static void usingMap(Integer[] arr) {
		System.out.println();
		System.out.println("Duplicate numbers in array using map");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer num : arr) {
			if(map.containsKey(map.get(num)))
				map.put(num, map.get(num)+1);
			else
				map.put(num, 1);
		}
		for(Integer key : map.keySet()) {
			if(map.get(key)>1)
				System.out.print(key + " ");
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1,11,33,22,22,11,1,9,7,7};
		duplicateUsingarray(arr);
		usingArrayList(arr);
		usingSet(arr);
		usingMap(arr);
	}
}