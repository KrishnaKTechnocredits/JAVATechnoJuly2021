package aniket;

import java.util.LinkedHashMap;

public class Assignment_47_1 {
	
	void findFrequency() {

		String str = "nitin";
		char ch[] = str.toCharArray();
		LinkedHashMap<Character, Integer> lmap = new LinkedHashMap<>();
		for (char c : ch) {
			if (lmap.containsKey(c)) {
				lmap.put(c, lmap.get(c) + 1);
			} else
				lmap.put(c, 1);
		}

		System.out.print(lmap);
	}

	public static void main(String[] args) {
		Assignment_47_1 a47_1 = new Assignment_47_1();
		a47_1.findFrequency();
	}
}
