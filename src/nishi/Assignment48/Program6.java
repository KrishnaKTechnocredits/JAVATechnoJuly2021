/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
*/
package nishi.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program6 {
	public static void main(String[] args) {
		String input ="Hi Hello Hi Techno Credits Credits Hi Credits";
		Map<String,Integer> map=new Program6().findFrequencyOfWord(input);
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
