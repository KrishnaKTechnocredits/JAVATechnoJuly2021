package monali.Assignment_46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*Example 16:
Write a program to traverse(or iterate) HashSet.
*/
public class Program15 {

	void iterateHashSet(String[] arr) {
		HashSet<String> set = new HashSet<String>(Arrays.asList(arr));
		// Enhance for loop
		System.out.println("Traverse through Enhance for loop ---->");
		for (String name : set) {
			System.out.print(name + ", ");
		}

		System.out.println("\n Traverse through Iterator--->");
		// Iterator
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " , ");
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Monali", "Devendra", "Sakshi", "Anvi", "Mahi" };
		Program15 p15 = new Program15();
		p15.iterateHashSet(arr);
	}
}
