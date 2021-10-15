package arti_G_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 17:
Write a program to add element at particular index of ArrayList?*/
public class AddElementOnParticularIndex {

	static void addElementOnParticularIndex(ArrayList<Integer> list, int index, int element) {
		list.add(index, element);
		System.out.println(list);
	}

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(list);
		addElementOnParticularIndex(list, 2, 45);
	}

}
