//Write a program to add element at particular index of ArrayList?

package suruchi.Assignment46;

import java.util.ArrayList;

public class Program17 {

	void addElementToArrayList(ArrayList<Integer> input, int index, int element) {
		try {
			input.add(index, element);
			System.out.println("List after adding the element: " + input);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Please enter the index within valid range");
		}
	}

	public static void main(String[] args) {
		Program17 program17 = new Program17();

		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(56);
		inputArray.add(33);
		System.out.println("List before adding the element: " + inputArray);
		program17.addElementToArrayList(inputArray, 3, 9);
		program17.addElementToArrayList(inputArray, 10, 19);
	}
}