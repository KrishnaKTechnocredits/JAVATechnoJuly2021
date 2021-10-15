/* Assignment - 48 : 9th Oct'2021
program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3 */

package akanksha_Jain.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_4 {

	void printDuplicateWordsWithFreq(String str) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] arr = str.split(" ");
		for(int index=0; index<arr.length; index++) {
			String newStr = arr[index];
			if(map.containsKey(newStr))
				map.put(newStr, map.get(newStr)+1);
			else
				map.put(newStr, 1);
		}
		System.out.println("All duplicate words with frequency in given string- " + str);
		for(String s : map.keySet()) {
			if(map.get(s)>1)
				System.out.println(s + " -> " + map.get(s));
		}
	}
	
	public static void main(String[] args) {
		String str = "Hi Hello Hi Techno Credits Credits Hi Credits";
		new Program_4().printDuplicateWordsWithFreq(str);
	}
}