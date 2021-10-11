/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map*/

package amol_Vyas.Assignment_48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program_3 {

	static void getUniqueNumbers(Integer[] input) {
		int output = 0;
		Map<Integer, Integer> map = new HashMap();
		for (int num : input) {
			if (map.containsKey(num)) {
				int cnt = map.get(num);
				map.put(num, ++cnt);
			} else
				map.put(num, 1);
		}
		Set<Integer> set = map.keySet();
		for (int num : set) {
			if (map.get(num) == 1)
				System.out.println(num);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		getUniqueNumbers(input);

	}

}
