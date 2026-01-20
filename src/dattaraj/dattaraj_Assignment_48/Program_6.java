
package dattaraj.dattaraj_Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_6 {
	
	void findFreqEachWordInString(String input) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] str = input.split(" ");
		System.out.println("The frequency of each word in given string- " + input);
		for(String name : str) {
			if(map.containsKey(name))
				map.put(name, map.get(name)+1);
			else
				map.put(name, 1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		new Program_6().findFreqEachWordInString(input);
	}
}