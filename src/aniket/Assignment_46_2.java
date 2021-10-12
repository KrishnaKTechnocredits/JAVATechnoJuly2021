package aniket;

//Write a program to find given number is duplicate in arrayList.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment_46_2 {

	void isDuplicate(Integer[] input) {
		List<Integer> listNumbers = new ArrayList<Integer>(Arrays.asList(input));
		for (int index = 0; index < listNumbers.size(); index++) {
			int num = listNumbers.get(index);
			if (listNumbers.indexOf(num) != listNumbers.lastIndexOf(num)) {
				if (index == listNumbers.indexOf(num)) {
					System.out.println(num + " is a duplicate number ");
				}

			}
		}
	}

	/*
	 * void isDuplicate1(Integer[] input, int num) {
	 * 
	 * ArrayList<Integer> listNumbers = new ArrayList<Integer>(Arrays.asList(num));
	 * if (listNumbers.contains(num)) {
	 * if(listNumbers.indexOf(num)!=listNumbers.lastIndexOf(num)) {
	 * System.out.println(num + " is duplicate number"); } } }
	 */

	public static void main(String[] args) {
		Integer[] input = { 20, 10, 77, 55, 456, 365, 12, 20, 10, 55, 90 };
		Assignment_46_2 assignment_46_2 = new Assignment_46_2();
		 assignment_46_2.isDuplicate(input);
		//assignment_46_2.isDuplicate1(input, 20);
	}
}
