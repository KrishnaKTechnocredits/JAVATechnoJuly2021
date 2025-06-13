package rushikesh.assign46;

import java.util.Arrays;
import java.util.LinkedList;

public class Assign46_8 {
	static LinkedList isRemoveDuplicateAndNegativeNumbers(LinkedList<Integer> input) {
		LinkedList<Integer> output = new LinkedList<Integer>();
		for (int num : input) {
			if (!(output.contains(num)) && num < 0)
				output.add(num);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] input = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(input));
		System.out.println(linkedList);
		System.out.println(isRemoveDuplicateAndNegativeNumbers(linkedList));
	}
}
