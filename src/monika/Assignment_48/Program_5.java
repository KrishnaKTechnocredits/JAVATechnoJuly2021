/*program 5: find the freq of each character in given word.
String input = "technocredits";*/
package monika.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_5 {

	static void getFreqOfEachChar(String input) {

		char[] ch=input.toCharArray();
		Map<Character, Integer>map=new LinkedHashMap<Character, Integer>();
		for(Character ch1:ch) {
			if(map.containsKey(ch1))
				map.put(ch1, map.get(ch1)+1);
			else
				map.put(ch1, 1);
			
		}
		for(Character key:map.keySet())
			System.out.println(key+":"+map.get(key));
	}
	public static void main(String[] args) {
		String input = "technocredits";
		getFreqOfEachChar(input);
	}
}
