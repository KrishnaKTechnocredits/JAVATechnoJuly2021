/*program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/
package monika.Assignment_48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_10 {
	static void addZeroAfter3ConsecutiveNumbers(Integer[] input) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		for (int index = 0; index < list.size() - 2; index++) {
			if (list.get(index) == list.get(index + 1) - 1 && list.get(index) == list.get(index + 2) - 2) {
				list.add(index + 3, 0);
			}
		}
		System.out.println(list);
	}
	public static void main(String[] args) {
		Integer[] input= {1,2,3,5,4,7};
		addZeroAfter3ConsecutiveNumbers(input);
	}
}
