/* program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
     	Credits -> 3 */

package harshada.Assignment48;

import java.util.HashMap;

public class P4_PrintDuplicateWordsWithFreq {
	
	void getDuplicateWordsWithFreq(String str) {
		
		String strarr[]=str.split(" ");
		HashMap <String , Integer> map=new HashMap();
		
		for(String word : strarr) {
			
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else
					map.put(word, 1);
			}
		
		System.out.println("Map Contents : " + map);
		System.out.println ("Duplicate Frequency words are : ");
		for(String s : map.keySet()){
			
			if(map.get(s)>1) {
				System.out.println(s+ " ---> " + map.get((s)));
			}
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		new P4_PrintDuplicateWordsWithFreq().getDuplicateWordsWithFreq(input);
	}

}
