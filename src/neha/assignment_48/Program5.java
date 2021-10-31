package neha.assignment_48;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*program 5: find the freq of each character in given word.
String input = "technocredits";*/
public class Program5 {
	void findCharacterFreq(String inp) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] charArr = inp.toCharArray();
			for (char ch : charArr) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else
				hm.put(ch, 1);
		}
		Set<Character> keys = hm.keySet();
		for (Character key : keys) {
			System.out.println(key+" : "+hm.get(key));
		}
	}

	public static void main(String[] args) {
		Program5 program5 = new Program5();
		String input = "technocredits";
		program5.findCharacterFreq(input);
	}
}
