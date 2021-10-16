/*program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/

package vivek.Assignment48;

import java.util.HashMap;

public class Assignment48_8 {

	static void getSecondHighestFreq(String[] arr) {
		HashMap<String, Integer> map = new HashMap<>();
		for (String num : arr) {
			if (map.containsKey(num)) {
				int cnt = map.get(num);
				map.put(num, cnt + 1);
			} else {
				map.put(num, 1);
			}
		}
		String keyMax = "";
		String keySecondmax = "";
		int maxNo = 0;
		int secondMax = 0;
		for (String num : map.keySet()) {
			if (map.get(num) > maxNo) {
				keySecondmax = keyMax;
				keyMax = num;
				secondMax = maxNo;
				maxNo = map.get(num);
			} else if (map.get(num) > secondMax && map.get(num)<maxNo) {
				keySecondmax = num;
				secondMax = map.get(num);
			}
		}
		System.out.println(keySecondmax + "->" + map.get(keySecondmax));
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Techno Credits Hi Credits";
		String[] arr = str.split(" ");
		Assignment48_8.getSecondHighestFreq(arr);
	}
}
