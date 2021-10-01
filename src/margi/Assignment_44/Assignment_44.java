package margi.Assignment_44;

import java.util.ArrayList;

/*Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/

public class Assignment_44 {

	int getMaxNumber(ArrayList<Integer> arr) {
		int max = 0;
		for (int index = 0; index < arr.size(); index++) {
			if (max < arr.get(index))
				max = arr.get(index);
		}
		return max;
	}

	void processArrayList() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(7);
		arr.add(99);
		arr.add(53);
		arr.add(74);
		System.out.println("Maximum Number in an ArrayList: " + getMaxNumber(arr));
	}

	public static void main(String[] args) {
		Assignment_44 assignment_44 = new Assignment_44();
		assignment_44.processArrayList();
	}
}
