/*Example 13:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/

package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Program_15 {

	
	static void  traverseHashSetUsinIterator(HashSet<Integer> set) {
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
	

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(input));
		traverseHashSetUsinIterator(set);
	}
}
