package madhavi;

import java.util.HashMap;
import java.util.LinkedHashMap;

//find the first non repeating word from given string.

public class Assignment_48_9 {
	void getNonRepeatingWord(String input) {
		HashMap<String, Integer> strmap = new LinkedHashMap<String, Integer>();
		String[] strarr = input.split(" ");
		for (String str : strarr) {

			if (strmap.containsKey(str)) {
				strmap.put(str, strmap.get(str) + 1);

			}

			else
				strmap.put(str, 1);
		}
		for (String key : strmap.keySet()) {
			if (strmap.get(key) == 1) {
				System.out.println(key + "->" + strmap.get(key));
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment_48_9 assignment_48_9 = new Assignment_48_9();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		assignment_48_9.getNonRepeatingWord(input);
	}
}