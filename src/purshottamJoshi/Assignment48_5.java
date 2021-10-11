/*program 5: find the freq of each character in given word.
String input = "technocredits";*/

package purshottamJoshi;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class Assignment48_5 {

	void getCharFrequency(String input) {
		char[] ch = input.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(Character chr: ch) {
			if(map.containsKey(chr)) {
				map.put(chr, map.get(chr)+1);
			}else {
				map.put(chr, 1);
			}
		}
		
		System.out.println(map);
 	}
	
	public static void main(String[] args) {
		String input = "technocredits";
		new Assignment48_5().getCharFrequency(input);
	}
}