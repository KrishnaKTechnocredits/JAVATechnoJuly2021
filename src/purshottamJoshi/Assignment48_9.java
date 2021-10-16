/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/
package purshottamJoshi;

import java.util.LinkedHashMap;

public class Assignment48_9 {

	
	void getFirstNonRepeatingWord(String input) {
		String[] output = input.split(" ");
		String firstNonRepeatWord="";
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for(String input1 : output) {
			if(map.containsKey(input1)) {
				map.put(input1, map.get(input1)+1);
			}else {
				map.put(input1, 1);
			}
			
		}
		for(String output2 : map.keySet() ) {
			if(map.get(output2) == 1) {
				firstNonRepeatWord= output2;
				break;
			}
		}
		System.out.println(firstNonRepeatWord);
	}
	
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		new Assignment48_9().getFirstNonRepeatingWord(input);
	}
}
