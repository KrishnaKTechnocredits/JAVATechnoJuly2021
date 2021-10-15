package madhavi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_46_12 {

	public static void main(String[] args) {
		ArrayList<Integer> numArray = new ArrayList<Integer>(Arrays.asList(10, 0, 0, 1, 0, 3, 0, 2, 6));
		ArrayList<Integer> numArray1 = new ArrayList<Integer>(Arrays.asList(10, 0, 0, 1, 0, 3, 0, 2, 6));
		
		// Approach 1
		numArray.removeIf(num -> (num == 0));
		System.out.println("Output : " + numArray);

		// Approach 2
		for (int index = 0; index < numArray1.size(); index++) {
			if (numArray1.contains(0)) {
				numArray1.remove(new Integer(0));
			}
		}

		System.out.println("Output : " + numArray1);

	}

}
