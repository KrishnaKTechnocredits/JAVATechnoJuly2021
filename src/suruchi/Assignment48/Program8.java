/*find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/

package suruchi.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program8 {

	void getSecondHighestWordWithFreq(String input) {
		String[] input1 = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String word : input1) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else
				map.put(word, 1);
		}
		Set<String> set = map.keySet();
		int firstHighest = 0, secondHighest = 0;
		String key = "";
		for (String word : set) {
			if (map.get(word) > firstHighest) {
				secondHighest = firstHighest;
				firstHighest = map.get(word);
			} else if (map.get(word) != firstHighest && map.get(word) > secondHighest) {
				secondHighest = map.get(word);
				key = word;
			}
		}
		System.out.println("Second highest word with frequency: ");
		System.out.println(key + " -> " + secondHighest);
	}

	public static void main(String[] args) {
		Program8 program8 = new Program8();

		String input = "Hi Hello Hi Techno Credits Hi Credits";

		System.out.println("String is: " + input);
		program8.getSecondHighestWordWithFreq(input);
	}
}