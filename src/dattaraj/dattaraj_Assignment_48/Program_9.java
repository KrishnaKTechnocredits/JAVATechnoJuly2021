
package dattaraj.dattaraj_Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_9 {
	
	void findFirstNonRepeatWord(String input) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] str = input.split(" ");
		System.out.println("The first non repeating word from given string- " + input);
		for(String name : str) {
			if(map.containsKey(name))
				map.put(name, map.get(name)+1);
			else
				map.put(name, 1);
		}
		for(String key: map.keySet()) {
			if(map.get(key)==1) {
				System.out.println(key + " -> " + map.get(key));
				break;
			}
		}
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		new Program_9().findFirstNonRepeatWord(input);
	}
}