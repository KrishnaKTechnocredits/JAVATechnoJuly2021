/*Assignment - 48 : 9th Oct'2021
program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap
*/
package shraddha.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingWord {
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		FirstNonRepeatingWord obj = new FirstNonRepeatingWord();
		obj.getFirstNonRepeatingWord(input);
	}

	void getFirstNonRepeatingWord(String str) {
		System.out.println(str);
		System.out.println("--------------------------------------------------------");
		String[] arr = new String[str.length()];
		arr = str.split(" ");
		int count = 0;
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String temp : arr) {
			if (map.containsKey(temp)) {
				count = map.get(temp);
				map.put(temp, count + 1);
			} else {
				map.put(temp, 1);
			}
		}
		System.out.println("First Non Repeating word in above input is :- ");
		for (String word : map.keySet()) {
			if (map.get(word) == 1) {
				System.out.print(word);
				break;
			}
		}
	}
}
