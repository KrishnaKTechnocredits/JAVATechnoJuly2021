package aniket;

import java.util.ArrayList;

public class Assignment_44 {
	int getMaxNumber(ArrayList<Integer> arr) {
		int maxNumber = arr.get(0);

		for (int index : arr) {
			if (index > maxNumber)
				maxNumber = index;

		}
		return maxNumber;
	}

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(74);
		System.out.println("Maximum number is : " + new Assignment_44().getMaxNumber(al));

	}
}
