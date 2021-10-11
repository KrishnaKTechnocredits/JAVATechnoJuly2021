/*Program 2: find frequency of each word from line
	i/p : "hi good morning hello good morning"
	o/p : hi = 1
		  good = 2
		  morning = 2
		  hello = 1*/
package indu.Assignment_47;

import java.util.LinkedHashMap;

public class FrequencyOfeachWord_47_2 {

	void findFrequency()
	{
		
		String input = "hi good morning hello good morning";
		String str[]=input.split(" ");
		LinkedHashMap<String,Integer> lmap = new LinkedHashMap<>();
		for(String str1 : str)
		{
			if(lmap.containsKey(str1))
			{
				lmap.put(str1,lmap.get(str1)+1);
			}
			else
				lmap.put(str1, 1);
		}
		
		System.out.print(lmap);
	}
	
	public static void main(String[] args) {
		FrequencyOfeachWord_47_2 a47_2 = new FrequencyOfeachWord_47_2();
		a47_2.findFrequency();
	}
}
