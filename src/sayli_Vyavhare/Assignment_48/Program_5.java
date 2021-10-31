/*program 5: find the freq of each character in given word.
String input = "technocredits";*/

package sayli_Vyavhare.Assignment_48;

import java.util.HashMap;
import java.util.Map;

public class Program_5 {
	static void getFrequencyOfChar(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, ++count);

			} else {
				map.put(ch, 1);
			}
		}
		System.out.println("freq of each character in given word:" + map);
	}

	public static void main(String[] args) {
		getFrequencyOfChar("technocredits");
	}

}
