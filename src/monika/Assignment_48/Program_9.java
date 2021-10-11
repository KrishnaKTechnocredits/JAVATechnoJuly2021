/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/
package monika.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_9 {
	static void getFirstNonRepeatingWord(String input) {
		String[] str = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String letter : str) {
			if (map.containsKey(letter))
				map.put(letter, map.get(letter) + 1);
			else
				map.put(letter, 1);
		}
		for (String key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.println(key);
				break;
			}
		}
	}
	public static void main(String[] args) {
	
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		getFirstNonRepeatingWord(input);
				
	}
}
