
package dattaraj.dattaraj_Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_5 {
	
	void findEachLetterFreq(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		System.out.println("The frequency of each letter in given word- " + str);
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		String str = "technocredits";
		new Program_5().findEachLetterFreq(str);
	}
}