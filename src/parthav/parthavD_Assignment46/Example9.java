/*Programming Questions - Collections : 4th Oct'2021
 Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]
 */

package parthav.parthavD_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Example9 {

	static Integer[] getIntegerArray(int[] arr) {

		Integer[] arrInteger = new Integer[arr.length];
		for (int index = 0; index < arr.length; index++) {
			arrInteger[index] = arr[index];
		}

		return arrInteger;
	}

	static ArrayList<Integer> getUnionOfArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		list2.removeAll(list1);
		list1.addAll(list2);
		return list1;

	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 19, 33, 44, 12 };
		int[] arr2 = { 19, 99, 110, 11, 10 };
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(getIntegerArray(arr1)));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(getIntegerArray(arr2)));
		System.out.println(getUnionOfArrayLists(list1, list2));
	}

}
