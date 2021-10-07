/* Assignment 47 : 6th Oct'2021
Program 1: find frequency of each char from string
i/p : "varsha"
o/p : v = 1 a = 2  r = 1 s = 1 h = 1 */

package akanksha_Jain.Assignment_47;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_1 {

	public static void main(String[] args) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		String s = "varsha";
		for(int index=0; index<s.length(); index++) {
			char ch = s.charAt(index);
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println("Frequency of each char from string '" + s + "'- "+ map);
	}
}