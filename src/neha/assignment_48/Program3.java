package neha.assignment_48;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map*/
public class Program3 {
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
			if (hm.get(key) == 1)
				System.out.println(key);
		}
	}

	public static void main(String[] args) {
		Program3 program3 = new Program3();
		int[] arr = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		program3.findNumbersWithFreq1(arr);
	}
}
