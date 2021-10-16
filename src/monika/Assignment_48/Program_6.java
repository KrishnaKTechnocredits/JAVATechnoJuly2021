/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/
package monika.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_6 {

	static void getFreqOfEachWord(String input) {
		String[] str=input.split(" ");
		Map<String, Integer>map=new LinkedHashMap<String, Integer>();
		for(String letter: str) {
			if(map.containsKey(letter))
				map.put(letter, map.get(letter)+1);
			else
				map.put(letter, 1);
		}
		for(String key:map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		
	}
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		getFreqOfEachWord(input);
	}
	
}
