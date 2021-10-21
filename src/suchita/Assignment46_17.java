package suchita;
// Assignment 46_17

import java.util.ArrayList;
import java.util.Arrays;

class Assignment46_17 {

	//Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(11,23,33,66,77,41,55,77));
		System.out.println("\nInput list :: " + list);
		list.remove((Integer) 23);
		list.remove(new Integer(41));
		System.out.println("Output list :: " + list);

	}
}