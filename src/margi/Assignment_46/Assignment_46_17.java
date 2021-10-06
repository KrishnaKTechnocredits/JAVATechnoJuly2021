package margi.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to add element at particular index of ArrayList

public class Assignment_46_17 {

	void getAddedElements(ArrayList<Integer> list) {
		System.out.println("Before adding: " + list);
		list.add(3, 100);
		System.out.println("After adding at index 3: " + list);
	}

	public static void main(String[] args) {
		Assignment_46_17 assignment_46_17 = new Assignment_46_17();
		Integer[] num = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(num));
		assignment_46_17.getAddedElements(list);
	}
}
