//Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).

package suruchi.Assignment46;

import java.util.ArrayList;

public class Program18 {

	void removeElementFromArrayList(ArrayList<Integer> input, Integer element) {
		if (input.contains(element)) {
			input.remove(element);
			System.out.println("List after removing the element : " + input);
		} else
			System.out.println("Element is not present in the arraylist");
	}

	public static void main(String[] args) {
		Program18 program18 = new Program18();

		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(25);

		System.out.println("List displayed as: " + inputArray);
		program18.removeElementFromArrayList(inputArray, 33);
	}
}