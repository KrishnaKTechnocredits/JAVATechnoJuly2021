/*Example 16:
Write a program to traverse(or iterate) HashSet.*/
package chandani.Assignment_46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Assignment46p {
	
	void iterateHashSet(String[] arr) {
		HashSet<String> set = new HashSet<String>(Arrays.asList(arr));
		System.out.print("Using for enhanced loop ");
		for (String name : set) {
			System.out.print("\n" +name + " ");
		}
		
		System.out.print("\n-----------------------------");

		System.out.print("\nUsing Iterator ");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print("\n" + itr.next() + " ");
		}
	}

	public static void main(String[] args) {
		Assignment46p assignment46p = new Assignment46p();
		String[] arr = { "User1", "User2", "User3", "User4", "User5" };
		assignment46p.iterateHashSet(arr);
	}

}
