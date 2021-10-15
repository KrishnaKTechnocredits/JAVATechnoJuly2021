/*Program 1: find frequency of each char from string
	i/p : "varsha"
	o/p : v = 1
		  a = 2
		  r = 1
		  s = 1
		  h = 1
*/

package vivek.Assignment47;

import java.util.LinkedHashMap;

public class Assignment47_1 {

	static void getCharFrequency(String str) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (map.containsKey(ch)) {
				int cnt = map.get(ch);
				map.put(ch, ++cnt);
			} else
				map.put(ch, 1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		String str = "vivek";
		Assignment47_1.getCharFrequency(str);
	}
}
