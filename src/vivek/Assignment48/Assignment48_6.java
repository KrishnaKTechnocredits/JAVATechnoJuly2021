/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/

package vivek.Assignment48;

import java.util.HashMap;

public class Assignment48_6 {

	static void getWordFreq(String[] arr) {
		HashMap<String, Integer> map = new HashMap<>();
		for (String num : arr) {
			if (map.containsKey(num)) {
				int cnt = map.get(num);
				map.put(num, cnt + 1);
			} else {
				map.put(num, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Techno Credits Credits Hi Credits";
		String[] arr = str.split(" ");
		Assignment48_6.getWordFreq(arr);
	}
}
