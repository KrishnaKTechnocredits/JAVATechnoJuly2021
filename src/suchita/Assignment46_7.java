package suchita;
// Assignment 46_7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Assignment46_7 {

	//Return ArrayList of first 10 prime numbers in the range [100,500].
	void getPrimeNum(int startRange, int endRange) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int index = startRange; index <= endRange; index++)
			if(isPrimeNum(index))
				list.add(index);

		System.out.println("The list of prime numbers between 100 and 500 :: " + list);
	}

	boolean isPrimeNum(int num) {

		for(int index = 2; index < num; index++) {
			if(num%index==0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		
		Assignment46_7 assignment = new Assignment46_7();
		assignment.getPrimeNum(100, 500);

	}
}