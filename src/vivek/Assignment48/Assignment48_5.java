/*program 5: find the freq of each character in given word.
String input = "technocredits";*/

package vivek.Assignment48;

import java.util.LinkedHashMap;

public class Assignment48_5 {

	static void findCharFreq(char[] arr) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (char letter : arr) {
			if (map.containsKey(letter)) {
				int cnt = map.get(letter);
				map.put(letter, cnt + 1);
			} else {
				map.put(letter, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		String input = "technocredits";
		char[] arr = input.toCharArray();
		Assignment48_5.findCharFreq(arr);
	}
}
