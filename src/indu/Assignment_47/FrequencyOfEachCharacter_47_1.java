/*Program 1: find frequency of each char from string
	i/p : "varsha"
	o/p : v = 1
		  a = 2
		  r = 1
		  s = 1
		  h = 1*/
package indu.Assignment_47;

import java.util.LinkedHashMap;

public class FrequencyOfEachCharacter_47_1 {

	void findFrequency()
	{
		
		String str = "Varsha";
		char ch[] = str.toCharArray();
		LinkedHashMap<Character,Integer> lmap = new LinkedHashMap<>();
		for(char c : ch)
		{
			if(lmap.containsKey(c))
			{
				lmap.put(c,lmap.get(c)+1);
			}
			else
				lmap.put(c, 1);
		}
		
		System.out.print(lmap);
	}
	
	public static void main(String[] args) {
		FrequencyOfEachCharacter_47_1 a47_1 = new FrequencyOfEachCharacter_47_1();
		a47_1.findFrequency();
	}
}
