/*Program 2: find frequency of each word from line
	i/p : "hi good morning hello good morning"
	o/p : hi = 1
		  good = 2
		  morning = 2
		  hello = 1
*/
package nishi.Assignment47;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example2 {
	public static void main(String[] args) {
		String input ="hi good morning hello good morning";
		Map<String,Integer> map=new Example2().findFrequencyOfWord(input);
		System.out.println(map);
		
	}
	
	Map<String,Integer> findFrequencyOfWord(String input)
	{
		String[] arr=input.split(" ");
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(String c:arr)
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
