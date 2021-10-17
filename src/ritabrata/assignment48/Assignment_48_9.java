/*Assignment - 48 : 9th Oct'2021
Program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/


package ritabrata.assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment_48_9 {
	void getNonRepeat(String input) {
		String[] str = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String word : str) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}

		for (String key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.println("The first non repeating is: " + key);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment_48_9 nonRepeat= new Assignment_48_9();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		nonRepeat.getNonRepeat(input);
	}
}
