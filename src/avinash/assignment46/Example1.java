package avinash.assignment46;

/*Write a program to find given number is present in the arrayList or not.*/
import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {

	static void findNumberIsPresentOrNot(ArrayList<Integer> input, int number) {
		if (input.contains(number))
			System.out.println(number + " : is present in the ArrayList");
		else
			System.out.println(number + ": is not present in the ArrayList");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = { 1, 6, 2, 9, 3, 0, 2, 4 };
		ArrayList<Integer> arraysList = new ArrayList<Integer>(Arrays.asList(input));
		findNumberIsPresentOrNot(arraysList,5);
		findNumberIsPresentOrNot(arraysList,9);
	}

}
