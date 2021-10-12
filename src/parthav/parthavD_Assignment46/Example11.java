/*Programming Questions - Collections : 4th Oct'2021
 * Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]*/

package parthav.parthavD_Assignment46;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Example11 {

	Integer[] getIntegerArray(int[] arr) {

		Integer[] arrInteger = new Integer[arr.length];
		for (int index = 0; index < arr.length; index++) {
			arrInteger[index] = arr[index];
		}

		return arrInteger;
	}

	List<Integer> findMissingNumber(List<Integer> arrList1, List<Integer> arrList2) {
		arrList2.removeAll(arrList1);
		return arrList2;

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 6, 2, 5, 7, 6, 3, 10 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Example11 newObject = new Example11();
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(newObject.getIntegerArray(arr1)));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(newObject.getIntegerArray(arr2)));
		System.out.println(newObject.findMissingNumber(list1, list2));

	}

}
