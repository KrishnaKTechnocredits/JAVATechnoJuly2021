/*   Assignment - 48 : 9th Oct'2021
 * Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
 */

package parthav.parthavD_Assignment48;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program2 {

	void findHowManyPairs(Integer[] inputArr) {
		int countOfPairs = 0;
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (Integer num : inputArr) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num) + 1);
			}
		}

		Set<Entry<Integer, Integer>> entrSet = map.entrySet();
		Iterator<Entry<Integer, Integer>> itr = entrSet.iterator();

		while (itr.hasNext()) {
			Entry<Integer, Integer> entr = itr.next();
			countOfPairs += entr.getValue() / 2;

		}
		System.out.println(map);
		System.out.println("The number of sock pairs in the Array are: " + countOfPairs);

	}

	public static void main(String[] args) {
		Program2 newObj = new Program2();
		Integer[] inputArr = {10,3,10,4,7,4,10,3,2,7};
		newObj.findHowManyPairs(inputArr);

	}

}
