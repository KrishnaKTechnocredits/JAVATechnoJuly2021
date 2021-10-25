/*Example 16:
Write a program to traverse(or iterate) HashSet.*/
package sayli_Vyavhare.Assignment_46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program_16 {

	static void traversingHasSetUsingIterator(Integer[] input) {

		Set<Integer> set = new HashSet<Integer>(Arrays.asList(input));
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

	public static void main(String[] args) {
		Integer[] input = { 55, 4, 57, 84, 2 };

		traversingHasSetUsingIterator(input);
	}

}
