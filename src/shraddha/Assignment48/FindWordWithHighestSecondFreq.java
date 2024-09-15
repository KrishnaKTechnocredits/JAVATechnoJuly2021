/*Assignment - 48 : 9th Oct'2021
program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/

package shraddha.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindWordWithHighestSecondFreq {
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		FindWordWithHighestSecondFreq obj = new FindWordWithHighestSecondFreq();
		obj.getWordWithHighestSecondFreq(input);
	}

	void getWordWithHighestSecondFreq(String str) {
		System.out.println(str);
		System.out.println("--------------------------------------------------------");
		String[] arr = new String[str.length()];
		arr = str.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		int count = 0;
		int maxCount = 0;
		int secondMax = 0;
		String secondMaxWord = " ";
		for (String temp : arr) {
			if (map.containsKey(temp)) {
				count = map.get(temp);
				map.put(temp, count + 1);
			} else {
				map.put(temp, 1);
			}
		}

		for (String word : map.keySet()) {
			if (maxCount < map.get(word)) {
				secondMax = maxCount;
				maxCount = map.get(word);
			} else if (secondMax < map.get(word) && secondMax < maxCount) {
				secondMax = map.get(word);
				secondMaxWord = word;
			}
		}
		System.out.println(secondMaxWord + " -> " + secondMax);

	}
}
