/* Assignment - 48 : 9th Oct'2021
program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap */

package sayli_Vyavhare.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_9 {
	
	static void findFirstNonRepeatWord(String input) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] str = input.split(" ");
		System.out.println("The first non repeating word from given string:" + input);
		for(String name : str) {
			if(map.containsKey(name))
				map.put(name, map.get(name)+1);
			else
				map.put(name, 1);
		}
		for(String key: map.keySet()) {
			if(map.get(key)==1) {
				System.out.println(key + "= " + map.get(key));
				break;
			}
		}
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		findFirstNonRepeatWord(input);
	}
}