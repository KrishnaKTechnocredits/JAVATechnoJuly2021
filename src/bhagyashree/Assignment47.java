
package bhagyashree;

import java.util.HashMap;
import java.util.Map;

public class Assignment47 {
	/*
	 * Program 1: find frequency of each char from string
		i/p : "varsha"
		o/p : v = 1
			  a = 2
			  r = 1
			  s = 1
			  h = 1

	 */
	Map<Character,Integer> getFrequencyOfEachCharacter(String input)
	{
	Map<Character,Integer> outputMap=new HashMap<Character,Integer>();
	{
		for(int index=0;index<input.length();index++)
		{
			char ch=input.charAt(index);
			if(outputMap.containsKey(ch))
			{
				int count=outputMap.get(ch);
				outputMap.put(ch, ++count);
			}
			else
				outputMap.put(ch, 1);
		}
		return outputMap;
	}
	}
	
	/*Program 2: find frequency of each word from line
	i/p : "hi good morning hello good morning"
	o/p : hi = 1
		  good = 2
		  morning = 2
		  hello = 1*/
	
	Map<String,Integer> getFrequencyOfEachWord(String input)
	{
		Map<String,Integer> output=new HashMap<String,Integer>();
		String[] str=input.split(" ");
		for(int index=0;index<str.length;index++)
		{
			String word1=str[index];
			if(output.containsKey(word1))
			{
				int count=output.get(word1);
				output.put(word1, ++count);
			}
			else
				output.put(word1, 1);
		}
		return output;
	}

	
	public static void main(String[] args)
	{
		Assignment47 ass47=new Assignment47();
		System.out.println(ass47.getFrequencyOfEachCharacter("BhagyashreeB"));
		
		System.out.println(ass47.getFrequencyOfEachWord("Bhagyashree Jitendra Yeole Bhagyashree Yeole"));
	}
}
