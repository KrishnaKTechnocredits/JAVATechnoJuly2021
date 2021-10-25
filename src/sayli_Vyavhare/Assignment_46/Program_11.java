/*
 Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9] */
package sayli_Vyavhare.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_11 {
	static void missingNumberInRange(Integer[] input) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int index = 1; index <= 10; index++) {
			if (!al.contains(index)) {
				output.add(index);
			}

		}
		System.out.println(" missing number in a range [1-10] :" + output);

	}

	public static void main(String[] args) {
		Integer[] input = { 1, 6, 2, 5, 7, 6, 3, 10 };
		missingNumberInRange(input);

	}

}
