/*Programming Questions - Collections : 4th Oct'2021

Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/

package parthav.parthavD_Assignment46;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;

public class Example4 {

	Integer[] getIntegerArray(int[] arr) {

		Integer[] arrInteger = new Integer[arr.length];
		for (int index = 0; index < arr.length; index++) {
			arrInteger[index] = arr[index];
		}

		return arrInteger;
	}
	
	void removeDuplicatesFromArrayList(int[] inputArr){
		ArrayList<Integer> inputArrList = new ArrayList<Integer>(Arrays.asList(getIntegerArray(inputArr)));
		Set<Integer> set = new LinkedHashSet<>(inputArrList);
		
		System.out.println("The result using set while maintaining the element order is: ");
		System.out.println(set);
	}

	public static void main(String[] args) {
		int[] intArr = { 34, 30, 45, 60, 70, 45, 85, 45, 95, 100, 34 };
		Example4 newObject = new Example4();
		newObject.removeDuplicatesFromArrayList(intArr);
	}

}
