/* Assignment 46 - Collections : 4th Oct'2021
Example 18: Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method). */

package manaswi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_46_Program_18
 {

	public static void main(String[] args) 
	{
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println("Input- " + Arrays.toString(input));
		al.remove(new Integer(18));
		System.out.println("Removing Object from ArrayList by using remove(object) method- " + al);
	}
}