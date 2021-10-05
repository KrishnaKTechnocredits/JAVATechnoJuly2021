package margi.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to remove duplicate from ArrayList (without using set).

public class Assignment_46_3 {

	ArrayList<Integer> removeDuplicates(ArrayList<Integer> input) {
		ArrayList<Integer> output = new ArrayList<>();
		for (int num : input) {
			if (!output.contains(num))
				output.add(num);
		}
		return output;
	}

	void processArrayList(Integer[] num) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(num));
		System.out.println("Before removing duplicates" + numbers);
		System.out.println("After removing duplicates" + removeDuplicates(numbers));
	}

	public static void main(String[] args) {
		Assignment_46_3 assignment_46_3 = new Assignment_46_3();
		Integer[] numbers = { 6, 15, 23, 51, 48, 51, 23, 70 };
		assignment_46_3.processArrayList(numbers);
	}
}
