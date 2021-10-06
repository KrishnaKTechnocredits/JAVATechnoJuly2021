package margi.Assignment_46;

import java.util.LinkedList;

/*Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/

public class Assignment_46_8 {

	LinkedList<Integer> getNegativeNumbers(Integer[] arr) {
		LinkedList<Integer> numbers = new LinkedList<>();
		for (int num : arr) {
			if (num < 0 && !numbers.contains(num))
				numbers.add(num);
		}
		return numbers;
	}

	public static void main(String[] args) {
		Assignment_46_8 assignment_46_8 = new Assignment_46_8();
		Integer[] num = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		System.out.println(assignment_46_8.getNegativeNumbers(num));
	}
}
