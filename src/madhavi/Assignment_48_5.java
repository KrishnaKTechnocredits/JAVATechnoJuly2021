package madhavi;

import java.util.Map;
//find the freq of each character in given word.
import java.util.TreeMap;

public class Assignment_48_5 {
	void getFreqOfCharacter(String input) {
		Map<Character, Integer> map = new TreeMap<Character, Integer>();

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);

		}
		System.out.println(input + "->" + map);
	}

	public static void main(String[] args) {
		Assignment_48_5 assignment_48_5 = new Assignment_48_5();
		String input = "technocredits";
		assignment_48_5.getFreqOfCharacter(input);

	}
}
