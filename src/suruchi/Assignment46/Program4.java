/*Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/

package suruchi.Assignment46;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Program4 {

	void removeDuplicatesUsingSet(ArrayList<Integer> input) {
		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>(input);
		System.out.println("List after removing the duplicate values : " +list);
	}
	
	public static void main(String[] args) {
		Program4 program4 = new Program4();
		
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(56);
		inputArray.add(33);
		System.out.println("List before removing duplicates : " +inputArray);
		program4.removeDuplicatesUsingSet(inputArray);
	}
}