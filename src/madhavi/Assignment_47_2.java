package madhavi;

import java.util.*;
//Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method)

public class Assignment_47_2 {
	public static void main(String[] args) {
		Map<String, Integer> strCountMap = new HashMap<String, Integer>();
		String str ="hi good morning hello good morning";
		String[] arr = str.split(" ");
		for(int index=0 ; index<arr.length ;index++ )
		{
			String s = arr[index];
			
			if(strCountMap.containsKey(s))
			{
				int count  = strCountMap.get(s);
				strCountMap.put(s, count+1);
			}
			else
			{
				strCountMap.put(s, 1);
			}
		}

		System.out.println(strCountMap);

	}
}