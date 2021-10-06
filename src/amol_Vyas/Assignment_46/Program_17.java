/*Example 17:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).*/

package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Program_17 {

	static void  removeObjectFromArrayList(ArrayList<Integer> list, Integer element) {
		list.remove(element);
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(list);
		removeObjectFromArrayList(list, new Integer(19));
		
	}
}
