package arti_G_Assignment46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*Example 16:
Write a program to traverse(or iterate) HashSet.*/
public class TraverseHashSet {

	static void traverseHashSet(HashSet<Integer> input) {
		Iterator itr = input.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(input));
		traverseHashSet(set);
	}

}
