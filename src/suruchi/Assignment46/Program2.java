// Write a program to find given number is duplicate in arrayList.

package suruchi.Assignment46;

import java.util.ArrayList;

public class Program2 {

	void isElementDuplicate(ArrayList<Integer> list1, int num) {
		if (list1.indexOf(num) != list1.lastIndexOf(num))
			System.out.println(num + " is duplicate in the list");
		else
			System.out.println(num + " is unique in the list");
	}
	
	public static void main(String[] args) {
		Program2 program2 = new Program2();
		
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(56);
		inputArray.add(33);
		program2.isElementDuplicate(inputArray, 56);
		program2.isElementDuplicate(inputArray, 10);
	}
}