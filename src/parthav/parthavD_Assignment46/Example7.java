/*Programming Questions - Collections : 4th Oct'2021
 * Example 7 : 

Return ArrayList of first 10 prime numbers in the range [100,500].*/

package parthav.parthavD_Assignment46;

import java.util.List;
import java.util.ArrayList;

public class Example7 {

	private boolean isPrimeNumber(int number) {
		for (int index = 2; index < number;index++) {
			if (number % index == 0)
				return false;
		}
		return true;
	}

	void printArrayList(int number1, int number2, int n) {
		int countOfPrimeNumbers = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int index = number1; index <= number2; index++) {
			if (isPrimeNumber(index)) {
				list.add(index);
				countOfPrimeNumbers++;
			}

			if (countOfPrimeNumbers == 10)
				break;
		}

		System.out.println(list);
	}

	public static void main(String[] args) {
		Example7 newObject = new Example7();
		newObject.printArrayList(100, 500, 10);

	}

}
