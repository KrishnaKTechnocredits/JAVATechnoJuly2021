package neha.assignment_48;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/
public class Program4 {
	void findWordFreq(String inp) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		String[] strSplit = inp.split(" ");
		for (String str : strSplit) {
			if (hm.containsKey(str)) {
				hm.put(str, hm.get(str) + 1);
			} else
				hm.put(str, 1);
		}
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			if (hm.get(key) > 1)
				System.out.println(key + " : " + hm.get(key));
		}
	}

	public static void main(String[] args) {
		Program4 program4 = new Program4();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		program4.findWordFreq(input);
	}
}
