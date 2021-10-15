package monali.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/

public class Program13 {

	void iterateArrayList(Integer[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		// Enhanced for loop
		for (Integer num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
		// through iterator
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 90, 20, 30, 40, 50 };
		Program13 p13 = new Program13();
		p13.iterateArrayList(arr);

	}
}
