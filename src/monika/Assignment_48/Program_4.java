/*program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/
package monika.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_4 {
	
	static void getDupliateWordWithFreq(String input) {
		String[] str=input.split(" ");
		Map<String, Integer> map=new LinkedHashMap<String, Integer>();
		for(String letter: str) {
			if(map.containsKey(letter))
				map.put(letter, map.get(letter)+1);
			else
				map.put(letter,1);
		}
		System.out.println("Dupliate Word With Frequency:");
		for(String key: map.keySet()) {
			if(map.get(key)>1)
				System.out.println(key+":"+map.get(key));
		}
	}
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		getDupliateWordWithFreq(input);
	}

}
