/*program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/

package amol_Vyas.Assignment_48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program_4 {

	static void getDuplicateWords(String input) {
		int output = 0;
		String[] input1 = input.split(" ");
		Map<String, Integer> map = new HashMap();
		for (String word : input1) {
			if (map.containsKey(word)) {
				int cnt = map.get(word);
				map.put(word, ++cnt);
			} else
				map.put(word, 1);
		}
		Set<String> set = map.keySet();
		for (String word : set) {
			if (map.get(word) > 1)
				System.out.println(word + " " + map.get(word));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		getDuplicateWords(input);

	}

}
