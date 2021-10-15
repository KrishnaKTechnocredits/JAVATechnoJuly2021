/*Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/

package vivek.Assignment46;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Assignment46_12 {

	static void removeAllZeroes(Integer[] arr) {
		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>(Arrays.asList(arr));
		ls.remove(new Integer(0));
		System.out.println(ls);
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };
		Assignment46_12.removeAllZeroes(input);
	}
}
