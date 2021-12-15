/*Example 1 :
Write a program to find given number is present in the arrayList or not.*/

package sayli_Vyavhare.Assignment_46;
import java.util.ArrayList;
import java.util.Arrays;

public class Program_1 {
	static void numPresent(int num, Integer[] input) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(input));

		if (arr.contains(num)) {
			System.out.println(num + " is present");
		} else {
			System.out.println(num + " is not present");

		}
	}

	public static void main(String[] args) {
		Integer[] input = { 5, 66, 98, 7, 10 };
		numPresent(5, input);

	}

}

