package siddharth;

import java.util.ArrayList;

public class Assignment_44 {
	static void maxNumber(ArrayList<Integer> al) {
		int Max = al.get(0);
		for (int index = 1; index < al.size(); index++) {
			if (al.get(index) > Max) {
				Max = al.get(index);
			}
		}
		System.out.println("Maximum number in ArrayList is: " + Max);
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);
		System.out.println(al);
		maxNumber(al);
	}

}
