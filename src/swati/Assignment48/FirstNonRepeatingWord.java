package swati.Assignment48;

import java.util.LinkedHashMap;

/*
 * program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap
 */
public class FirstNonRepeatingWord {
	
	void findFirstNonRepeatingWord(String input) {
		String[] arr=input.split(" ");
		LinkedHashMap<String,Integer> map1=new LinkedHashMap<String,Integer>();
		for(String str:arr) {
			if(map1.containsKey(str)) {
				map1.put(str,map1.get(str)+1);
			}else
				map1.put(str,1);
		}
		for(String str:map1.keySet()) {
			if(map1.get(str)==1) {
				System.out.println("First non repeating word: "+str);
				break;
			}
		}
	}
	
	public static void main(String[] a) {
		FirstNonRepeatingWord s1=new FirstNonRepeatingWord();
		String input= "Hi Hello Hi Techno Credits Credits Hi Credits";
		s1.findFirstNonRepeatingWord(input);				
	}
}
