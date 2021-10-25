/*Example 4: 
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/
package sayli_Vyavhare.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program_4 {

	static void removeDuplicatesUsingSet(Integer[] input) {
		
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(input));
		
		Set<Integer> set=new LinkedHashSet<Integer>(al);
		
		System.out.println("Output afer removing duplicate from ArrayList (using set).:"+set);
	}
	public static void main(String[] args) {
		Integer[] input1 = { 5, 66, 98, 7, 10, 5 };
		removeDuplicatesUsingSet(input1);
	}
}
