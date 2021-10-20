/*Assignment - 48 : 9th Oct'2021
program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
*/
package shraddha.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequncyOfEachWordInGivenStatement {
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		FrequncyOfEachWordInGivenStatement obj1 = new FrequncyOfEachWordInGivenStatement();
		obj1.getFrequncyOfEachWordInGivenStatement(input);
	}

	void getFrequncyOfEachWordInGivenStatement(String str) {
		System.out.println(str);
		System.out.println("--------------------------------------------------------");
		String[] arr = new String[str.length()];
		arr = str.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		int count = 0;
		for (String temp : arr) {
			if (map.containsKey(temp)) {
				count = map.get(temp);
				map.put(temp, count + 1);
			} else {
				map.put(temp, 1);
			}
		}
		System.out.println(map);
	}
}
