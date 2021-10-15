/*Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map*/

package amol_Vyas.Assignment_48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program_2 {

	static int getPairOfSocks(Integer[] input) {
		int output = 0;
		Map<Integer, Integer> map = new HashMap();
		for (int num : input) {
			if (map.containsKey(num)) {
				int cnt = map.get(num);
				map.put(num, ++cnt);
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
		// TODO Auto-generated method stub
		Integer[] input = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		System.out.println(getPairOfSocks(input));

	}

}
