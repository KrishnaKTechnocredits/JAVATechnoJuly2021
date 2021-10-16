/*program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
output : [1,2,3,0,5,4,7];
Hint : ArrayList
*/

package vivek.Assignment48;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment48_10 {

	static void zeroAfter3ConsecutiveNo(Integer[] arr) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
		for (int index = 0; index < list.size() - 2; index++) {
			if (list.get(index) + 1 == list.get(index + 1) && list.get(index) + 2 == list.get(index + 2)) {
				list.add(index + 3, 0);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		Integer[] input = { 1, 2, 3, 5, 4, 7 };
		Assignment48_10.zeroAfter3ConsecutiveNo(input);
	}
}
