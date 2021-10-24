/* Assignment 46 - Collections : 4th Oct'2021
Example 8: Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList */

package manaswi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Assignment_46_Program_8 
{

	LinkedList<Integer> findNegativeNumbersRemoveDuplicate(Integer[] input) 
	{
		List<Integer> list = new LinkedList<Integer>(Arrays.asList(input));
		List<Integer> outputList = new LinkedList<Integer>();
		for(Integer num : list)
		{
			if(num<0)
				if(!outputList.contains(num))
					outputList.add(num);
		}
		return (LinkedList<Integer>)outputList;
	}

	public static void main(String[] args)
	{
		Integer[] input = {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		Assignment_46_Program_8 p8 = new Assignment_46_Program_8();
		System.out.println("List after adding non-duplicates negative numbers from input- " + Arrays.toString(input));
		System.out.println("Output- " + p8.findNegativeNumbersRemoveDuplicate(input));
	}
}