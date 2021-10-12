package aniket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Write a program to remove duplicate from ArrayList (using set).
public class Assignment_46_4 {

	void removeDuplicateUsingSet(Integer input[]) {

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(input));
		Set<Integer> list2 = new LinkedHashSet<Integer>(list1);
		System.out.println("After removing duplicates from an ArrayList : " + list2);

	}

	public static void main(String[] args) {
		Integer[] input = { 20, 10, 77, 55, 456, 365, 12, 20, 10, 55, 90 };
		Assignment_46_4 assignment_46_4 = new Assignment_46_4();
		assignment_46_4.removeDuplicateUsingSet(input);
	}
}
