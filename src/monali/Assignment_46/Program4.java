package monali.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.
*/
public class Program4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 10, 50, 60, 70, 50));
		removeDuplicatesWithSet(list);
	}

	static void removeDuplicatesWithSet(ArrayList<Integer> list) {
		Set<Integer> linkSet = new LinkedHashSet<Integer>(list);

		System.out.println("Remove duplicates and order remains same : " + linkSet);
	}
}
