/*Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/
package ritabrata_Assignment_46;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Assignment_46_4 {
	void removeDupsUsingSet(ArrayList<Integer> input) {
		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>(input);
		System.out.println("List after removing the duplicate values : " +list);
	}

	public static void main(String[] args) {
		Assignment_46_4 arrSet = new Assignment_46_4();
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(20);
		inputArray.add(40);
		inputArray.add(60);
		inputArray.add(60);
		inputArray.add(50);
		System.out.println("List before removing duplicates : " +inputArray);
		arrSet.removeDupsUsingSet(inputArray);
	}

}
