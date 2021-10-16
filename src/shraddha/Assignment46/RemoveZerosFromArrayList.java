/*Programming Questions - Collections : 4th Oct'2021
Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]
*/
package shraddha.Assignment46;

import java.util.ArrayList;

public class RemoveZerosFromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(0);
		al.add(1);
		al.add(0);
		al.add(3);
		al.add(0);
		al.add(2);
		al.add(6);
		System.out.println("Input List :- " + al);

		for (int index = 0; index < al.size(); index++) {
			if (al.get(index).equals(0)) {
				al.remove(index);
				index--;
			}
		}
		System.out.println("After removing all zeros from the list :- " + al);

	}
}
