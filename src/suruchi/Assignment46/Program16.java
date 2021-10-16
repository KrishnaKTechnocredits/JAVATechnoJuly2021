//Write a program to traverse(or iterate) HashSet.

package suruchi.Assignment46;

import java.util.HashSet;
import java.util.Iterator;

public class Program16 {

	void traverseAHashSet(HashSet<Integer> input) {
		System.out.println("Traversing a HashSet via iterator: ");
		Iterator<Integer> itr = input.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	public static void main(String[] args) {
		Program16 program16 = new Program16();

		HashSet<Integer> input = new HashSet<>();
		input.add(19);
		input.add(12);
		input.add(18);
		input.add(17);
		input.add(23);
		input.add(22);

		program16.traverseAHashSet(input);
	}
}