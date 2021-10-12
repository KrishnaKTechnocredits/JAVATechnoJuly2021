/*Assignment 46:
 * Programming Questions - Collections : 4th Oct'2021

Example 3 :
Write a program to remove duplicate from ArrayList (without using set).*/

package parthav.parthavD_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example3 {

	Integer[] getIntegerArray(int[] arr) {

		Integer[] arrInteger = new Integer[arr.length];
		for (int index = 0; index < arr.length; index++) {
			arrInteger[index] = arr[index];
		}

		return arrInteger;
	}

	void removeDuplicates(int[] arr) {
		ArrayList<Integer> inputArrList = new ArrayList<>(Arrays.asList(getIntegerArray(arr)));
		List<Integer> outputArrList = new ArrayList<Integer>();

		for (int number : inputArrList) {
			if (!outputArrList.contains(number)) {
				outputArrList.add(number);
			}
		}
		System.out.println("The arraylist without duplicates is: ");
		System.out.println(outputArrList);
	}

	public static void main(String[] args) {
		int[] intArr = { 34, 30, 45, 60, 70, 45, 85, 45, 95, 100, 34 };
		Example3 newObj = new Example3();
		newObj.removeDuplicates(intArr);

	}

}
