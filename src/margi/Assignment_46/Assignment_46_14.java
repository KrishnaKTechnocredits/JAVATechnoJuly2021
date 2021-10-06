package margi.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator

public class Assignment_46_14 {

	void getIterate(ArrayList<Integer> list) {
		System.out.println("Using Enhanced for loop:");
		for (int num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Using Iterator:");
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

	public static void main(String[] args) {
		Assignment_46_14 assignment_46_14 = new Assignment_46_14();
		Integer[] num = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(num));
		assignment_46_14.getIterate(list);
	}
}
