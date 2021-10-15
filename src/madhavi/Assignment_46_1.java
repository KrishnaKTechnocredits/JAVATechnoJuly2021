package madhavi;

import java.util.ArrayList;

//Write a program to find given number is present in the arrayList or not.

public class Assignment_46_1 {
	public static void main(String[] args) {
		System.out.println("To check number is present in the arrayList or not");
		System.out.println("--------------------------------------------------");
		ArrayList<Integer> intlist = new ArrayList<>();
		intlist.add(1);
		intlist.add(10);
		intlist.add(2);
		intlist.add(20);
		System.out.println("An initial list of elements: " + intlist);
		// using contains method()
		boolean ans = intlist.contains(20);
		boolean ans1 = intlist.contains(9);
		if (ans)
			System.out.println("The list contains 20");

		else
			System.out.println("The list does not contains 20");

		if (ans1)
			System.out.println("9 exists in the ArrayList");

		else
			System.out.println("9 does not exist in the ArrayList");

	}
}
