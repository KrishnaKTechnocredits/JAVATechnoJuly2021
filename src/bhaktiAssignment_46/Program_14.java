/*Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.
*/
package bhaktiAssignment_46;

import java.util.ArrayList;
import java.util.Iterator;

public class Program_14 {
	public static void main(String[] args) {
		ArrayList ar1= new ArrayList();
		ar1.add("test");
		ar1.add("xyz");
		Iterator itr= ar1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> ar2= new ArrayList();
		ar2.add(1);
		ar2.add(3);
		ar2.add(9);
		ar2.add(0);
		Iterator<Integer> itr1= ar2.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
