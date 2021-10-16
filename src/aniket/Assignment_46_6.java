package aniket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

// Find the second largest number from Given Array. Hint : Convert Array -> TreeSet -> ArrayList 
public class Assignment_46_6 {

	void getSecondLargestNumber(Integer[] input) {
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(input));
		System.out.println(set);
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		// System.out.println("Second largest number from the arraylist is : " +
		// list.size()-2));
		System.out.println("Second largest number from the arraylist is " + list.get(list.size() - 2));
	}

	public static void main(String[] args) {

		Integer[] input = { 20, 40, 85, 65, 98, 100, 98 };

		Assignment_46_6 assignment_46_6 = new Assignment_46_6();
		assignment_46_6.getSecondLargestNumber(input);

	}
}
