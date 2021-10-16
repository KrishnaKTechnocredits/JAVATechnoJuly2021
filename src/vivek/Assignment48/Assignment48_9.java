/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/

package vivek.Assignment48;

import java.util.LinkedHashMap;

public class Assignment48_9 {

	static void getFirstNonRepeatingWord(String[] arr) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String num : arr) {
			if (map.containsKey(num)) {
				int cnt = map.get(num);
				map.put(num, cnt + 1);
			} else {
				map.put(num, 1);
			}
		}
		for (String num : map.keySet()) {
			if (map.get(num) == 1) {
				System.out.println(num);
				break;
			}
		}
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Techno Credits Hi Credits";
		String[] arr = str.split(" ");
		Assignment48_9.getFirstNonRepeatingWord(arr);
	}
}
