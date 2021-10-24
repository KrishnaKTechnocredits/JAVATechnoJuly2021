/* Assignment 46 - Collections : 4th Oct'2021
Example 14: Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator. */

package manaswi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Assignment_46_Program_14 
{

	void traverseArrayListUsingLoop(ArrayList<Integer> al) 
	{
		System.out.println("Traverse array list using enhanced loop- ");
		for(Integer num : al) {
			System.out.print(num + " ");
		}
	}

	void traverseArrayListUsingIterator(ArrayList<Integer> al)
	{
		System.out.println("Traverse array list using iterator- ");
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) 
		{
			System.out.print(itr.next() + " ");
		}
	}

	public static void main(String[] args) 
	{
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		Assignment_46_Program_14 p14 = new Assignment_46_Program_14();
		p14.traverseArrayListUsingLoop(al);
		System.out.println();
		p14.traverseArrayListUsingIterator(al);
	}
}