/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/

package bhaktik_Assignment_48;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Assignment_48_9_nonRep {

	// Method 1 using string []
	static void findNonRepetating(String input) {
		String[] input1 = input.split(" ");
		String str1 = "";
		for (String str : input1) {
			if (input.indexOf(str) == input.lastIndexOf(str)) {
				str1 = str;
				break;
			}
		}
		System.out.println(str1);
	}
	
	//Method 2 USing LinkedHasMap
	
	static void findNonRepeHashMap(String input) {
		String[] input1 = input.split(" ");
		LinkedHashMap<String, Integer> hm= new LinkedHashMap();
		for (String str: input1 ) {
			if (hm.containsKey(str)) {
				int n= hm.get(str);
				hm.put(str,++n);
			}else 
				hm.put(str, 1);
		}
		for (Entry<String, Integer> s: hm.entrySet()) {
			if (s.getValue()==1) {
				System.out.println(s.getKey());
				break;
			}	
			
		}		
			
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		findNonRepetating(input);
		findNonRepeHashMap(input);
		
	}

}
