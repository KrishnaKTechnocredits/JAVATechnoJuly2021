package monali.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;
//program 7 : find the freq of each number in given array.
public class Program7 {

	void getFreqOfEachNumber(Integer[] arr) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int num : arr) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		System.out.println(map);

	}

	public static void main(String[] args) {
		Integer arr[] = { 10, 30, 20, 40, 19, 10, 40, 10, 19 };
		Program7 p7 = new Program7();
		p7.getFreqOfEachNumber(arr);
	}
}
