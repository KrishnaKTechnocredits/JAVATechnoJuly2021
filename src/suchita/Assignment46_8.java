package suchita;
// Assignment 46_8

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

class Assignment46_8 {

	//Return all negative numbers (remove duplicates if any and maintain insertion order) from given array
	LinkedList<Integer> findNegative(int num[]) {
		System.out.println("\nInput list ::" + Arrays.toString(num));
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int index : num)
			if (index < 0 && !list.contains(index))
				list.add(index);

		return list;

	}

	public static void main(String[] args) {
		
		Assignment46_8 assignment = new Assignment46_8();
		int num[] = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		
		System.out.println("The output list with non-duplicate negative numbers in inserted order :: " + assignment.findNegative(num));

	}

}