package suchita;
//Assignment 46_6

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Assignment46_6 {

	//Find the second largest number from Given Array.
	public static void main(String[] args) {
		
		int num[] = { 12, 35, 43, 21, 90, 99, 87, 56 };
		System.out.println("\n Input array " + Arrays.toString(num));
		TreeSet<Integer> input = new TreeSet<Integer>();
		for (int index = 0; index < num.length; index++)
			input.add(num[index]);

		ArrayList<Integer> output = new ArrayList<Integer>(input);

		System.out.println(" Second largest number :: " + (output.get(output.size() - 2)));
	}
}