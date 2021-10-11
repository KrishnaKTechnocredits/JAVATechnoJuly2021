/*program 7 : find the freq of each number in given array.*/

package amol_Vyas.Assignment_48;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program_7 {

	static void getFreqOfEachNumber(Integer[] input) {
		Map<Integer, Integer> map = new LinkedHashMap();
		for (Integer number : input) {
			if (map.containsKey(number)) {
				int cnt = map.get(number);
				map.put(number, ++cnt);
			} else
				map.put(number, 1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		getFreqOfEachNumber(input);
	}

}
