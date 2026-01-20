/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/

package amol_Pawar.assignment_48;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Program_9 {

	void getFirstNonRepeatingWord(String input) {
		Map<String, Integer> mapList = new LinkedHashMap<String, Integer>();
		String str[] = input.split(" ");
		for (int index = 0; index < str.length; index++) {
			String word = str[index];
			if (mapList.containsKey(word)) {
				mapList.put(word, mapList.get(word) + 1);
			} else {
				mapList.put(word, 1);
			}
		}
		System.out.println(mapList);
		Set<String> set = mapList.keySet();
		for (String word : set) {
			if (mapList.get(word) == 1) {
				System.out.println(word);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Program_9 program_9 = new Program_9();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		program_9.getFirstNonRepeatingWord(input);

	}

}
