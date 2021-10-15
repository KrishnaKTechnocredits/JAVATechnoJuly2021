/*
 * program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2
 */
package husain.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class Program8 {

	void findFreq(String str) {
		int maxCount = 0;
		int secondMax = 0;
		String output = "";
		String arr[] = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : arr)
			if (map.containsKey(temp))
				map.put(temp, map.get(temp) + 1);
			else
				map.put(temp, 1);

		for (String key : map.keySet()) {
			if (map.get(key) > maxCount) {
				secondMax = maxCount;
				maxCount = map.get(key);

			} else if(secondMax < map.get(key)){
				secondMax = map.get(key);
				output = key;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program8 obj = new Program8();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		obj.findFreq(input);
	}

}
