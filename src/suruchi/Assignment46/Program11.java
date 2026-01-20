/*Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

Hint : Method Parameter should be ArrayList, return type should be ArrayList.*/

package suruchi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program11 {

	ArrayList<Integer> getMissingNumber(ArrayList<Integer> list) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 1; index <= 10; index++) {
			if (!list.contains(index))
				output.add(index);
		}
		return output;
	}

	public static void main(String[] args) {
		Program11 program11 = new Program11();

		Integer[] input = { 1, 6, 2, 5, 7, 6, 3, 10 };

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));

		System.out.println("Arraylist is: " + list);
		System.out.println("Missing numbers from 1-10 in arraylist are: " + program11.getMissingNumber(list));
	}
}