/*Example 13:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/

package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Program_13 {

	static void  traverseArrayListUsingLoop(ArrayList<Integer> list) {
		for(int num:list) {
			System.out.print(num+" ");
		}
	}
	
	static void  traverseArrayListUsinIterator(ArrayList<Integer> list) {
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
	

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		traverseArrayListUsingLoop(list);
		System.out.println();
		System.out.println("-------------------");
		traverseArrayListUsinIterator(list);
	}
}
