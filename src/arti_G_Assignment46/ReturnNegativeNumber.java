package arti_G_Assignment46;

import java.util.Arrays;
import java.util.LinkedList;

/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/
public class ReturnNegativeNumber {

	static LinkedList getNegativeNumber(LinkedList<Integer> input) {
		LinkedList<Integer> list = new LinkedList();
		for (int num : input) {
			if (!(list.contains(num)) && num < 0) {
				list.add(num);
			}
		}
		return list;

	}

	public static void main(String[] args) {
		Integer[] input = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(input));
		System.out.println(list);
		System.out.println(getNegativeNumber(list));
	}

}
