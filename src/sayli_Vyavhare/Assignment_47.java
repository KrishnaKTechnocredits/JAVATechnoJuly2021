/* Program 1: find frequency of each char from string
            	i/p : "varsha"
            	o/p : v = 1
                            	  a = 2
                            	  r = 1
                            	  s = 1
                            	  h = 1
 
Program 2: find frequency of each word from line
            	i/p : "hi good morning hello good morning"
            	o/p : hi = 1
                            	  good = 2
                            	  morning = 2
                            	  hello = 1

*/
package sayli_Vyavhare;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment_47 {

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

	static void countStrings(String input) {

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] str = input.split(" ");
		for (int index = 0; index < str.length; index++) {
			String s = str[index];
			if (map.containsKey(s)) {

				int count = map.get(s);
				map.put(s, count + 1);
			} else {
				map.put(s, 1);
			}

		}
		System.out.println("frequency of each word from line:"+map);

	}

	public static void main(String[] args) {
		System.out.println("frequency of each char from string:" + countChar("Varsha"));
		String str = "hi good morning hello good morning";
		countStrings(str);

	}

}
