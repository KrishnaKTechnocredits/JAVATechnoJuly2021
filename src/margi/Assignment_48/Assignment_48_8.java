package margi.Assignment_48;

import java.util.LinkedHashMap;

/*find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/

public class Assignment_48_8 {

	void secHighestFreq(String input) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String word : input.split(" ")) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		String secMaxWord = "";
		int maxFreq = 0, secMaxFreq = 0;
		for (String word : map.keySet()) {
			if (maxFreq < map.get(word)) {
				secMaxFreq = maxFreq;
				maxFreq = map.get(word);
			} else if (secMaxFreq < map.get(word)) {
				secMaxFreq = map.get(word);
				secMaxWord = word;
			}
		}
		System.out.println(secMaxWord + " -> " + secMaxFreq);
	}

	public static void main(String[] args) {
		Assignment_48_8 assignment_48_8 = new Assignment_48_8();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		assignment_48_8.secHighestFreq(input);
	}
}
