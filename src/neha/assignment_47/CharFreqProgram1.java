package neha.assignment_47;

import java.util.HashMap;
import java.util.Map;

/*Program 1: find frequency of each char from string
i/p : "varsha"
o/p : v = 1
	  a = 2
	  r = 1
	  s = 1
	  h = 1*/

public class CharFreqProgram1 {
	void findFreqOfEachCharOfString(String str) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int cnt = 1;
			if (hm.containsKey(ch))
				hm.put(ch, ++cnt); // for multiple occurrence of letter in string
			else
				hm.put(ch, cnt); // for first occurrence of letter in string
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		CharFreqProgram1 charFreq = new CharFreqProgram1();
		String input = "varsha";
		charFreq.findFreqOfEachCharOfString(input);
	}
}
