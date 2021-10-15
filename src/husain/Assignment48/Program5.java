/*
 * program 5: find the freq of each character in given word.
String input = "technocredits";
 */
package husain.Assignment48;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program5 {

	void findFreq(String str) {

		Map<Character, Integer> map = new TreeMap<Character, Integer>();

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}

		System.out.println("The frequency of each letters in the given word \"" + str + "\" is " + map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "technocredits";
		Program5 obj = new Program5();
		obj.findFreq(input);

	}

}
