package suchita;
// Assignment 46_9

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

class Assignment46_9 {

	//WAP to return Union of two ArrayList without duplicates.
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 19, 33, 44, 12));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(19, 99, 110, 11,10));
		System.out.println("List 1 :: " + list1);
		System.out.println("List 2 :: " + list2);
		list2.removeAll(list1);
		list1.addAll(list2);

		System.out.println("Output list containing union of list1 and list2 minus the duplicates :: " + list1);

	}
}