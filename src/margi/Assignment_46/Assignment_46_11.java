package margi.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

/*Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]
Hint : Method Parameter should be ArrayList, return type should be ArrayList.*/

public class Assignment_46_11 {

	ArrayList<Integer> getMissingNumbers(ArrayList<Integer> list) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int index = 1; index <= 10; index++) {
			if (!list.contains(index))
				numbers.add(index);
		}
		return numbers;
	}

	public static void main(String[] args) {
		Assignment_46_11 assignment_46_11 = new Assignment_46_11();
		Integer[] arr = { 1, 6, 2, 5, 7, 6, 3, 10 };
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
		System.out.println(assignment_46_11.getMissingNumbers(list));
	}
}
