package rushikesh.assign47;

import java.util.HashMap;
import java.util.Map;

// find frequency of each char from string
//i/p : "varsha"
//o/p : v = 1
//	  a = 2
//	  r = 1
//	  s = 1
//	  h = 1

public class Assign47_1 {
	static Map<Character, Integer> countChar(String input) {

		Map<Character, Integer> output = new HashMap<Character, Integer>();

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (output.containsKey(ch)) {
				int count = output.get(ch);
				output.put(ch, ++count);

			} else
				output.put(ch, 1);

		}
		return output;

	}
	public static void main(String[] args) {
		System.out.println("frequency of each char from string:" + countChar("Varsha"));
	}
}
