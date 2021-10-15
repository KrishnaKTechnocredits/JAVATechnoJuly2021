/*Example 17:
Write a program to add element at particular index of ArrayList?
*/

package ritabrata_Assignment_46;

import java.util.ArrayList;

public class Assignment_46_17 {
	
	void addElemntToList(ArrayList<Integer> input,int index, int element) {
		try {
			input.add(index, element);
			System.out.println("List after adding the element is: " +input);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Please enter the index within valid range ");
		}
	}

	public static void main(String[] args) {
		Assignment_46_17 addElement = new Assignment_46_17();
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(56);
		inputArray.add(33);
		System.out.println("List before adding the element using Array List: " +inputArray);
		addElement.addElemntToList(inputArray, 3, 9);
		addElement.addElemntToList(inputArray, 10,19);
	}

}
