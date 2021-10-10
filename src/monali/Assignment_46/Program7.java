package monali.Assignment_46;

import java.util.ArrayList;

public class Program7 {

	// Example 7 : Return ArrayList of first 10 prime numbers in the range
	// [100,500].

	boolean isPrime(int num) {
		for (int index = 2; index < num / 2; index++)
			if (num % index == 0)
				return false;
		return true;
	}

	ArrayList<Integer> getPrimeNumInRange(int startIndex, int endIndex) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for (int index = startIndex; index < endIndex; index++) {
			if (isPrime(index) & count < 10) {
				list.add(index);
				count++;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Program7 prm7 = new Program7();
		System.out.println("First 10 Prime Numbers between 100 to 500 : " + prm7.getPrimeNumInRange(100, 500));
	}
}
