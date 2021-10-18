/*
 * Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList

 */
package bhagyashree.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment46_6 {

	static void removeSecondLargest(Integer[] input) {
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(input));
		System.out.println(set);
		List<Integer> list = new ArrayList(set);
		list.remove(list.size() - 2);
		System.out.println(list);
	}

	public static void main(String[] args) {
		Integer[] input = { 1, 6, 2, 9, 3, 2, 4, 1, 9 };
		removeSecondLargest(input);
	}

}
