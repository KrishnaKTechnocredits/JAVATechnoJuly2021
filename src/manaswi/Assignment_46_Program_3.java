/* Assignment 46 - Collections : 4th Oct'2021
Example 3 : Write a program to remove duplicate from ArrayList (without using set). */

package manaswi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_46_Program_3 
{

	void removeDuplicateNumberFromArrayList(ArrayList<Integer> al)
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int num : al) {
			if(!output.contains(num))
				output.add(num);
		}
		System.out.println(output + " is the list after removing all duplicates");
	}

	public static void main(String[] args) {
		Integer[] input = {5, 34, 11, 56, 74, 85, 11, 5};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		Assignment_46_Program_3 p3 = new Assignment_46_Program_3();
		p3.removeDuplicateNumberFromArrayList(al);
	}
}