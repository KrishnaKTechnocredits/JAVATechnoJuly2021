/*print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/

package suruchi.Assignment48;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program4 {

	void getDuplicateWords(String input) {
		String[] input1 = input.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String word : input1) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else
				map.put(word, 1);
		}
		Set<String> set = map.keySet();
		System.out.println("Duplicate words with their frequencies: ");
		for (String word : set) {
			if (map.get(word) > 1)
				System.out.println(word + " -> " + map.get(word));
		}
	}

	public static void main(String[] args) {
		Program4 program4 = new Program4();

		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";

		System.out.println("String is: " + input);
		program4.getDuplicateWords(input);
	}
}