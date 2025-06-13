package suchita;
// Assignment 46_11

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

class Assignment46_11 {

	//Remove all zeros from given ArrayList.
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 0, 0, 1, 0, 3, 0, 2, 6));
		System.out.println("\nList :: " + list1);
		for (int index = 0; index < list1.size(); index++)
			if (list1.get(index).equals(0)) {
				list1.remove(index);
				index--;
			}

		System.out.println("Output list containing numbers without 0 in list :: " + list1);

	}

}