package suchita;
// Assignment 46_16

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Assignment46_16 {

	//Write a program to add element at particular index of ArrayList.
	public static void main(String[] args) {
		
		String arr[] = {"hashset", "treeset", "class", "array", "linklist"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("\nInput list :: " + list);
		list.add(2, "PUNE");
		System.out.println("\nUpdated list after adding new element at index 3 :: " + list);
		list.set(4, "BANGALORE");
		System.out.println("\nUpdated list after updating element at index 2 :: " + list);
	}
}