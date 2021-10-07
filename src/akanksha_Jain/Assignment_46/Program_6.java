/* Assignment 46 - Collections : 4th Oct'2021
Example 6 : Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList */

package akanksha_Jain.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program_6 {
	
	void removeSecondLargestNumber(Set<Integer> s) {
		System.out.println("Integer list in ascending order- " + s);
		ArrayList<Integer> list = new ArrayList<Integer>(s);
		list.remove(list.size()-2);
		System.out.println("After removing the second largest number from list " + list);
	}

	public static void main(String[] args) {
		Integer[] input = {3, 45, 67, 21, 17, 76, 98, 54};
		Set<Integer> s = new TreeSet<Integer>(Arrays.asList(input));
		Program_6 p6 = new Program_6();
		p6.removeSecondLargestNumber(s);
	}
}