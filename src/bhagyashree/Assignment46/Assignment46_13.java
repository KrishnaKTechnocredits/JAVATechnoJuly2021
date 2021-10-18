/*
 * Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.
 */
package bhagyashree.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Assignment46_13 {

	static void traverseArrayListUsingLoop(ArrayList<Integer> list) {
		for (int num : list) {
			System.out.print(num + " ");
		}
	}

	static void traverseArrayListUsingIterator(ArrayList<Integer> list) {
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		traverseArrayListUsingLoop(list);
		traverseArrayListUsingIterator(list);
	}
}
