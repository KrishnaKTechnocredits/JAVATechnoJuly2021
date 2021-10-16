//Return ArrayList of first 10 prime numbers in the range [100,500].

package suruchi.Assignment46;

import java.util.ArrayList;

public class Program7 {

	boolean checkNumberIsPrime(int number) {
		boolean isPrime = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	ArrayList<Integer> getPrimeNumberInRange(int startIndex, int endIndex) {
		ArrayList<Integer> listOfPrimeNum = new ArrayList<Integer>();
		for (int index = startIndex; index <= endIndex; index++) {
			if (checkNumberIsPrime(index))
				listOfPrimeNum.add(index);
		}
		return listOfPrimeNum;
	}

	public static void main(String[] args) {
		Program7 program7 = new Program7();

		System.out.println("The list of prime number in the range 100 to 500 is: ");
		System.out.println(program7.getPrimeNumberInRange(100, 500));
	}
}