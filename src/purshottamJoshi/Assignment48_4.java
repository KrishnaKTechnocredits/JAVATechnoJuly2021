/*program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/
package purshottamJoshi;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Assignment48_4 {

	void getDuplicateWords(String[] input) {
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		for(String number: input) {
			if(map.containsKey(number)) {
				map.put(number, map.get(number)+1);
			}else {
				map.put(number, 1);
			}
		}
		List<String> ll = new LinkedList<>();
		for(String key: map.keySet()) {
			if(map.get(key) >1) {
				ll.add(key);
			}
		}
		System.out.println(ll);
		System.out.println(map);
		
	}
	
	public static void main(String[] args) {
		String[] input = {"Hi", "Hello", "Hi", "Techno", "Credits", "Credits", "Hi", "Credits"};
		new Assignment48_4().getDuplicateWords(input);
	}
}
