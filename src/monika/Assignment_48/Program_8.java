/*program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/
package monika.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_8 {

	static void getSecondHighestFreqWord(String input) {
		String[] str = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String highFreqWord = "", secondFreqWord = "";
		int firstHighest = 0, secondHighest = 0;
		for (String letter : str) {
			if (map.containsKey(letter))
				map.put(letter, map.get(letter) + 1);
			else
				map.put(letter, 1);
		}
		for (String key : map.keySet()) {
			int freq = map.get(key);
			if (freq > firstHighest) {
				secondHighest = firstHighest;
				secondFreqWord = highFreqWord;
				firstHighest = freq;
				highFreqWord = key;
			} else if (freq != firstHighest && freq > secondHighest) {
				secondHighest = freq;
				secondFreqWord = key;
			}
		}
		System.out.println(secondFreqWord + ":" + secondHighest);
	}
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		getSecondHighestFreqWord(input);
		
	}
}
