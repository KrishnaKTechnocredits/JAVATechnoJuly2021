package monali.Assignment_48;
/*program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/

import java.util.LinkedHashMap;
import java.util.Map;

public class Program4 {

	void getDuplicateWordWithFreq(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String word : words) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		System.out.println(map);
		for (String key : map.keySet()) {
			if (map.get(key) > 1)
				System.out.println(key + " - " + map.get(key));
		}

	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		Program4 p4 = new Program4();
		p4.getDuplicateWordWithFreq(input);
	}

}
