/* 
 
program 5: find the freq of each character in given word.
String input = "technocredits"; 

*/

package harshada.Assignment48;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class P5_FindFreqOfCharacter {
	
	void getFreqOfChar(String input) {
		
		LinkedHashMap <Character, Integer> map=new LinkedHashMap ();
		
		for(int i=0 ; i< input.length(); i++ ) {
			char ch=input.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else
				map.put(ch, 1);
		}
		System.out.println("Frequency of each Char in Word in Map \n" + map);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="technocredits";
		new P5_FindFreqOfCharacter() .getFreqOfChar(str);
	}

}
