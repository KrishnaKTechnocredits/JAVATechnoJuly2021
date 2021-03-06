package arti_G_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).*/
public class RemoveObjectFromArrayList {

	static void removeObjectFromArrayList(ArrayList<Integer> list, Integer element) {
		list.remove(element);
		System.out.println(list);
	}

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(input));
		System.out.println(list);
		removeObjectFromArrayList(list, new Integer(23));
	}

}
