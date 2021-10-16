/*Program 1: find frequency of each char from string
	i/p : "varsha"
	o/p : v = 1
		  a = 2
		  r = 1
		  s = 1
		  h = 1*/

package nishi.Assignment47;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		String input ="varsha";
		Map<Character,Integer> map=new Example1().findFrequencyOfChar(input);
		System.out.println(map);
		
	}
	
	Map<Character,Integer> findFrequencyOfChar(String input)
	{
		char[] arr=input.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(Character c:arr)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		return map;
	}
}
