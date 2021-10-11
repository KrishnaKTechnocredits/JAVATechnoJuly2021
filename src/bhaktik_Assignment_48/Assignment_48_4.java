/*program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/

package bhaktik_Assignment_48;

import java.util.HashMap;

public class Assignment_48_4 {
	//Method 1
	static void duplicateWordFrequency(String input, String check) {
		String[] str= input.split(" ");
		int count=0;
		for (String x: str) {
			 if (x.equals(check))
				 count++;
		}
		System.out.println(count);
	}
	//Method : hashMap
	static void duplicateWordFrequency1(String input, String check) {
		String[] str= input.split(" ");
		HashMap<String, Integer> hm= new HashMap();
		for (String s: str) {
			if (hm.containsKey(s)) {
				int num= hm.get(s);
				hm.put(s, ++num);
			}else {
				hm.put(s, 1);
			}
		}
		System.out.println(hm.get(check));
	}
	//Method 3
	static void duplicateWordFrequency2(String input, String check) {
		int ol= input.length();
		int strL=check.length();
		
		input= input.replace(check, "");
		int newL=input.length();
		int num= (ol-newL)/strL;
		System.out.println(num);
	}
	//Method 4
	
	
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno  Credits Hi Credits";
		duplicateWordFrequency(input, "Credits");
		duplicateWordFrequency1(input, "Credits");
		duplicateWordFrequency2(input, "Credits");
	}

}
