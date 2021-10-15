package margi.Assignment_48;

import java.util.LinkedHashMap;

/*Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map*/

public class Assignment_48_2 {

	int getPair(Integer[] input) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (int num : input) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		int pair = 0;
		for (int num : map.keySet()) {
			pair += map.get(num) / 2;
		}
		return pair;
	}

	public static void main(String[] args) {
		Assignment_48_2 assignment_48_2 = new Assignment_48_2();
		Integer[] input = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		System.out.println(assignment_48_2.getPair(input) + " pairs");
	}
}
