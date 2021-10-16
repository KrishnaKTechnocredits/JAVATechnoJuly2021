/* program 5: find the freq of each character in given word.
String input = "technocredits";*/

package parthav.parthavD_Assignment48;

import java.util.Map;
import java.util.LinkedHashMap;

public class Program5 {

	void printFrequencyOfEachCharacter(String inputStr){
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (int index = 0; index < inputStr.length();index++){
			char ch = inputStr.charAt(index);
			
			if(!map.containsKey(ch)){
				map.put(ch, 1);
			}
			else
				map.put(ch, map.get(ch) + 1);
		}
		
		System.out.println(map);
	}

	public static void main(String[] args) {
		Program5 newObj = new Program5();
		String str = "technocredits";
		newObj.printFrequencyOfEachCharacter(str);

	}

}
