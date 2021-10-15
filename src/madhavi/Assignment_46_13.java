package madhavi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_46_13 {
	public static void main(String[] args) {
		ArrayList<Integer> numArray = new ArrayList<Integer>(Arrays.asList(19, 12, 18, 17, 23, 22));
		ArrayList<Integer> opNumArray = new ArrayList<Integer>();
		boolean status;
		for (int index = 0; index < numArray.size(); index++) {
			status = false;
			for (int count = 2; count <= numArray.get(index) - 1; count++) {

				if (numArray.get(index) % count == 0) {
					status = true;
					break;
				}
			}
			if (!status) {
				opNumArray.add(numArray.get(index));
			}
		}

		System.out.println(opNumArray);
	}
}
