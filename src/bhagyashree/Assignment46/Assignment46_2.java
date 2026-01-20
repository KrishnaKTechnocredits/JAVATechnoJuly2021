/*
 * Write a program to find given number is duplicate in arrayList.
 */
package bhagyashree.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_2 {

	void findDuplicateElement(ArrayList<Integer> al, int num) {
		if (al.indexOf(num) != al.lastIndexOf(num)) {
			System.out.println(num + " :is duplicate");
		} else {
			System.out.println(num + " :is not duplicate");
		}
	}

	public static void main(String[] args) {
		Assignment46_2 ass46 = new Assignment46_2();
		Integer[] arr = { 2, 2, 3, 8, 9, 20, 36, 45 };
		ArrayList<Integer> all = new ArrayList<Integer>(Arrays.asList(arr));
		ass46.findDuplicateElement(all, 2);
		ass46.findDuplicateElement(all, 45);
	}
}
