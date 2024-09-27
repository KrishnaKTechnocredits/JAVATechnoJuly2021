package neha.assignment_48;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/
public class Program6 {
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
			System.out.println(key + " : " + hm.get(key));
		}
	}

	public static void main(String[] args) {
		Program6 program6 = new Program6();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		program6.findWordFreq(input);
	}
}
