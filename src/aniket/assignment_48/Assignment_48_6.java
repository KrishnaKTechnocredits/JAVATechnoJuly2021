package aniket.assignment_48;

/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment_48_6 {

	Map<String,Integer> frequencyofEachword(String input)
	{
		String[] arr = input.split(" ");
		Map<String,Integer> map = new LinkedHashMap<>();
		
		for(String str : arr)
		{
			if(map.containsKey(str))
			{
				map.put(str, map.get(str)+1);
			}
			else
			{
				map.put(str, 1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		Assignment_48_6 a48_6 = new Assignment_48_6();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		System.out.println("Frequency of each word of string \n"+input+" is : \n"+a48_6.frequencyofEachword(input));
	}
}

