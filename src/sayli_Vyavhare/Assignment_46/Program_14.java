/*Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/
package sayli_Vyavhare.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Program_14 {

	static void iterateArraylist(Integer[] input) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println("Traversing  using loop:");
		for (int num : list) {

			System.out.print(num + " ");

		}

		System.out.println("\n" + "Traversing  using iterator:");
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

	public static void main(String[] args) {
		Integer[] input = { 55, 4, 57, 84, 2 };

		iterateArraylist(input);

	}

}
