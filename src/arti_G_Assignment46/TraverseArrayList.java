package arti_G_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/
public class TraverseArrayList {

	static void traverseArrayListUsingEnhanceForLoop(ArrayList<Integer> input) {
		for (int num : input) {
			System.out.println(num + " ");
		}
	}

	static void traverseArrayListUsingIteratorForLoop(ArrayList<Integer> list) {
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		traverseArrayListUsingEnhanceForLoop(list);
		System.out.println("************************");
		traverseArrayListUsingIteratorForLoop(list);

	}

}
