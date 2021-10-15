/*
Example 15:
Write a program to convert Array to List.
*/


package ritabrata_Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_46_15 {
	void convertToArrayList(Integer[] input) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println("The input is: "+list);
	}

	public static void main(String[] args) {
		Assignment_46_15 convert = new Assignment_46_15();
		Integer[] inputArr = { 10, 20, 30, 55, 66, 77, 66, 20, 100, 98 };
		convert.convertToArrayList(inputArr);
	}

}
