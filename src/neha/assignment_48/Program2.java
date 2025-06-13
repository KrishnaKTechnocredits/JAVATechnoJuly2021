package neha.assignment_48;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map*/
public class Program2 {
	void findPairOfSocks(int[] arr) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int totalPairs = 0;
		for (int num : arr) {
			if (hm.containsKey(num)) {
				hm.put(num, hm.get(num) + 1);
			} else
				hm.put(num, 1);
		}
		Set<Integer> keys = hm.keySet();
		for (int key : keys) {
			hm.put(key, hm.get(key) / 2);
			totalPairs = totalPairs + hm.get(key);
		}
		System.out.println("Total pairs of socks are "+totalPairs);
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();
		int[] arr = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		program2.findPairOfSocks(arr);
	}
}
