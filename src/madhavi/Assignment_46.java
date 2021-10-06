package madhavi;

import java.util.ArrayList;

public class Assignment_46 {
	public static void main(String[] args) {
		// Assignment_46 assignment_46 = new Assignment_46();
		System.out.println("To remove Object from ArrayList of Integer (using remove(Object obj) method");
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(100);
		intList.add(200);
		intList.add(300);
		intList.add(400);
		intList.add(200);
		System.out.println("An initial list of elements: " + intList);
		intList.remove(new Integer(200));
		intList.remove(new Integer(100));
		System.out.println("After invoking remove(object) method: " + intList);
	}
}