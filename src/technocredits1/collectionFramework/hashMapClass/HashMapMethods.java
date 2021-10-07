package technocredits1.collectionFramework.hashMapClass;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		String s = "vivekk";
		String line = "hi good morning hello good morning";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				int cnt = map.get(ch);
				map.put(ch, ++cnt);
			} else {
				map.put(ch, 1);
			}
		}

		System.out.println(map);
		// map.isEmpty()
		// map.clear();
		// map.get("");
		// System.out.println(map.get(null));
		// System.out.println(map.containsValue("null"));
		// map.containsKey("")

		// System.out.println(map.put(1, "vivek"));
		// System.out.println(map.put(1, "harsh"));

		// System.out.println(map);

	}
}
