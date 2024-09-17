
package dattaraj.dattaraj_Assignment_48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program_2 {
	
	void findPairs(int[] input) {
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
		System.out.println("The number of pairs in " + Arrays.toString(input) + " array is " + count);
	}

	public static void main(String[] args) {
		int[] input = {10,3,10,4,7,4,10,3,2,7};
		new Program_2().findPairs(input);
	}
}