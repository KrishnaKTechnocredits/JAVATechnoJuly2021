/* Assignment - 48 : 9th Oct'2021
program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2 */

package akanksha_Jain.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_8 {
	
	void findSecondHighestFreqString(String str) {
		int maxFreq = 0, secondMaxFreq = 0;
		String maxFreqWord = "", secondMaxFreqWord = "";
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		System.out.println("The word with second highest frequency in string- " + str);
		String[] s = str.split(" ");
		for(String name : s) {
			if(map.containsKey(name))
				map.put(name, map.get(name)+1);
			else
				map.put(name, 1);
		}
		for(String key: map.keySet()) {
			int freq = map.get(key);
			if(freq > maxFreq) {
				secondMaxFreq = maxFreq;
				secondMaxFreqWord = maxFreqWord;
				maxFreq = freq;
				maxFreqWord = key;
			}
			else {
				secondMaxFreq = freq;
				secondMaxFreqWord = key;
			}
		}
		System.out.println(secondMaxFreqWord + " -> " + secondMaxFreq);
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Techno Credits Hi Credits";
		new Program_8().findSecondHighestFreqString(str);
	}
}