/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/

package purshottamJoshi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment48_6 {

	Map<String, Integer> getWordFreq(String input){
		String[] output=input.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(String str : output) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}else {
				map.put(str, 1);
			}
		}
		
		return map;
		
	}
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		System.out.println(new Assignment48_6().getWordFreq(input));
	}
}
