/*
 * Write a program to add element at particular index of ArrayList?
 */
package bhagyashree.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_16 {
	static void addElementParticularIndexArrayList(ArrayList<Integer> list, int index, int element) {
		list.add(index, element);
		System.out.println(list);
	}

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(list);
		addElementParticularIndexArrayList(list, 1, 121);

	}

}
