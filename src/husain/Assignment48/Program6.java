/*
 * program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
 */
package husain.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class Program6 {

	void findFreq(String str) {
		String arr[] = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : arr)
			if (map.containsKey(temp))
				map.put(temp, map.get(temp) + 1);
			else
				map.put(temp, 1);
		System.out.println("The frequency of each word in the given string \"" + str + "\" is " + map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program6 obj = new Program6();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		obj.findFreq(input);
	}

}
