/*program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/

package nishi.Assignment48;


import java.util.HashMap;
import java.util.Map;

public class Program8 {
	Map<String,Integer> getSecondHighestfreqWord(String input)
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
		return map;
	}
	
	String findMax(Map<String,Integer> map)
	{
		String maxKey="";	
		int maxValue=0;
		for(String str:map.keySet()){			
			if(map.get(str)>maxValue)
			{
				maxValue=map.get(str);
				maxKey+=str;
			}						
		}
		
		return maxKey;
	}
	public static void main(String[] args) {
		String input="Hi Hello Hi Techno Credits Hi Credits";
		Map<String,Integer> map=new Program8().getSecondHighestfreqWord(input);
		String maxKey=new Program8().findMax(map);
		map.remove(maxKey);
		String secondMax=new Program8().findMax(map);
		System.out.println(secondMax+"->"+map.get(secondMax));
	}
}
