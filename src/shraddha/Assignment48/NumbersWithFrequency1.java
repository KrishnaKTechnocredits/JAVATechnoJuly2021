/*Assignment - 48 : 9th Oct'2021
program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map
*/
package shraddha.Assignment48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumbersWithFrequency1 {
	public static void main(String[] args) {
		int[] input = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		System.out.println(Arrays.toString(input));
		NumbersWithFrequency1 obj1 = new NumbersWithFrequency1();
		System.out.println("-------------------------------------");
		System.out.println("Numbers with frequency 1 from above input :- ");
		obj1.displayNumbersWithFrequencyOne(input);
	}

	void displayNumbersWithFrequencyOne(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (Integer key : arr) {
			if (map.containsKey(key)) {
				count = map.get(key);
				map.put(key, count + 1);
			} else {
				map.put(key, 1);
			}
		}
		for (Integer num : map.keySet()) {
			if (map.get(num) == 1) {
				System.out.println(num);
			}
		}
	}
}
