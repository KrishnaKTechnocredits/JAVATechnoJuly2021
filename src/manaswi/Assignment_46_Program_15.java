/* Assignment 46 - Collections : 4th Oct'2021
Example 15: Write a program to convert Array to List. */

package manaswi;

import java.util.ArrayList;
import java.util.List;

public class Assignment_46_Program_15
 {

	List<Integer> convertArrayIntoList(Integer[] input) 
	{
		List<Integer> output = new ArrayList<Integer>();
		for(Integer num : input) 
		{
			output.add(num);
		}
		return output;
	}

	public static void main(String[] args)
	{
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		Assignment_46_Program_15 p15 = new Assignment_46_Program_15();
		System.out.println("Converting array into list- " + p15.convertArrayIntoList(input));
	}
}