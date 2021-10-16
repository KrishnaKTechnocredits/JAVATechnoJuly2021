/*program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/

package nishi.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class Program4 {
	void getDuplicates(String input)
	{
		Map<String,Integer> map=new HashMap<>();
		String[] arr=input.split(" ");
		for(String str:arr)
		{
			if(map.containsKey(str))
				map.put(str, map.get(str)+1);
			else
				map.put(str, 1);
		}
		for(String str:map.keySet())
		{
			if(map.get(str)>1)
				System.out.println(str +"->"+map.get(str));
		}
	}
	public static void main(String[] args) {
		String input ="Hi Hello Hi Techno Credits Credits Hi Credits";
		new Program4().getDuplicates(input);
	}
}
