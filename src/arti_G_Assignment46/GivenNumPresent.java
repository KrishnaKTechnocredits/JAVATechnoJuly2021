package arti_G_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 1 : 
Write a program to find given number is present in the arrayList or not.*/
public class GivenNumPresent {

	static void findNumberPresentOrNot(ArrayList<Integer> input, int number) {
		if (input.contains(number))
			System.out.println(number + " is present in the ArrayList");
		else
			System.out.println(number + " is not present in ArrayList");
	}

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 55, 45, 35, 25));
		findNumberPresentOrNot(input, 60);
		findNumberPresentOrNot(input, 30);

	}
}
