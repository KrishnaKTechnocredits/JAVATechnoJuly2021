package margi.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to find given number is present in the arrayList or not

public class Assignment_46_1 {

	boolean isPresent(ArrayList<Integer> numbers, int num) {
		boolean flag = true;
		if (!numbers.contains(num))
			flag = false;
		return flag;
	}

	void processArrayList(Integer[] num) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(num));
		int number = 23;
		boolean flag = isPresent(numbers, number);
		System.out.println(numbers);
		if (flag)
			System.out.println(number + " is present in ArrayList");
		else
			System.out.println(number + " is not present in ArrayList");
	}

	public static void main(String[] args) {
		Assignment_46_1 assignment_46_1 = new Assignment_46_1();
		Integer[] numbers = { 6, 15, 23, 37, 48, 51, 69, 70 };
		assignment_46_1.processArrayList(numbers);
	}
}
