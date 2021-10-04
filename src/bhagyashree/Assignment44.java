/*
 * Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99

 */
package bhagyashree;

import java.util.ArrayList;

public class Assignment44 {

	int max = 0;

	// ArrayList<Integer> getMaxNumber(ArrayList<Integer> al)
	int getMaxNumber(ArrayList<Integer> arr) {

		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index) > max)
				max = arr.get(index);
		}
		return max;

	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(7);
		arrayList.add(99);
		arrayList.add(53);
		arrayList.add(74);
		arrayList.add(125);

		Assignment44 ass44 = new Assignment44();
		System.out.println("Maximum Number from ArrayList: " + ass44.getMaxNumber(arrayList));
	}

}
