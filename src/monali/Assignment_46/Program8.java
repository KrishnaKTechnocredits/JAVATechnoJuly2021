package monali.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList
*/
public class Program8 {

	void getNegativeNumbers(Integer arr[]) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> output = new LinkedList<Integer>();
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index) < 0) {
				if (!output.contains(list.get(index)))
					output.add(list.get(index));
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		Program8 p8 = new Program8();
		p8.getNegativeNumbers(arr);

	}
}
