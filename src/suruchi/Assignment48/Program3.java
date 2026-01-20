/*print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map*/

package suruchi.Assignment48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program3 {

	void printUniqueNumbers(Integer[] input) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : input) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else
				map.put(num, 1);
		}
		Set<Integer> set = map.keySet();
		System.out.println("Unique numbers are: ");
		for (int num : set) {
			if (map.get(num) == 1)
				System.out.println(num);
		}

	}

	public static void main(String[] args) {
		Program3 program3 = new Program3();

		Integer[] input = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };

		System.out.println("Array is: " + Arrays.toString(input));
		program3.printUniqueNumbers(input);
	}
}