package margi.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/*Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/

public class Assignment_46_4 {

	LinkedHashSet<Integer> removeDuplicates(ArrayList<Integer> input) {
		LinkedHashSet<Integer> output = new LinkedHashSet<>(input);
		return output;
	}

	void processArrayList(Integer[] num) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(num));
		System.out.println("Before removing duplicates" + numbers);
		System.out.println("After removing duplicates" + removeDuplicates(numbers));
	}

	public static void main(String[] args) {
		Assignment_46_4 assignment_46_4 = new Assignment_46_4();
		Integer[] numbers = { 6, 15, 23, 51, 48, 51, 23, 70 };
		assignment_46_4.processArrayList(numbers);
	}
}
