/*Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map*/

package suruchi.Assignment48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program2 {

	int getPairOfSocks(Integer[] input) {
		int output = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : input) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else
				map.put(num, 1);
		}
		Set<Integer> set = map.keySet();
		for (int num : set) {
			output += (map.get(num) / 2);
		}
		return output;
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();

		Integer[] socksArray = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };

		System.out.println("Socks array is: " + Arrays.toString(socksArray));
		System.out.println("Pairs of socks from array are: " + program2.getPairOfSocks(socksArray));
	}
}