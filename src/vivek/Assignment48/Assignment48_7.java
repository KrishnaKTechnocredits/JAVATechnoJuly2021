/*program 7 : find the freq of each number in given array.*/

package vivek.Assignment48;

import java.util.HashMap;

public class Assignment48_7 {

	static void getNumberFreq(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			if (map.containsKey(num)) {
				int cnt = map.get(num);
				map.put(num, cnt + 1);
			} else {
				map.put(num, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 5, 10, 20, 20, 2 };
		Assignment48_7.getNumberFreq(arr);
	}
}
