/*Example 2 :
Write a program to find given number is duplicate in arrayList.*/
package sayli_Vyavhare.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_2 {
	static void numDuplicate(Integer[] input, int num) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(input));
		if (arr.indexOf(num) != arr.lastIndexOf(num)) {
			System.out.println(num + " is duplicate");

		} else
			System.out.println(num + " is not duplicate");
	}

	public static void main(String[] args) {
		Integer[] input = { 5, 66, 98, 7, 10, 5 };
		numDuplicate(input, 5);
		numDuplicate(input, 10);

	}

}
