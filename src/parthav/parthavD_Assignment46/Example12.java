/*Programming Questions - Collections : 4th Oct'2021
 * Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/

package parthav.parthavD_Assignment46;

import java.util.Arrays;
import java.util.ArrayList;

public class Example12 {

	Integer[] getIntegerArray(int[] arr) {

		Integer[] arrInteger = new Integer[arr.length];
		for (int index = 0; index < arr.length; index++) {
			arrInteger[index] = arr[index];
		}

		return arrInteger;

	}

	void removeZerosFromArrayList(int[] inputArr) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(getIntegerArray(inputArr)));
		ArrayList<Integer> outputList = new ArrayList<>();
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index) != 0)
				outputList.add(list.get(index));
		}

		System.out.println(outputList);

	}

	public static void main(String[] args) {
		Example12 newObj = new Example12();
		int[] inputArr = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };
		newObj.removeZerosFromArrayList(inputArr);

	}

}
