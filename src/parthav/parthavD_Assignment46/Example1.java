/*Programming Questions - Collections : 4th Oct'2021

Example 1 : 
Write a program to find given number is present in the arrayList or not.*/

package parthav.parthavD_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {

	Integer[] getIntegerArray(int[] arr) {

		Integer[] arrInteger = new Integer[arr.length];
		for (int index = 0; index < arr.length; index++) {
			arrInteger[index] = arr[index];
		}

		return arrInteger;
	}

	void isNumberPresentInArrayList(int[] arr, int number) {

		ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(getIntegerArray(arr)));
		boolean presentFlag = false;
		for (int index = 0; index < arrList.size(); index++) {
			if (number == arrList.get(index)) {
				presentFlag = true;
				break;
			}
		}

		if (presentFlag == true)
			System.out.println("The number " + number + " is present in the ArrayList");
		else
			System.out.println("The number " + number + " is not present in the ArrayList");

	}

	public static void main(String[] args) {
		Example1 newObject1 = new Example1();
		int[] intArr = { 34, 30, 45, 60, 70, 90, 85 };
		newObject1.isNumberPresentInArrayList(intArr, 60);
		newObject1.isNumberPresentInArrayList(intArr, 80);

	}

}
