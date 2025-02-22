/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map
*/
package amol_Pawar.assignment_48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program_3 {

	void getFrequncyCount(Integer input[]) {
		List<Integer> l = Arrays.asList(input);

		Map<Integer, Integer> inputMap = new HashMap();
		for (int index = 0; index < input.length; index++) {
			int num = input[index];
			if (inputMap.containsKey(num)) {
				inputMap.put(num, inputMap.get(num) + 1);
			} else {
				inputMap.put(num, 1);
			}
		}
		Set<Integer> set = inputMap.keySet();
		for (int num : set) {
			if (inputMap.get(num) == 1) {
				System.out.print(num + " ");
			}
		}
	}

	public static void main(String[] args) {

		Program_3 program_2 = new Program_3();
		Integer arr[] = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		program_2.getFrequncyCount(arr);
	}

}
