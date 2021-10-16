/*Programming Questions - Collections : 4th Oct'2021
 * Example 13:
Remove all non prime numbers from given Set.
*/

package parthav.parthavD_Assignment46;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class Example13 {

	boolean isPrimeNumber(int number) {
		boolean primeNumberFlag = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				primeNumberFlag = false;
				break;
			}

		}

		return primeNumberFlag;
	}

	Integer[] getIntegerArray(int[] arr) {

		Integer[] arrInteger = new Integer[arr.length];
		for (int index = 0; index < arr.length; index++) {
			arrInteger[index] = arr[index];
		}

		return arrInteger;

	}

	void removePrimeNumbers(int[] inputArr) {

		Set<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(getIntegerArray(inputArr)));
		Set<Integer> outputSet = new LinkedHashSet<Integer>();

		for (Integer num : set) {
			if (!isPrimeNumber(num)) {
				outputSet.add(num);
			}
		}

		System.out.println(outputSet);
	}

	public static void main(String[] args) {
		int[] inputArr = { 45, 55, 101, 106, 103, 107, 99, 109, 110, 113 };
		Example13 newObj = new Example13();
		newObj.removePrimeNumbers(inputArr);
	}

}
