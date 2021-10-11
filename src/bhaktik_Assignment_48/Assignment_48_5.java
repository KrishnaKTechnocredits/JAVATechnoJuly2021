/*program 5: find the freq of each character in given word.
String input = "technocredits";*/

package bhaktik_Assignment_48;

import java.util.HashMap;

public class Assignment_48_5 {
	
	static void frequencyOfEachChar(String input) {
		 char[] arry1= input.toCharArray();
		HashMap<Character, Integer> hm= new HashMap();
		for (char ch: arry1) {
			if (hm.containsKey(ch)) {
				int num= hm.get(ch);
				hm.put(ch, ++num);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}
	
	public static void main(String[] args) {
		String input = "technocredits";
		frequencyOfEachChar(input);
	}

}
