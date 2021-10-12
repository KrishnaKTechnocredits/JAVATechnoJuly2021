/* Programming Questions - Collections : 4th Oct'2021
 Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
 */

package parthav.parthavD_Assignment46;

import java.util.LinkedHashSet;

public class Example8 {

	LinkedHashSet<Integer> printNegativeNumbers(int[] arr) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int num : arr) {
			if (num < 0)
				set.add(num);
		}

		return set;

	}

	public static void main(String[] args) {
		Example8 newObject = new Example8();
		int[] arr = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		System.out.println(newObject.printNegativeNumbers(arr));

	}

}
