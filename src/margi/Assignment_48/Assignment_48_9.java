package margi.Assignment_48;

import java.util.LinkedHashMap;

/*find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/

public class Assignment_48_9 {

	String getNonRepeating(String input) {
		String output = "";
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String word : input.split(" ")) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		for (String word : map.keySet()) {
			if (map.get(word) == 1) {
				output = word;
				break;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_48_9 assignment_48_9 = new Assignment_48_9();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		System.out.println("First Non repeating word: " + assignment_48_9.getNonRepeating(input));
	}
}
