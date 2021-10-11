/*program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/
package indu.Assignment_48;

import java.util.Arrays;
import java.util.HashMap;

public class AllDuplicateswithThereFrequency_4 {

	static void getDuplicatesWithFrequency(String input)
	{
		HashMap<String, Integer> hmap = new HashMap<>();
		String[] str = input.split(" ");
		for(String s : str)
		{
			if(hmap.containsKey(s))
			{
				hmap.put(s,hmap.get(s)+1);
			}
			else
			{
				hmap.put(s, 1);
			}
		}
		System.out.println("Input String is : \n"+ input);
		System.out.println(hmap);
		System.out.println("Words with Frequencys more than 1 is :");
		
		for(String key : hmap.keySet())
		{
			if(hmap.get(key)>1)
			{
				System.out.println(key +" -> " +hmap.get(key));
			}
		}
	}
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
	
		getDuplicatesWithFrequency(input);
	}
}
