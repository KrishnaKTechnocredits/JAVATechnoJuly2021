//Write a program to add element at particular index of ArrayList?

package astha.Assignment46;

import java.util.ArrayList;

public class Assignment17 {

	void addElementToArrayList(ArrayList<Integer> input,int index, int element) {
		try {
			input.add(index, element);
			System.out.println("List after adding the element: " +input);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Please enter the index within valid range");
		}
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(56);
		inputArray.add(33);
		System.out.println("List before adding the element: " +inputArray);
		assignment17.addElementToArrayList(inputArray, 3, 9);
		assignment17.addElementToArrayList(inputArray, 10,19);
	}
}
