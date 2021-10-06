//Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).

package astha.Assignment46;

import java.util.ArrayList;

public class Assignment18 {

	void removeElementFromArrayList(ArrayList<Integer> input, Integer element) {
		if(input.contains(element)) {
			input.remove(element);
			System.out.println("List after removing the element : " +input);
		}
			else
				System.out.println("Element is not present in the arraylist");
	}
	
	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(25);		
		assignment18.removeElementFromArrayList(inputArray, 33);
	}
	
}
