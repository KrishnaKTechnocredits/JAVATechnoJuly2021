/*Example 8: 
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList
*/

package vivek.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Assignment46_8 {

	static LinkedList<Integer> returnDistinctNegativeNumbers(Integer[] arr) {
		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>(Arrays.asList(arr));
		ArrayList<Integer> ls1 = new ArrayList<Integer>(ls);
		LinkedList<Integer> ls2 = new LinkedList<Integer>();
		for (int index = 0; index < ls1.size(); index++) {
			if (ls1.get(index) < 0)
				ls2.add(ls1.get(index));
		}
		return ls2;
	}

	public static void main(String[] args) {
		Integer[] input = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		System.out.println(Assignment46_8.returnDistinctNegativeNumbers(input));
	}
}
