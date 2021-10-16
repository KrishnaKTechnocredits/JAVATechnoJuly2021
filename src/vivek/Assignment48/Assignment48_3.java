/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
output : 33,9
Hint : Map*/

package vivek.Assignment48;

import java.util.HashMap;

public class Assignment48_3 {

	static HashMap<Integer, Integer> findFrequency(Integer[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (map.containsKey(num)) {
				int cnt = map.get(num);
				map.put(num, ++cnt);
			} else
				map.put(num, 1);
		}
		return map;
	}

	static void printNoWithGivenFrequency(Integer[] arr, int freq) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(findFrequency(arr));
		for (int num : map.keySet()) {
			if (map.get(num) == freq)
				System.out.println(num);
		}
	}

	public static void main(String[] args) {
		Integer[] input = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		Assignment48_3.printNoWithGivenFrequency(input, 1);
	}
}
