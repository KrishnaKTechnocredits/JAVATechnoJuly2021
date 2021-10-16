package aniket;

import java.util.ArrayList;

//Return ArrayList of first 10 prime numbers in the range [100,500].

public class Assignment_46_7 {

	ArrayList<Integer> findPrimeNumberRange(int startIndex, int endIndex) {
		int count = 0;
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = startIndex; index <= endIndex; index++) {
			if (isPrime(index) && count < 10) {
				output.add(index);
				count++;
			}
		}
		return output;
	}

	boolean isPrime(int num) {
		boolean flag = false;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		/*
		 * Assignment_46_7 assignment_46_7 = new Assignment_46_7();
		 * assignment_46_7.findPrimeNumberRange(100, 500);
		 * 
		 */
		System.out.println("First 10 prime numbers from the given arraylist is : "
				+ new Assignment_46_7().findPrimeNumberRange(100, 500));

	}

}
