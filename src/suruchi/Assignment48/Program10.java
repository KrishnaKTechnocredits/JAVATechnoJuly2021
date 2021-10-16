/*append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/

package suruchi.Assignment48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program10 {

	void addZeroAfter3ConsecutiveNumbers(Integer[] input) {
		int count = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index] + 2)
				count++;
		}

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		for (int index = 0; index < list.size() - count; index++) {
			if (list.get(index) == list.get(index + 1) - 1 && list.get(index) == list.get(index + 2) - 2) {
				list.add(index + 3, 0);
			}
		}
		System.out.println("Array list after adding zeroes behind sequence of numbers is: " + list);
	}

	public static void main(String[] args) {
		Program10 program10 = new Program10();

		Integer[] input = { 1, 2, 3, 5, 4, 7 };

		System.out.println("Array is : " + Arrays.toString(input));
		program10.addZeroAfter3ConsecutiveNumbers(input);
	}
}