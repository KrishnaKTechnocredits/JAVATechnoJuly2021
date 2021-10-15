/* Assignment 46 - Collections : 4th Oct'2021
Example 4: Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same. */

package akanksha_Jain.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program_4 {
	
	void removeDuplicatesUsingSet(ArrayList<Integer> al) {
		Set<Integer> s = new LinkedHashSet<Integer>(al);
		System.out.println(s + " is the list after removing all duplicates");
	}
	
	public static void main(String[] args) {
		Integer[] input = {7, 12, 22, 33, 65, 87, 13, 33, 7};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		Program_4 p4 = new Program_4();
		p4.removeDuplicatesUsingSet(al);
	}
}