/*Programming Questions - Collections : 4th Oct'2021
Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.
*/
package shraddha.Assignment46;

import java.util.ArrayList;
import java.util.Iterator;

public class traversingArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(19);
		al.add(12);
		al.add(18);
		al.add(17);
		al.add(23);
		al.add(22);
		System.out.println("Given ArrayList is :- " + al);
		System.out.println("----------------------------------------------");
		System.out.println("Traversing Arraylist using enhanced for loop");

		for (Integer num : al) {
			System.out.print(" " + num);
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("Iterating Given ArrayList using Iterator");
		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext())
			System.out.print(" "+itr.next());
	}
}
