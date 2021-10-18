/*
 * Write a program to traverse(or iterate) HashSet.
 */
package bhagyashree.Assignment46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Assignment46_15 {

	static void traverseHashSetUsingIterator(HashSet<Integer> set) {
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(input));
		traverseHashSetUsingIterator(set);
	}

}
