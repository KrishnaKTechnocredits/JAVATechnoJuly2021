package monali.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/

public class Program9 {

	void getFirstNonRepeatingWord(String input) {
		String words[] = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();

		for (String word : words) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		for (String word : map.keySet()) {
			if (map.get(word) == 1) {
				System.out.println(word + "--> first Nonrepearting word");
				break;
			}
		}
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi";
		Program9 p9 = new Program9();
		p9.getFirstNonRepeatingWord(input);
	}

}
