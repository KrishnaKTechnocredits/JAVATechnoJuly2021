package margi.Assignment_48;

import java.util.LinkedHashMap;

/*print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map*/

public class Assignment_48_3 {

	void getNum(Integer[] input) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (int num : input) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		for (int num : map.keySet()) {
			if (map.get(num) == 1) {
				System.out.print(num + " ");
			}
		}
	}

	public static void main(String[] args) {
		Assignment_48_3 assignment_48_3 = new Assignment_48_3();
		Integer[] input = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		assignment_48_3.getNum(input);
	}
}
