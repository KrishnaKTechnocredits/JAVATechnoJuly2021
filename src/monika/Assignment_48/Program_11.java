/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/
package monika.Assignment_48;

import java.util.HashMap;
import java.util.Map;

public class Program_11 {

	static void getDuplicateNumber(int[] input) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int number : input) {
			if (map.containsKey(number))
				map.put(number, map.get(number) + 1);
			else
				map.put(number, 1);
		}
		for (int key : map.keySet()) {
			if (map.get(key) > 1)
				System.out.println(key + " :" + map.get(key));
		}
	}
	public static void main(String[] args) {
		int[] input= {1,2,3,5,4,7,3,5,2,1,3,2,3};
		getDuplicateNumber(input);
	}
}
