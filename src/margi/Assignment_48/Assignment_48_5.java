package margi.Assignment_48;

import java.util.LinkedHashMap;

/*find the freq of each character in given word.
String input = "technocredits";*/

public class Assignment_48_5 {

	LinkedHashMap<Character, Integer> getFreq(String str) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		char[] arr = str.toCharArray();
		for (char ch : arr) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}
		return map;
	}

	public static void main(String[] args) {
		Assignment_48_5 assignment_48_5 = new Assignment_48_5();
		String input = "technocredits";
		System.out.println(assignment_48_5.getFreq(input));
	}
}
