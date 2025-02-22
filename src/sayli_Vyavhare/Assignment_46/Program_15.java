/*Example 15:

Write a program to convert Array to List.*/
package sayli_Vyavhare.Assignment_46;

import java.util.ArrayList;
import java.util.List;

public class Program_15 {

	public static void main(String[] args) {

		Integer[] input = { 25, 8, 33, 67, 89 };
		List<Integer> output = new ArrayList<Integer>();
		for (Integer i : input) {
			output.add(i);

		}
		System.out.println("List is:" + output);
	}

}
