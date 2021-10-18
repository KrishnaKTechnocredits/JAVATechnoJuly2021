/*
 * Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.

 */
package bhagyashree.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment46_4 {

	static void removeDuplicatesUsingSet(ArrayList<Integer> arr) {
		Set<Integer> set = new LinkedHashSet(arr);
		System.out.println(set);
	}

	public static void main(String[] args) {
		Integer[] input = { 5, 5, 9, 9, 8, 3, 5, 12, 89, 26 };
		ArrayList<Integer> arraylist = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(arraylist);
		removeDuplicatesUsingSet(arraylist);
	}

}
