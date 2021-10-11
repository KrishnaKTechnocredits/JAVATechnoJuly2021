package monali.Assignment_48;

import java.util.Arrays;
import java.util.HashMap;

/*Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map
*/
public class Program2 {

	void getSocksPairs(Integer[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int pairs = 0;
		for (int number : arr) {
			if (map.containsKey(number)) {
				map.put(number, map.get(number) + 1);
			} else
				map.put(number, 1);
		}
		System.out.println(map);
		for (int number : map.keySet()) {
			pairs = pairs + map.get(number) / 2;

		}
		System.out.println(pairs);

	}

	public static void main(String[] args) {
		Integer arr[] = { 10, 30, 20, 40, 19, 10, 40, 10, 19 };
		Program2 p2 = new Program2();
		p2.getSocksPairs(arr);
	}
}
