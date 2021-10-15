/*Example 2 :
Write a program to find given number is duplicate in arrayList.*/

package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Example2 {
	public static void main(String[] args) {
		Integer[] arr = { 11, 12, 13, 44, 55 };
		Integer num = 55;
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		new Example2().hasDuplicate(al, num);
	}

	private void hasDuplicate(ArrayList<Integer> al, Integer num) {
		TreeSet<Integer> ts = new TreeSet<Integer>(al);
		for (Integer a : al) {
			if (!ts.add(num)) {
				System.out.println(num + " is duplicate number");
				break;
			}

		}
	}
}
