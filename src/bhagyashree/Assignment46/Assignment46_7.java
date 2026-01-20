/*
 * Return ArrayList of first 10 prime numbers in the range [100,500].
 */
package bhagyashree.Assignment46;

import java.util.ArrayList;

public class Assignment46_7 {

	static boolean isPrimeNumber(int num) {
		boolean prime = true;
		for (int index = 2; index < num / 2; index++) {
			if (num % index == 0) {
				prime = false;
				break;
			} else {
				prime = true;
			}
		}
		return prime;
	}

	static ArrayList<Integer> printPrimeNumbers(int startRange, int endRange) {
		int count = 1;
		ArrayList<Integer> list = new ArrayList();
		for (int index = startRange; index <= endRange; index++) {
			if (isPrimeNumber(index) && count <= 10) {
				list.add(index);
				count++;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(printPrimeNumbers(100, 200));
	}
}
