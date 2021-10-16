/*Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map*/
package monika.Assignment_48;

import java.util.HashMap;
import java.util.Map;

public class Program_2 {
	static int getNumbrOfPairs(int[] input) {
		
	
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		int pair=0;
		for(int num : input) {
			if(map.containsKey(num))
				map.put(num, map.get(num)+1);
			else
				map.put(num, 1);
		}
		for(int key: map.keySet())
			pair+=map.get(key)/2;
		return pair;
	}	
	public static void main(String[] args) {
		int[] input = {10,3,10,4,7,4,10,3,2,7};
		System.out.println(getNumbrOfPairs(input));
	}
}
