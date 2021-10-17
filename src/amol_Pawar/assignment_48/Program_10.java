/*program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/

package amol_Pawar.assignment_48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_10 {

	void keepZeroAfterConsicutiveNum(Integer input[]) {
		List<Integer> list = new ArrayList(Arrays.asList(input));

		{
			for (int index = 0; index < list.size() - 2; index++) {

				if (list.get(index) == list.get(index + 1) - 1 && list.get(index) == list.get(index + 2) - 2) {
					list.add(index + 3, 0);
				}
			}

			System.out.println(list);
		}
	}

	public static void main(String[] args) {

		Program_10 program_10 = new Program_10();
		Integer arr[] = { 1, 2, 3, 5, 4, 7 };
		program_10.keepZeroAfterConsicutiveNum(arr);
	}

}
