package aniket;

import java.util.ArrayList;

/*1 : Write a program to find given number is present in the arrayList or not. */
public class Assignment_46_1 {

	void isPresent(ArrayList<Integer> listnumbers, int number) {

		if (listnumbers.contains(number)) {
			System.out.println(number + " is present in arraylist");
		} else {
			System.out.println(number + " not present in arraylist");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(100);
		al.add(14);
		al.add(85);
		Assignment_46_1 assignment_46 = new Assignment_46_1();
		assignment_46.isPresent(al, 10);

	}
}
