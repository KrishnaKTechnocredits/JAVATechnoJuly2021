/*Programming Questions - Collections : 4th Oct'2021
Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].
*/
package shraddha.Assignment46;

import java.util.ArrayList;

public class PrimeNumbersInGivenRange {
	public static void main(String[] args) {
		System.out.println(getPrimeNumbers(100, 500));
	}

	static ArrayList<Integer> getPrimeNumbers(int startIndex, int endIndex) {
		ArrayList<Integer> primeNumberList = new ArrayList<>();
		ArrayList<Integer> outputList = new ArrayList<>();
		for (int index = startIndex; index <= endIndex; index++) {
			boolean isPrime = true;
			for (int i = 2; i < index; i++) {
				if (index % i == 0)
					isPrime = false;
			}
			if (isPrime)
				primeNumberList.add(index);
		}
		System.out.println("Prime numbers between " + startIndex + " and " + endIndex + " are:- ");
		System.out.println(primeNumberList);
		for (int index = 0; index < 10; index++) {
			outputList.add(primeNumberList.get(index));
		}
		System.out.println("==============================================================================");
		System.out.println("ArrayList of first 10 prime numbers in the range [100,500] is :- ");
		return outputList;
	}
}
