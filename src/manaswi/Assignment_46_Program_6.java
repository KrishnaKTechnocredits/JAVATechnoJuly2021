/* Assignment 46 - Collections : 4th Oct'2021
Example 6 : Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList */

package manaswi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Assignment_46_Program_6
 {

	void removeSecondLargestNumber(Set<Integer> s)
	{
		System.out.println("Integer list in ascending order- " + s);
		ArrayList<Integer> list = new ArrayList<Integer>(s);
		list.remove(list.size()-2);
		System.out.println("After removing the second largest number from list " + list);
	}

	public static void main(String[] args)
	{
		Integer[] input = {5, 65, 78, 24, 16, 67, 95, 57};
		Set<Integer> s = new TreeSet<Integer>(Arrays.asList(input));
		Assignment_46_Program_6 p6 = new Assignment_46_Program_6();
		p6.removeSecondLargestNumber(s);
	}
}