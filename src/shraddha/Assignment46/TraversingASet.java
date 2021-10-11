/*Programming Questions - Collections : 4th Oct'2021
Example 16:
Write a program to traverse(or iterate) HashSet.
*/
package shraddha.Assignment46;

import java.util.HashSet;
import java.util.Iterator;

public class TraversingASet {
public static void main(String[] args) {
	HashSet<Integer> al = new HashSet<>();
	al.add(19);
	al.add(12);
	al.add(18);
	al.add(17);
	al.add(23);
	al.add(22);
	System.out.println("Given Set is :- " + al);

	System.out.println("----------------------------------------------");
	System.out.println("Traversing Set using enhanced for loop");
	for (Integer num : al) {
		System.out.print(" " + num);
	}
	System.out.println();
	System.out.println("-----------------------------------------");
	System.out.println("Iterating Given Set using Iterator");
	Iterator<Integer> itr = al.iterator();

	while (itr.hasNext())
		System.out.print(" "+itr.next());
}
}


