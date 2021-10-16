/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/

package parthav.parthavD_Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program6 {

	void printFrequencyOfEachWord(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String word : arr) {
			if (!map.containsKey(word))
				map.put(word, 1);
			else
				map.put(word, map.get(word) + 1);
		}

		System.out.println(map);

	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Techno Credits Credits Hi Credits";
		Program6 newObj = new Program6();
		newObj.printFrequencyOfEachWord(str);

	}

}
