package neha.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).*/
public class Program17 {
	void removeObjectFromIntegerArrayList(Integer numObj, ArrayList<Integer> al) {
		while (al.contains(numObj)) {
			al.remove(numObj);
		}
		System.out.println(al);
	}

	public static void main(String[] args) {
		Integer[] num = { 26, 23, 3, 13, 9, 2 };
		// Integer objectToRemove = new Integer(num[num.length - 4]);
		int number = num[num.length - 3];
		Integer objectToRemove = new Integer(number);
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(num));
		System.out.println("Array List " + al + " after removing Integer object " + number + " is ");
		new Program17().removeObjectFromIntegerArrayList(objectToRemove, al);

	}
}
