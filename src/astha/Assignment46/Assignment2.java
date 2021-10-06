//Write a program to find given number is duplicate in arrayList. 

package astha.Assignment46;

import java.util.ArrayList;

public class Assignment2 {

	void isElementDuplicate(ArrayList<Integer> list1, int num) {
		if (list1.indexOf(num) != list1.lastIndexOf(num))
			System.out.println(num + " is duplicate in the list");
		else
			System.out.println(num + " is unique in the list");
	}

	public static void main(String[] args) {
		Assignment2 assignment2 = new Assignment2();
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(56);
		inputArray.add(33);
		assignment2.isElementDuplicate(inputArray, 56);
		assignment2.isElementDuplicate(inputArray, 10);
	}
}
