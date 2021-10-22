/*Assignment - 48 : 9th Oct'2021
program 7 : find the freq of each number in given array.
*/
package shraddha.Assignment48;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfEachNumInArray {
	public static void main(String[] args) {
		Integer[] arr = { 2, 4, 6, 8, 2, 4, 6, 8, 3, 6, 9, 1 };
		FrequencyOfEachNumInArray obj = new FrequencyOfEachNumInArray();
		obj.getFrequencyOfNumbers(arr);
	}

	void getFrequencyOfNumbers(Integer[] arr) {
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------------------------------------");
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		int count = 0;
		for (Integer temp : arr) {
			if (map.containsKey(temp)) {
				count = map.get(temp);
				map.put(temp, count + 1);
			} else {
				map.put(temp, 1);
			}
		}
		System.out.println(map);
	}
}
