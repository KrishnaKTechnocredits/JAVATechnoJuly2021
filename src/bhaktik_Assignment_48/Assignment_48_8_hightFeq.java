/*program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits";
output : credits -> 2*/

package bhaktik_Assignment_48;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment_48_8_hightFeq {
	
	static void findHightFreq(String input, int hightst) {
		String[] words= input.split(" ");
		HashMap<String, Integer> hm= new HashMap();
		
		for (String word: words) {
			if (hm.containsKey(word)) {
				int n= hm.get(word);
				hm.put(word, ++n);
			}else
				hm.put(word, 1);
		}
		System.out.println(hm);
		String temp="";
		for (int i=0; i< hightst; i++) {
			  temp= removeMax(hm);
			 
			  hm.remove(temp);
		}
		
		 System.out.println(hightst+ ": "+temp+" "+hm.get(temp));
				
	}
	
	static String removeMax(HashMap<String, Integer> hm) {
		String temp1="";
		int mcount=0;
		Set<String> keys= hm.keySet();
		for(String key :keys) {
			 
				if (mcount< hm.get(key)) {
					mcount=hm.get(key);
					temp1=key;
				}	
		}
		return temp1;
	
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		findHightFreq(input, 2);
		
	}
}
