/*Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]
*/

package amol_Pawar.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_10 {

	public static void main(String[] args) {
		Integer arr[] = { 1, 6, 2, 5, 7, 6, 3, 10 };
		List<Integer> list = new ArrayList(Arrays.asList(arr));
		List<Integer> outputList = new ArrayList();
		for (int index = 1; index <= 10; index++) {
			if (!list.contains(index)) {
				outputList.add(index);
			}
		}
		System.out.println(outputList);
	}

}
