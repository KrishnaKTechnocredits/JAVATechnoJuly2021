/* Assignment 46 - Collections : 4th Oct'2021
Example 4: Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same. */

package manaswi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment_46_Program_4
 {

	void removeDuplicatesUsingSet(ArrayList<Integer> al) 
	{
		Set<Integer> s = new LinkedHashSet<Integer>(al);
		System.out.println(s + " is the list after removing all duplicates");
	}

	public static void main(String[] args) 
	{
		Integer[] input = {5, 34, 11, 56, 74, 85, 11, 5};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		Assignment_46_Program_4 p4 = new Assignment_46_Program_4();
		p4.removeDuplicatesUsingSet(al);
	}
}