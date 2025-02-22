/*Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/

package sayli_Vyavhare.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program_6 {
	static void secondLargestNumber(Integer[] input) {
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(input));
		System.out.println("Input is:" + set);
		ArrayList<Integer> arr = new ArrayList<Integer>(set);

		int output=arr.get(arr.size() - 2);
		System.out.println("second largest number from Given Array: " + output);
	}

	public static void main(String[] args) {
		Integer[] input1 = { 5, 66, 98, 7, 10};
		secondLargestNumber(input1);

	}

}
