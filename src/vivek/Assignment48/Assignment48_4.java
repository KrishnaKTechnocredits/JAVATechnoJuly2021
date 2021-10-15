/*program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/

package vivek.Assignment48;

import java.util.HashMap;

public class Assignment48_4 {

	static void getDuplicateWordFreq(String[] arr) {
		HashMap<String, Integer> map = new HashMap<>();
		for (String num : arr) {
			if (map.containsKey(num)) {
				int cnt = map.get(num);
				map.put(num, cnt + 1);
			} else {
				map.put(num, 1);
			}
		}
		for (String num : map.keySet()) {
			if (map.get(num) != 1)
				System.out.println(num + "->" + map.get(num));
		}
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Techno Credits Credits Hi Credits";
		String[] arr = str.split(" ");
		Assignment48_4.getDuplicateWordFreq(arr);
	}
}
