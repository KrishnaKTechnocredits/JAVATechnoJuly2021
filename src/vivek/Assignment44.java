/*Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
*/

package vivek;

import java.util.ArrayList;

public class Assignment44 {

	void getMaxNumberFromArrayList(ArrayList<Integer> al) {
		int maxNo = 0;
		for (int index = 0; index < al.size(); index++) {
			if (al.get(index) > maxNo)
				maxNo = al.get(index);
		}
		System.out.println("Maximum number from the array list is " + maxNo);
	}

	public static void main(String[] args) {
		Assignment44 assignment44 = new Assignment44();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(74);
		assignment44.getMaxNumberFromArrayList(al);
	}
}
