package suchita;
// Assignment 46_12

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

class Assignment46_12 {

	//Remove all non prime numbers from given Set.
	void getPrimeNum(Set<Integer> set) {
		
		System.out.println("\nInput set :: " + set);
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		for (int index : list)
			if (!isPrimeNum(index))
				set.remove(index);

		System.out.println("The output set after removing all non prime numbers :: " + set);
	}

	boolean isPrimeNum(int num) {

		for (int index = 2; index < num; index++) {
			if (num % index == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		
		Assignment46_12 assignment = new Assignment46_12();
		Set<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(19, 12, 18, 17, 23, 22));
		
		assignment.getPrimeNum(set);

	}

}