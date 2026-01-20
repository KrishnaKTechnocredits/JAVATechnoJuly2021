/*Assignment - 48 : 9th Oct'2021
program 7 : find the freq of each number in given array.
*/

package ritabrata.assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment_48_7 {
	void getFreqOfNum(int[] arr) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int num : arr) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		System.out.println("The freq of each number:" + map);
	}

	public static void main(String[] args) {
		Assignment_48_7 freq= new Assignment_48_7();
		int[] input= {10,3,10,4,7,4,10,3,2,7};
		freq.getFreqOfNum(input);
	}
}
