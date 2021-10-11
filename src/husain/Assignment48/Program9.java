/*
 * program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap
 */
package husain.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program9 {

	void findNonRepeatingWord(String str) {
		String arr[] = str.split(" ");
		String output = "";
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String temp : arr) {
			if (map.containsKey(temp))
				map.put(temp, map.get(temp) + 1);
			else
				map.put(temp, 1);

		}

		for (String key : map.keySet())
			if (map.get(key) == 1) {
				output = key;
				break;
			}

		System.out.println("The first non-reeating word in the given string \"" + str + "\" is " + output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		Program9 obj = new Program9();
		obj.findNonRepeatingWord(input);

	}

}
