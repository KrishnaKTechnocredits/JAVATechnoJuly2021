
package dattaraj.dattaraj_Assignment_48;

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