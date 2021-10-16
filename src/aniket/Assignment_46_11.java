package aniket;

import java.util.ArrayList;
import java.util.Arrays;


/*Remove all zeros from given ArrayList.
input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/
public class Assignment_46_11 {

	ArrayList<Integer> removeAllZero(Integer[] input) {
		ArrayList<Integer> listNumbers = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int num : listNumbers) {
			if (num == 0)
				output.add(num);

		}
		listNumbers.removeAll(output);
		return listNumbers;

	}

	public static void main(String[] args) {

		Integer[] input = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };
		System.out.println("After removing all zeros : " + new Assignment_46_11().removeAllZero(input));
	}
}
