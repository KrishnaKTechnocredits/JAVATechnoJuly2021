/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/
package shalaka.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingWord {
	void getNonRePeatingWord(String input) {
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
				System.out.println("The first non repeating word from given string is: " + key);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		new NonRepeatingWord().getNonRePeatingWord(input);
	}

}
