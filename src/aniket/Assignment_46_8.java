package aniket;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*Return all negative numbers (remove duplicates if any and maintain insertion order) from given array. 
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 Ouput : [-11, -19, -99] Hint :
parameter - Array, return type - LinkedList*/
public class Assignment_46_8 {

	Set<Integer> getNegativeNumbers(Integer[] input) {
		Set<Integer> list = new LinkedHashSet<Integer>(Arrays.asList(input));
		Set<Integer> output = new LinkedHashSet<Integer>();
		for (int num : list) {
			if (num < 0) {
				output.add(num);
			}

		}

		return output;

	}

	public static void main(String[] args) {

		Integer[] input = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		System.out.println("The output array is : " + new Assignment_46_8().getNegativeNumbers(input));
	}
}