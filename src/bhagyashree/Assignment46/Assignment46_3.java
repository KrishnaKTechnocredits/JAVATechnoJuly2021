/*
 * Write a program to remove duplicate from ArrayList (without using set).
 */
package bhagyashree.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_3 {

	void removeDuplivateElements(ArrayList<Integer> all) {
		ArrayList<Integer> output = new ArrayList<>();
		for (int num : all) {
			if (!output.contains(num)) {
				output.add(num);
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {

		Assignment46_3 ass46 = new Assignment46_3();
		Integer[] input = { 5, 5, 9, 8, 8, 17, 13, 25, 69 };
		ArrayList<Integer> all = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(all);
		ass46.removeDuplivateElements(all);
	}

}
