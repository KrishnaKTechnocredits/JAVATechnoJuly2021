package madhavi;

import java.util.ArrayList;
import java.util.Arrays;

//append 0 after 3 consecutive number.

public class Assignment_48_10 {
	void appendZero(Integer inputArrray[]) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(inputArrray));

		for (int index = 0; index < list.size() - 2; index++)
			if (list.get(index) + 1 == list.get(index + 1) && list.get(index + 1) + 1 == list.get(index + 2))
				list.add(index + 3, 0);

		System.out.println(list);
	}

	public static void main(String[] args) {
		Assignment_48_10 assignment_48_10 = new Assignment_48_10();
		Integer inputArrray[] = { 1, 3, 4, 5, 7 };
		assignment_48_10.appendZero(inputArrray);

	}

}
