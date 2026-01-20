/*find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/

package suruchi.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program9 {

	void printFirstNonRepeatingWord(String input) {
		String[] input1 = input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String word : input1) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else
				map.put(word, 1);
		}
		Set<String> set = map.keySet();
		System.out.println("First non-repeating word in string is: ");
		for (String word : set) {
			if (map.get(word) == 1) {
				System.out.println(word);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Program9 program9 = new Program9();

		String input = "Hi Hello Hi Techno Credits Hi Credits";
		
		System.out.println("String is: " + input);
		program9.printFirstNonRepeatingWord(input);
	}
}