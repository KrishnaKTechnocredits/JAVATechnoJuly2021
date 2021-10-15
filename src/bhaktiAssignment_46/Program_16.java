/*Example 16:
Write a program to traverse(or iterate) HashSet.*/

package bhaktiAssignment_46;

import java.util.HashSet;
import java.util.Iterator;

public class Program_16 {
	public static void main(String[] args) {
		HashSet sh =new HashSet();
		sh.add("Test");
		sh.add("Java");
		sh.add("Komal");
		Iterator itr1= sh.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
