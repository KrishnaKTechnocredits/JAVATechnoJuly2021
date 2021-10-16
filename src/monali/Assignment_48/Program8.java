package monali.Assignment_48;
/*program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/

import java.util.LinkedHashMap;
import java.util.Map;

public class Program8 {

	void getSecondHighestFreq(String input) {
		Map<String,Integer> map=new LinkedHashMap<>();
		String [] words=input.split(" ");
		for(String word:words) {
			if(map.containsKey(word))
				map.put(word, map.get(word)+1);
			else
				map.put(word, 1);
		}
		int max=0,secondMax=0;
		String secondMaxWord="";
		for(String word:map.keySet()) {
			if(map.get(word)>max) {
				secondMax=max;
				max=map.get(word);
			}else if(map.get(word)>secondMax) {
				secondMax=map.get(word);
				secondMaxWord=word;
			}
				
		}
		System.out.println(secondMaxWord + " - "+ secondMax);
	}
	
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi";
		Program8 p8 = new Program8();
		p8.getSecondHighestFreq(input);
	}
}
