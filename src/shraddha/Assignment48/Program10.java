/*Assignment - 48 : 9th Oct'2021
program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList
*/
package shraddha.Assignment48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program10 {
	public static void main(String[] args) {
		Integer[] input = { 1, 2, 3, 5, 4, 7 };
		Program10 obj = new Program10();
		obj.appendZeroAfterThreeConsecutiveNumbers(input);
	}

	void appendZeroAfterThreeConsecutiveNumbers(Integer[] arr) {
		System.out.println(Arrays.toString(arr));
		System.out.println("-----------------------------------------");
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		for (int index = 0; index < list.size() - 2; index++) {
			if (list.get(index + 2) - list.get(index + 1) == 1 && list.get(index + 2) - list.get(index) == 2) {
				list.add((index + 3), 0);
			}
		}
		System.out.println(list);
	}
}
