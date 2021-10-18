/*
 * Example 10:
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

 */
package bhagyashree.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_10 {

	static ArrayList<Integer> returnMissingNumber(ArrayList<Integer> arrayList) {
		ArrayList<Integer> output = new ArrayList();
		for (int index = 1; index <= 10; index++) {
			if (!arrayList.contains(index))
				output.add(index);
		}

		return output;
	}

	public static void main(String[] args) {
		Integer[] input = { 1, 6, 2, 5, 7, 6, 3, 10 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(returnMissingNumber(arrayList));
	}

}
