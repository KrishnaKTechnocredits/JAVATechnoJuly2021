package madhavi;

import java.util.*;
//Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method)

public class Assignment_47_1 {
	public static void main(String[] args) {
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		String str ="varsha";
		for(int index=0 ; index<str.length() ;index++ )
		{
			Character ch = str.charAt(index);
			
			if(charCountMap.containsKey(ch))
			{
				int count  = charCountMap.get(ch);
				charCountMap.put(ch, count+1);
			}
			else
			{
				charCountMap.put(ch, 1);
			}
		}

		System.out.println(charCountMap);

	}
}