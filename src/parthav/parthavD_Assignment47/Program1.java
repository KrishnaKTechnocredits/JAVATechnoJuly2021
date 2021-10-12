/*Assignment 47 : 6th Oct'2021

Program 1: find frequency of each char from string
	i/p : "varsha"
	o/p : v = 1
		  a = 2
		  r = 1
		  s = 1
		  h = 1*/

package parthav.parthavD_Assignment47;

import java.util.Map;
import java.util.LinkedHashMap;

public class Program1 {

	void printFrequency(String str) {
		char[] inputArr = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char ch : inputArr) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else
				map.put(ch, map.get(ch) + 1);
		}

		System.out.println(map);

	}

	public static void main(String[] args) {
		Program1 newObject = new Program1();
		newObject.printFrequency("varsvhaaa");

	}

}
