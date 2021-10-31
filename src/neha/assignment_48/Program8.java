package neha.assignment_48;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/
public class Program8 {
	void findWordWithSecondHighestFreq(String inp) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		String secondHighestFreqWord = "";
		int secondHighestFreq = 0;
		String highestFreqWord = "";
		int highestFreq = 0;
		String[] strSplit = inp.split(" ");
		for (String str : strSplit) {
			if (hm.containsKey(str)) {
				hm.put(str, hm.get(str) + 1);
			} else
				hm.put(str, 1);
		}
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			// System.out.println(key + " : " + hm.get(key));
			if (highestFreq < hm.get(key)) {
				highestFreqWord=key;
				highestFreq=hm.get(key);
			} else if (secondHighestFreq < hm.get(key)) {
				secondHighestFreqWord=key;
				secondHighestFreq=hm.get(key);
			}
		}
		System.out.println(secondHighestFreqWord+" : "+secondHighestFreq);
	}

	public static void main(String[] args) {
		Program8 program8 = new Program8();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		program8.findWordWithSecondHighestFreq(input);
	}
}
