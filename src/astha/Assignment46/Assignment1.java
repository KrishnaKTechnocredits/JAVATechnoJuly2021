//Write a program to find given number is present in the arrayList or not.

package astha.Assignment46;

import java.util.ArrayList;

public class Assignment1 {

	void isNumberPresent(ArrayList<Integer> input, int num) {
		if(input.contains(num))
			System.out.println(num + " is present in the arraylist");
		else
			System.out.println(num + " is not present in the arraylist");
	}
	
	public static void main(String[] args) {
		Assignment1 assignment1 = new Assignment1();
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(56);
		inputArray.add(33);
		assignment1.isNumberPresent(inputArray, 25);
		assignment1.isNumberPresent(inputArray, 56);
		
	}
}
