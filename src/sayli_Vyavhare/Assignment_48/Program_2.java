/* Assignment - 48 : 9th Oct'2021
Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map */

package sayli_Vyavhare.Assignment_48;

import java.util.HashMap;
import java.util.Map;

public class Program_2 {
	
	static void findPairs(int[] input) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int number : input) {
			if(map.containsKey(number))
				map.put(number, map.get(number)+1);
			else
				map.put(number, 1);
		}
		for(int key : map.keySet()) {
			count += map.get(key)/2;
		}
		System.out.println("The number of pairs in array is " + count);
	}

	public static void main(String[] args) {
		int[] input = {10,3,10,4,7,4,10,3,2,7};
		findPairs(input);
	}
}