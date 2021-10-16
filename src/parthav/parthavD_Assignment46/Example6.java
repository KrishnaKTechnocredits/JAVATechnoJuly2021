/*Programming Questions - Collections : 4th Oct'2021
 * Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/

package parthav.parthavD_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example6 {

	Integer[] getIntegerArray(int[] arr) {

		Integer[] arrInteger = new Integer[arr.length];
		for (int index = 0; index < arr.length; index++) {
			arrInteger[index] = arr[index];
		}

		return arrInteger;
	}

	void printSecondLargestNumber(int[] arr, int n) {
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(getIntegerArray(arr)));
		List<Integer> list = new ArrayList<>(set);
		System.out.println("The " + n + "th largest number in the array is: ");
		System.out.println(list.get(list.size() - n));

	}

	public static void main(String[] args) {
		int[] inputArr = { 30, 20, 40, 1, 45, 60, 23, 90 };
		Example6 newObj = new Example6();
		newObj.printSecondLargestNumber(inputArr, 2);

	}

}
