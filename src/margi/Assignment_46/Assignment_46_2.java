package margi.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to find given number is duplicate in arrayList

public class Assignment_46_2 {

	boolean isDuplicate(ArrayList<Integer> numbers, int num) {
		boolean flag = true;
		if (numbers.indexOf(num) == numbers.lastIndexOf(num)) {
			flag = false;
		}
		return flag;
	}

	void processArrayList(Integer[] num) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(num));
		int number = 51;
		boolean flag = isDuplicate(numbers, number);
		System.out.println(numbers);
		if (flag)
			System.out.println(number + " is duplicate in ArrayList");
		else
			System.out.println(number + " is not duplicate in ArrayList");
	}

	public static void main(String[] args) {
		Assignment_46_2 assignment_46_2 = new Assignment_46_2();
		Integer[] numbers = { 6, 15, 23, 51, 48, 51, 69, 70 };
		assignment_46_2.processArrayList(numbers);
	}
}
