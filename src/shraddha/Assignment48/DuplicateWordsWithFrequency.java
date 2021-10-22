/*Assignment - 48 : 9th Oct'2021
program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/

package shraddha.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsWithFrequency {
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		DuplicateWordsWithFrequency dp = new DuplicateWordsWithFrequency();
		dp.printDuplicateWordsWithFreq(input);
	}

	void printDuplicateWordsWithFreq(String str) {
		System.out.println(str);
		System.out.println("--------------------------------------------------------");
		String[] arr = new String[str.length()];
		arr = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = 0;
		for (String temp : arr) {
			if (map.containsKey(temp)) {
				count = map.get(temp);
				map.put(temp, count + 1);
			} else {
				map.put(temp, 1);
			}
		}
		System.out.println("=================================================================");
		System.out.println("Duplicate words with their frequency are as follows:- ");
		for (String word : map.keySet()) {
			if (map.get(word) > 1) {
				System.out.println(word + " -> " + map.get(word));
			}
		}

	}
}
