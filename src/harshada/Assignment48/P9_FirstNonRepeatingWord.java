/* program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap */

package harshada.Assignment48;

import java.util.LinkedHashMap;

public class P9_FirstNonRepeatingWord {
	
	
	void getFirstNonRepeatingWord(String input) {
		
		String str[]=input.split(" ");
		LinkedHashMap<String, Integer> map=new LinkedHashMap();
		for(String s:str ) {
			if(map.containsKey(s)){
				map.put(s, map.get(s)+1);
			}else
				map.put(s, 1);
		}
		
		System.out.println(map);
		
		for(String key : map.keySet()) {
			if(map.get(key)==1) {
				System.out.println("First Non Repeating word in map is : " + key);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		P9_FirstNonRepeatingWord obj=new P9_FirstNonRepeatingWord();
		obj.getFirstNonRepeatingWord(input);
	}

}
