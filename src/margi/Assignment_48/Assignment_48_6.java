package margi.Assignment_48;

import java.util.LinkedHashMap;

/*find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/

public class Assignment_48_6 {

	LinkedHashMap<String, Integer> getFreq(String str) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String word : str.split(" ")) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		return map;
	}

	public static void main(String[] args) {
		Assignment_48_6 assignment_48_6 = new Assignment_48_6();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		System.out.println(assignment_48_6.getFreq(input));
	}
}
