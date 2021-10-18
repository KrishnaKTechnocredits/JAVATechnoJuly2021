package dattaraj;

import java.util.ArrayList;

public class Assignment46_P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P17 pgm17 = new Assignment46_P17();
		
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(56);
		inputArray.add(33);
		System.out.println("List before adding the element: " +inputArray);
		pgm17.addElementToArrayList(inputArray, 3, 9);
		pgm17.addElementToArrayList(inputArray, 10,19);
	}

	private void addElementToArrayList(ArrayList<Integer> inputArray, int i, int j) {
		// TODO Auto-generated method stub
		try {
			inputArray.add(i, j);
			System.out.println("List after adding the element: " +inputArray);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Please enter the index within valid range");
		}
	}

}
