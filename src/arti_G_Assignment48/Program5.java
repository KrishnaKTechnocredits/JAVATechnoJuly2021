package arti_G_Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

/*program 5: find the freq of each character in given word.
String input = "technocredits";*/
public class Program5 {

	void printFrequencyOfEachCharacter(String input) {
		char[] chars = input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(Character ch : chars) {
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else 
				map.put(ch, 1);
		}
		for(Character key : map.keySet()) {
			System.out.println(key + ":"+map.get(key));
		}
	}
	public static void main(String[] args) {
		Program5 p5 = new Program5();
		String input = "technocredits";
		p5.printFrequencyOfEachCharacter(input);
		
	}

}
