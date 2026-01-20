//Write a program to convert Array to List.

package suruchi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program15 {

	public static void main(String[] args) {
		Program15 program15 = new Program15();

		Integer[] input = { 10, 1, 4, 6, 3, 5, 3, 2, 6, 4 };

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(input));

		System.out.println("Array converted to list is displayed as: " + list);
	}
}