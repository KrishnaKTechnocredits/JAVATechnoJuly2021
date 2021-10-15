package margi.Assignment_48;

import java.util.LinkedHashMap;

/*print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/

public class Assignment_48_4 {

	void getDuplicateWord(String input) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String str : input.split(" ")) {
			if (map.containsKey(str))
				map.put(str, map.get(str) + 1);
			else
				map.put(str, 1);
		}
		for (String str : map.keySet()) {
			if (map.get(str) > 1)
				System.out.println(str + " -> " + map.get(str));
		}
	}

	public static void main(String[] args) {
		Assignment_48_4 assignment_48_4 = new Assignment_48_4();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		assignment_48_4.getDuplicateWord(input);
	}
}
