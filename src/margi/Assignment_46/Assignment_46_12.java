package margi.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

/*Remove all zeros from given ArrayList.
input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/

public class Assignment_46_12 {

	ArrayList<Integer> removeZero(ArrayList<Integer> list) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int num : list) {
			if (num != 0)
				numbers.add(num);
		}
		return numbers;
	}

	public static void main(String[] args) {
		Assignment_46_12 assignment_46_12 = new Assignment_46_12();
		Integer[] num = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(num));
		System.out.println(assignment_46_12.removeZero(list));
	}
}
