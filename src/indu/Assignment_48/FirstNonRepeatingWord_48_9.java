/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/
package indu.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingWord_48_9 {
	
	static void firstNonREpeatingWord(String str)
	{
		String[] input = str.split(" ");
		
		Map<String,Integer> tmap = new LinkedHashMap<>();
		for(String word : input)
		{
			if(tmap.containsKey(word))
			{
				tmap.put(word, tmap.get(word)+1);
			}
			else
			{
				tmap.put(word, 1);
			}
			
		}
		//System.out.println(tmap);
		
		for(String key:tmap.keySet())
		{
			if(tmap.get(key)==1)
			{
				System.out.println("The first non repeating word from given string\n"+ ""+str+" is : "+key);
				break;
			}
		}
    }
	
	public static void main(String[] args) {
		firstNonREpeatingWord("Hi Hello Hi Techno Credits Hi Credits");
	}
}
