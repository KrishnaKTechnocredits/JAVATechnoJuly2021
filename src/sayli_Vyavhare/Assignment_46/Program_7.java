/*Return ArrayList of first 10 prime numbers in the range [100,500].*/
package sayli_Vyavhare.Assignment_46;

import java.util.ArrayList;

public class Program_7 {

	int cnt = 0;

	boolean findPrime(int num) {
		boolean result = true;

		for (int index = 2; index <= num - 1; index++) {

			if (num % index == 0) {
				result = false;
				break;
			}
		}

		if (result) {
			cnt++;
		}
		return result;
	}

	ArrayList<Integer> primeNumber(int startIndex, int endIndex) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int index = startIndex; index <= endIndex; index++) {
			if (findPrime(index) && cnt <= 10) {
				al.add(index);
			}
		}

		return al;
	}

	public static void main(String[] args) {
		Program_7 a = new Program_7();
		ArrayList<Integer> output = a.primeNumber(100, 500);
		System.out.println("ArrayList of first 10 prime numbers in the range [100,500]:" + output);
	}
}
