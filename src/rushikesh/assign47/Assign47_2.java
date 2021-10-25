package rushikesh.assign47;

import java.util.LinkedHashMap;
import java.util.Map;

// find frequency of each word from line
//i/p : "hi good morning hello good morning"
//o/p : hi = 1
//	  good = 2
//	  morning = 2
//	  hello = 1

public class Assign47_2 {
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
		String str = "hi good morning hello good morning";
		countStrings(str);
	}

}
