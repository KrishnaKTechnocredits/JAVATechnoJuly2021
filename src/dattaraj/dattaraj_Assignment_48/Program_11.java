
package dattaraj.dattaraj_Assignment_48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program_11 {
	
	void usingWithoutCollection(Integer[] arr) {
		System.out.println("Duplicate numbers in array " + Arrays.toString(arr) + " using array & loop inside loop- ");
		for(int index=0; index<arr.length; index++) {
			for(int index1=index+1; index1<arr.length; index1++) {
				if(arr[index]==arr[index1]) {
					System.out.print(arr[index1] + " ");
				}
			}
		}
	}
	
	void usingArrayList(Integer[] arr) {
		System.out.println();
		System.out.println("Duplicate numbers in array " + Arrays.toString(arr) + " using arraylist- ");
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		for(int index=0; index<al.size(); index++) {
			if(al.lastIndexOf(al.get(index))!=al.indexOf(al.get(index))) {
				System.out.print(al.get(index) + " ");
				al.remove(al.get(index));
			}
		}
	}
	
	void usingSet(Integer[] arr) {
		System.out.println();
		System.out.println("Duplicate numbers in array " + Arrays.toString(arr) + " using set- ");
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		Set<Integer> set = new HashSet<Integer>();
		for(int index=0; index<al.size(); index++) {
			if(set.contains(al.get(index)))
				System.out.print(al.get(index) + " ");
			else
				set.add(al.get(index));
		}
	}
	
	void usingMap(Integer[] arr) {
		System.out.println();
		System.out.println("Duplicate numbers in array " + Arrays.toString(arr) + " using map- ");
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
		new Program_11().usingWithoutCollection(arr);
		new Program_11().usingArrayList(arr);
		new Program_11().usingSet(arr);
		new Program_11().usingMap(arr);
	}
}