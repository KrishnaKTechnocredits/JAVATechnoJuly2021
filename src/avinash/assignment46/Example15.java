package avinash.assignment46;
/* Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Example15 {
	static void  traverseHashSetUsinIterator(HashSet<Integer> set) {
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		HashSet<Integer> hashset = new HashSet<Integer>(Arrays.asList(input));
		traverseHashSetUsinIterator(hashset);
		
	}

}
