package avinash.assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Write a program to find given number is duplicate in arrayList.*/
public class Example2 {

	static void givenNumberIsDuplicateOrNot(ArrayList<Integer> input, int number) {
		if (input.indexOf(number) != input.lastIndexOf(number))
			System.out.println(number + ": given number is duplicate");
		else
			System.out.println(number + ": given number is not duplicate");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = { 1, 6, 2, 9, 3, 0, 2, 4 };
		ArrayList<Integer> arraysList = new ArrayList<Integer>(Arrays.asList(input));
		givenNumberIsDuplicateOrNot(arraysList,2);
		givenNumberIsDuplicateOrNot(arraysList,9);

	}

}
