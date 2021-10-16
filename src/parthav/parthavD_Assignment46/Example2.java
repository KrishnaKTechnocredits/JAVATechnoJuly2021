/*Assignment: 46
Programming Questions - Collections : 4th Oct'2021

Example 2 :
Write a program to find given number is duplicate in arrayList.*/

package parthav.parthavD_Assignment46;

import java.util.Arrays;
import java.util.ArrayList;

public class Example2 {

	Integer[] getIntegerArray(int[] arr) {

		Integer[] arrInteger = new Integer[arr.length];
		for (int index = 0; index < arr.length; index++) {
			arrInteger[index] = arr[index];
		}

		return arrInteger;
	}
	
	void checkIfDuplicate(int[] inputArr, int number){
		ArrayList<Integer> inputArrList = new ArrayList<>(Arrays.asList(getIntegerArray(inputArr)));
		if (!inputArrList.contains(number))
			System.out.println("The number " + number + " is not present in the ArrayList");
		else if (inputArrList.indexOf(number) == inputArrList.lastIndexOf(number))
			System.out.println("The number " + number + " is not a duplicate number");
		else
			System.out.println("The number " + number + " is a duplicate number");
	}
	

	public static void main(String[] args) {
		Example2 newObject = new Example2();
		int[] intArr = { 34, 30, 45, 60, 70, 45, 85, 45, 95, 100, 34};
		newObject.checkIfDuplicate(intArr, 34);
		newObject.checkIfDuplicate(intArr, 45);
		newObject.checkIfDuplicate(intArr, 95);
		newObject.checkIfDuplicate(intArr, 90);
		

	}

}
