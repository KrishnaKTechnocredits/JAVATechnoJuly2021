/*Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map*/

package purshottamJoshi;

import java.util.HashMap;
import java.util.Map;

public class Assignment48_2 {

	int geSockPair(int[] input) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int pairs = 0;
		for (int number : input) {
			if (map.containsKey(number))
				map.put(number, map.get(number) + 1);
			else
				map.put(number, 1);
		}
		for (int key : map.keySet()) {
			pairs += map.get(key) / 2;
		}
		return pairs;
	}
	public static void main(String[] args) {
		int[] input = {10,3,10,4,7,4,10,3,2,7};
		System.out.println(new Assignment48_2().geSockPair(input)+" pairs");
	}
}
