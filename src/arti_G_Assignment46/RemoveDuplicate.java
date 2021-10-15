package arti_G_Assignment46;

/*Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	// Using set || 4 program
	static void removeDuplicate(ArrayList<Integer> input) {
		Set<Integer> set1 = new LinkedHashSet(input);
		System.out.println("Removed duplicate elements in the given list : " + set1);

	}

	public static void main(String[] args) {
		Integer[] input = { 2, 4, 8, 34, 67, 23, 43, 67 };
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(input));
		removeDuplicate(list);
		
		

	}
}
