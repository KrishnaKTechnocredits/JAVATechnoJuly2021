/*
 *Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Output : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList
 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Program8 {

	LinkedList<Integer> findNegative(int num[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int index : num)
			if (index < 0 && !list.contains(index))
				list.add(index);

		return list;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program8 obj = new Program8();
		int num[] = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		System.out.println("Input list " + Arrays.toString(num));
		System.out.println(
				"The output list with non-duplicate negative numbers in inserted order is " + obj.findNegative(num));

	}

}
