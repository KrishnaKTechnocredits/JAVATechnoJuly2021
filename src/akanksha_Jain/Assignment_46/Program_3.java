/* Assignment 46 - Collections : 4th Oct'2021
Example 3 : Write a program to remove duplicate from ArrayList (without using set). */

package akanksha_Jain.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_3 {
	
	void removeDuplicateNumberFromArrayList(ArrayList<Integer> al) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int num : al) {
			if(!output.contains(num))
				output.add(num);
		}
		System.out.println(output + " is the list after removing all duplicates");
	}

	public static void main(String[] args) {
		Integer[] input = {7, 12, 22, 33, 65, 87, 13, 33, 7};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		Program_3 p3 = new Program_3();
		p3.removeDuplicateNumberFromArrayList(al);
	}
}