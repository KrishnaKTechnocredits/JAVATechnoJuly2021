/*
 * program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3
 */
package husain.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class Program4 {

	void printDuplicates(String input) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String arr[] = input.split(" ");

		for (String str : arr)
			if (map.containsKey(str))
				map.put(str, map.get(str) + 1);
			else
				map.put(str, 1);

		System.out.println("The list of duplicate words and their frequency in the given string \"" + input + "\" is ");
		for (String key : map.keySet())
			if (map.get(key) > 1)
				System.out.println(key + " : " + map.get(key));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		Program4 obj = new Program4();
		obj.printDuplicates(input);
	}

}
