/*Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/

package astha.Assignment46;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Assignment4 {

	void removeDuplicatesUsingSet(ArrayList<Integer> input) {
		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>(input);
		System.out.println("List after removing the duplicate values : " +list);
	}
	
	public static void main(String[] args) {
		Assignment4 assignment4 = new Assignment4();
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(56);
		inputArray.add(33);
		System.out.println("List before removing duplicates : " +inputArray);
		assignment4.removeDuplicatesUsingSet(inputArray);
	}
}
