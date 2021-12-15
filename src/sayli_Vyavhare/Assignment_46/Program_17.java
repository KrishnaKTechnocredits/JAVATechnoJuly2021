/*Example 17:
Write a program to add element at particular index of ArrayList?*/
package sayli_Vyavhare.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_17 {
	static void addElement() {
		Integer[] input = { 55, 4, 57, 84, 2 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));

		System.out.println("Input list is:" + list);
		list.add(2, 687);
		System.out.println("after adding element: " + list);

	}

	public static void main(String[] args) {
		addElement();
	}

}
