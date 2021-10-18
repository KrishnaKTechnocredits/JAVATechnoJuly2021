package arti_G_Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/
public class Program9 {

	void printFirstNonRepeatingWord(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		for (String key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.println(key);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Program9 p9 = new Program9();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		p9.printFirstNonRepeatingWord(input);
	}

}
