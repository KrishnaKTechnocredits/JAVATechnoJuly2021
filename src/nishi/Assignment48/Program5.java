/*program 5: find the freq of each character in given word.
String input = "technocredits";*/

package nishi.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program5 {
	public static void main(String[] args) {
		String input ="technocredits";
		Map<Character,Integer> map=new Program5().findFrequencyOfChar(input);
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
