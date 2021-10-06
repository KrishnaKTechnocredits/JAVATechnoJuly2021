//Write a program to traverse(or iterate) HashSet.

package astha.Assignment46;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment16 {

	void traverseAHashSet(HashSet<Integer> input) {
		Iterator<Integer> itr = input.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		HashSet<Integer> input = new HashSet<Integer>();
		input.add(19);
		input.add(12);
		input.add(18);
		input.add(17);
		input.add(23);
		input.add(22);
		assignment16.traverseAHashSet(input);
	}
}
