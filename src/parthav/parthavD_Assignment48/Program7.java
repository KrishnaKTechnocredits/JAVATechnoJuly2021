/* Program 7 : find the freq of each number in given array.*/

package parthav.parthavD_Assignment48;

import java.util.Map;
import java.util.HashMap;

public class Program7 {

	void findFrequencyOfEachNumber(Integer[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (Integer num : arr) {
			if (!map.containsKey(num))
				map.put(num, 1);
			else
				map.put(num, map.get(num) + 1);
		}

		System.out.println(map);
	}

	public static void main(String[] args) {
		Program7 newObj = new Program7();
		Integer[] arr = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		newObj.findFrequencyOfEachNumber(arr);

	}

}
