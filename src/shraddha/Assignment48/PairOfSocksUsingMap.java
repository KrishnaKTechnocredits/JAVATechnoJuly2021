/*Assignment - 48 : 9th Oct'2021
Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map

if(hm.containsKey(key))
	hm.put(key, hm.get(key)+1);
else
	hm.put(key,1);
*/
package shraddha.Assignment48;

import java.util.Arrays;
import java.util.HashMap;

public class PairOfSocksUsingMap {
	public static void main(String[] args) {
		int[] input = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		System.out.println(Arrays.toString(input));
		PairOfSocksUsingMap obj1 = new PairOfSocksUsingMap();
		System.out.println("Pair of socks found from above array is :- " + obj1.getSocksPairCount(input));
	}

	int getSocksPairCount(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int count = 0;
		for (Integer key : arr) {
			if (hm.containsKey(key)) {
				hm.put(key, hm.get(key) + 1);
			} else {
				hm.put(key, 1);
			}
		}
		for (Integer temp : hm.keySet()) {
			if (hm.get(temp) >= 2) {
				count = count + hm.get(temp) / 2;
			}
		}
		return count;
	}
}
