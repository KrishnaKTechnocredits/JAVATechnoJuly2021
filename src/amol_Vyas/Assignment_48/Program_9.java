/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/

package amol_Vyas.Assignment_48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program_9 {

	static void getFirstNonRepitativeWords(String input1) {
		String[] input = input1.split(" ");
		Map<String, Integer> map = new LinkedHashMap();
		for (String word : input) {
			if (map.containsKey(word)) {
				int cnt = map.get(word);
				map.put(word, ++cnt);
			} else
				map.put(word, 1);
		}
		Set<String> set = map.keySet();
		for (String word : set) {
			if (map.get(word) == 1) {
				System.out.println(word);
				break;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		getFirstNonRepitativeWords(input);

	}

}
