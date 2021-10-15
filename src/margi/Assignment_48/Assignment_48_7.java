package margi.Assignment_48;

import java.util.LinkedHashMap;

//find the freq of each number in given array.

public class Assignment_48_7 {

	LinkedHashMap<Integer, Integer> getFreq(Integer[] input) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (int num : input) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		return map;
	}

	public static void main(String[] args) {
		Assignment_48_7 assignment_48_7 = new Assignment_48_7();
		Integer[] input = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		System.out.println(assignment_48_7.getFreq(input));
	}
}
