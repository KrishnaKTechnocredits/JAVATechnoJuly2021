/*Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).*/
package sayli_Vyavhare.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_18 {

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println("Before removal of element:" + list);

		list.remove(new Integer(12));
		System.out.println("After removal of element:" + list);
	}
}
