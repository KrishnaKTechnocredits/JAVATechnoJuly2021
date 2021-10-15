package monali.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to remove duplicate from ArrayList (without using set).
public class Program3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 10, 50, 60, 70, 50));
		removeDuplicatesFromArrayList(list);
	}

	static void removeDuplicatesFromArrayList(ArrayList<Integer> list) {
		System.out.println(list);
		for (int index = 0; index < list.size(); index++) {
			if (list.indexOf(list.get(index)) != list.lastIndexOf(list.get(index))) {
				if (list.indexOf(list.get(index)) != index)
					list.remove(list.get(index));
			}
		}
		System.out.println("After removing duplicates from list : " + list);
		/*
		 * Collections.sort(list); //for practice System.out.println(list);
		 */
	}
}
