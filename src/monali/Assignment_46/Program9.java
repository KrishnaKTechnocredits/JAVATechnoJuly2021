package monali.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/*Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]*/

public class Program9 {

	ArrayList<Integer> removeDuplicatesUsingList(Integer arr1[], Integer arr2[]) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr1));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr2));

		list1.removeAll(list2);
		list1.addAll(list2);
		return list1;

	}

	TreeSet<Integer> removeDuplicatesUsingSet(Integer arr1[], Integer arr2[]) {
		TreeSet<Integer> list1 = new TreeSet<Integer>(Arrays.asList(arr1));
		TreeSet<Integer> list2 = new TreeSet<Integer>(Arrays.asList(arr2));

		list1.removeAll(list2);
		list1.addAll(list2);
		return list1;

	}

	public static void main(String[] args) {
		Integer arr1[] = { 10, 19, 33, 44, 12 };
		Integer arr2[] = { 19, 99, 110, 11, 10 };
		Program9 p9 = new Program9();
		System.out.println("Using ArrayList Union : " + p9.removeDuplicatesUsingList(arr1, arr2));
		System.out.println("Using TreeSet union : " + p9.removeDuplicatesUsingSet(arr1, arr2));
	}
}
