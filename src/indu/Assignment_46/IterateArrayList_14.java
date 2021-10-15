/*
Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/
package indu.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterateArrayList_14 {

	static void iterateArrayslistusingLoopAndIterator()
	{
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(11,9,55,78,65,30,45));
		System.out.println("Array list is :\n"+alist);
		System.out.println("Iterate List Using Enhanved for loop");
		for(int num : alist)
		{
			System.out.print(num+ " ");
		}
		System.out.println("\nUsing Iterator");
		Iterator<Integer> itr = alist.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
	
	public static void main(String[] args) {
		iterateArrayslistusingLoopAndIterator();
	}
}
