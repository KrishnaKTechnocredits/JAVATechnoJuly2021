package neha.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Example 15:
Write a program to convert Array to List.*/
public class Program14 {
	void displayListAfterConversionFromArray() {
		// Approach 1
		int[] num = new int[] { 1, 2, 3 };
		List<Integer> numList = new ArrayList<Integer>(Arrays.stream(num).boxed().collect(Collectors.toList()));
		System.out.println(numList);
		// Approach 2
		Integer[] numbers = { 4, 5, 6 };
		List<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(numbers));
		System.out.println(numbersList);
		// Approach 3
		Integer[] nums = { 7, 8, 9 };
		List<Integer> list = new ArrayList<Integer>();
		for (int no : nums) {
			list.add(no); // autoboxing for int
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		Program14 program14 = new Program14();
		program14.displayListAfterConversionFromArray();
	}
}
