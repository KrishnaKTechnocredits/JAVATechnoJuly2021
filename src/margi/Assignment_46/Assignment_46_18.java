package margi.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method)

public class Assignment_46_18 {

	void removeElement(ArrayList<Integer> list) {
		System.out.println("Before removing: " + list);
		list.remove(new Integer(17));
		System.out.println("After removing at index 3: " + list);
	}

	public static void main(String[] args) {
		Assignment_46_18 assignment_46_18 = new Assignment_46_18();
		Integer[] num = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(num));
		assignment_46_18.removeElement(list);
	}
}
