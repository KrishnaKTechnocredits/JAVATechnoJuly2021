package neha.assignment_48;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*program 7 : find the freq of each number in given array.*/
public class Program7 {
	void findNumbersWithFreq1(int[] arr) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (hm.containsKey(num)) {
				hm.put(num, hm.get(num) + 1);
			} else
				hm.put(num, 1);
		}
		Set<Integer> keys = hm.keySet();
		for (int key : keys) {
			System.out.println(key + " : " + hm.get(key));
		}
	}

	public static void main(String[] args) {
		Program7 program7 = new Program7();
		int[] arr = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		program7.findNumbersWithFreq1(arr);
	}
}
