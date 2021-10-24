/* Assignment 46 - Collections : 4th Oct'2021
Example 16: Write a program to traverse(or iterate) HashSet. */

package manaswi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Assignment_46_Program_16
 {

	void traverseHashSetUsingIterator(HashSet<Integer> set) 
	{
		System.out.print("Traverse hash set using iterator- ");
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) 
		{
			System.out.print(itr.next() + " ");
		}
	}

	public static void main(String[] args) 
	{
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(input));
		Assignment_46_Program_16 p16 = new Assignment_46_Program_16();
		p16.traverseHashSetUsingIterator(set);
	}
}