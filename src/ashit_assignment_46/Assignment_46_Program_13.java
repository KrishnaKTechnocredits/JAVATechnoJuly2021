

/* Assignment 46 - Collections : 4th Oct'2021

Example 13: Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]

output : [19,17,23] */

package ashit_assignment_46;

import java.util.Arrays;

import java.util.LinkedHashSet;

import java.util.Set;




public class Assignment_46_Program_13 

{




	void removeAllNonPrimeNumbers(Set<Integer> set) 

	{

		Set<Integer> output = new LinkedHashSet<Integer>();

		for(Integer num : set) 

		{

			if(num%2 != 0)

				output.add(num);

		}

		set.removeAll(output);

		System.out.println("Remove all non prime numbers from given Set- "+ output);

	}




	public static void main(String[] args) 

	{

		Integer[] input = {19,12,18,17,23,22};

		Set<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(input));

		Assignment_46_Program_13 p13 = new Assignment_46_Program_13();

		System.out.println("Input- " + set);

		p13.removeAllNonPrimeNumbers(set);

	}

} 