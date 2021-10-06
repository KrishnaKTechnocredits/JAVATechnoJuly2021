//Write a program to convert Array to List.

package astha.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment15 {

	void convertArrayToArrayList(Integer[] input) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(list);
	}

	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		Integer[] inputArr = { 10, 20, 30, 55, 66, 77, 66, 20, 100, 98 };
		assignment15.convertArrayToArrayList(inputArr);
	}
}
