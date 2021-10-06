package margi.Assignment_47;

import java.util.HashMap;

/*Program 1: find frequency of each char from string
i/p : "varsha"
o/p : v = 1
	  a = 2
	  r = 1
	  s = 1
	  h = 1*/

public class Assignment_47_1 {

	HashMap<Character,Integer> getFreq(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, ++count);
			}
			else
				map.put(ch, 1);
		}
		return map;
	}

	public static void main(String[] args) {
		Assignment_47_1 assignment_47_1 = new Assignment_47_1();
		String str = "varsha";
		System.out.println(assignment_47_1.getFreq(str));
	}
}
