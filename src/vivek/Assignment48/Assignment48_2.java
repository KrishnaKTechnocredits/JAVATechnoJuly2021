/*Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map*/

package vivek.Assignment48;

import java.util.HashMap;

public class Assignment48_2 {

	static void findSocksPairs(Integer[] arr) {
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer num : arr) {
			if (map.containsKey(num)) {
				int cnt = map.get(num);
				map.put(num, cnt + 1);
			} else
				map.put(num, 1);
		}
		for (Integer num1 : map.keySet()) {
			sum += map.get(num1) / 2;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		Assignment48_2.findSocksPairs(input);
	}
}
