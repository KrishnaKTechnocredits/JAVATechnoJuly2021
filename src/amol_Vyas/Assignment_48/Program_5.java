/*program 5: find the freq of each character in given word.
String input = "technocredits";*/

package amol_Vyas.Assignment_48;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program_5 {

	static void getFreqOfEachChar(String input) {
		char[] ch = input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap();
		for (char letter : ch) {
			if (map.containsKey(letter)) {
				int cnt = map.get(letter);
				map.put(letter, ++cnt);
			} else
				map.put(letter, 1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		String input = "technocredits";
		getFreqOfEachChar(input);
	}

}
