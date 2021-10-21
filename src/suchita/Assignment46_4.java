package suchita;
//Assignment 46_4

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class Assignment46_4 {

	//WAP to remove duplicate from ArrayList (using set).
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(10, 21, 12, 9, 43, 35, 12, 99, 21, 53));
		System.out.println("\n Input arraylist:: " + arr);
		Set<Integer> output = new LinkedHashSet<Integer>(arr);
		arr.removeAll(output);
		arr.addAll(output);
		System.out.println(" Duplicates removed:: " + arr);

	}
}