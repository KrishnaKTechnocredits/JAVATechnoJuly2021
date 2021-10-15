/*program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/

package amol_Vyas.Assignment_48;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program_8 {

	static void getSecondHighestWordWithFreq(String input) {
		String[] word = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap();
		for (String letter : word) {
			if (map.containsKey(letter)) {
				int cnt = map.get(letter);
				map.put(letter, ++cnt);
			} else
				map.put(letter, 1);
		}
		Set<String> set = map.keySet();
		int firstHighest = 0, secondHighest = 0;
		String key = null;
		for (String word1 : set) {
			if (map.get(word1) > firstHighest) {
				secondHighest = firstHighest;
				firstHighest = map.get(word1);
			} else if (map.get(word1) > secondHighest && secondHighest < firstHighest) {
				secondHighest = map.get(word1);
				key = word1;
			}
		}
		System.out.println(key + " " + secondHighest);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		getSecondHighestWordWithFreq(input);
	}

}
