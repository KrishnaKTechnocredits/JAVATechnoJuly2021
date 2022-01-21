/*Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/

package suruchi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Program8 {

	LinkedList<Integer> getNegativeNumber(Integer[] input) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		LinkedList<Integer> negativeNumList = new LinkedList<Integer>();
		for (int index = 0; index < list.size(); index++) {
			int num = list.get(index);
			if (num < 0)
				if (index == list.indexOf(num))
					negativeNumList.add(num);
		}
		return negativeNumList;
	}

	public static void main(String[] args) {
		Program8 program8 = new Program8();

		Integer[] input = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };

		System.out.println("Array is: " + Arrays.toString(input));
		System.out.println(
				"List of negative numbers from array without duplicates : " + program8.getNegativeNumber(input));
	}
}