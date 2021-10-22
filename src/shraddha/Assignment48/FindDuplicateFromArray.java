/*Assignment - 48 : 9th Oct'2021
program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.
*/
package shraddha.Assignment48;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateFromArray {
	public static void main(String[] args) {
		Integer[] arr = { 2, 4, 5, 6, 8, 2, 4, 6, 8, 3, 6, 9, 1 };
		FindDuplicateFromArray obj = new FindDuplicateFromArray();
		obj.getDuplicateFromArray(arr);
	}

	void getDuplicateFromArray(Integer[] arr) {
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------------------------------------------");
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		int count = 0;
		for (Integer temp : arr) {
			if (map.containsKey(temp)) {
				count = map.get(temp);
				map.put(temp, count + 1);
			} else {
				map.put(temp, 1);
			}
		}
		System.out.println("Duplicate Entries From above Input are :-");
		for (Integer num : map.keySet()) {
			if (map.get(num) > 1) {
				System.out.print("  " + num);
			}
		}
	}
}
