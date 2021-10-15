/*Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList
*/

package vivek.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Assignment46_6 {

	static void find2ndLargestNumber(Integer[] arr) {
		TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(arr));
		ArrayList<Integer> al = new ArrayList<Integer>(ts);
		System.out.println("The second largest number is " + al.get(al.size() - 2));
	}

	public static void main(String[] args) {
		Integer[] arr = { 2, 2, 3, 8, 3, 5, 4, 6, 4, 7 };
		Assignment46_6.find2ndLargestNumber(arr);
	}
}
