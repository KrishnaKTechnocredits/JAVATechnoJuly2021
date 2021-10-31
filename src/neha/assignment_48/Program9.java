package neha.assignment_48;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/
public class Program9 {
	void findFirstNonRepeatingWord(String inp) {
		Map<String, Integer> hm = new LinkedHashMap<String, Integer>();
		String[] strSplit = inp.split(" ");
		for (String str : strSplit) {
			if (hm.containsKey(str)) {
				hm.put(str, hm.get(str) + 1);
			} else
				hm.put(str, 1);
		}
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			if (hm.get(key) == 1) {
				System.out.println(key);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Program9 program9 = new Program9();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		program9.findFirstNonRepeatingWord(input);
	}
}
