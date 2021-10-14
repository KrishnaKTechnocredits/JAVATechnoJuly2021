/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/

package nishi.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program9 {
	String findFirstNonRepeatingWord(String input)
	{
		String str1="";
		String[] arr=input.split(" ");
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(String str:arr)
		{
			if(map.containsKey(str))
				map.put(str, map.get(str)+1);
			else
				map.put(str,1);
		}
		for(String a:map.keySet())
		{
			if(map.get(a)==1)
			{
				str1=a;
				break;
			}
		}
		return str1;
	}
	
	public static void main(String[] args) {
		String input="Hi Hello Hi Techno Credits Hi Credits";
		System.out.println("output : "+new Program9().findFirstNonRepeatingWord(input));
	}
}
