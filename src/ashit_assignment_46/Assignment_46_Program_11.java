/* Assignment 46 - Collections : 4th Oct'2021
Example 11 : Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]
Hint : Method Parameter should be ArrayList, return type should be ArrayList. */

package ashit_assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_46_Program_11 
{

	ArrayList<Integer> findMissingNumber(ArrayList<Integer> al)
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int index=1; index<=10; index++)
		{
			if(!al.contains(index))
				output.add(index);
		}
		return output;
	}

	public static void main(String[] args)
	{
		Integer[] input = {1,6,2,5,7,6,3,10};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		Assignment_46_Program_11 p11 = new Assignment_46_Program_11();
		System.out.println("Input- " + al);
		System.out.println("Missing numbers in input list from 1-10 numbers range- " + p11.findMissingNumber(al));
	}
}
