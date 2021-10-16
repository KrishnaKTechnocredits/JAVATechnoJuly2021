//find the freq of each number in given array.

package suruchi.Assignment48;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program7 {

	void getFreqOfEachNumber(Integer[] input) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (Integer number : input) {
			if (map.containsKey(number)) {
				map.put(number, map.get(number) + 1);
			} else
				map.put(number, 1);
		}
		System.out.println("Frequency of each number in given array is: ");
		System.out.println(map);
	}

	public static void main(String[] args) {
		Program7 program7 = new Program7();

		Integer[] input = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		
		System.out.println("Array is: " + Arrays.toString(input));
		program7.getFreqOfEachNumber(input);
	}
}