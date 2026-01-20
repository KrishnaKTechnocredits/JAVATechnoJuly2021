/*program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2*/


package amol_Pawar.assignment_48;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program_8 {

	void getSecHighestNum(String input)
	{
		Map<String, Integer> mapList=new HashMap();
		String inputword[]=input.split(" ");
		for(int index=0;index<inputword.length;index++)
		{
			String word=inputword[index];
			if(mapList.containsKey(word))
			{
				mapList.put(word, mapList.get(word)+1);
			}
			else
			{
				mapList.put(word, 1);
			}
		}
		Set<String> setData= mapList.keySet();
		int secHighestNum=0;
		int highestNum=0;
		String key="";
		for(String word:setData)
		{
			
			if(mapList.get(word)>highestNum)
			{
				secHighestNum=highestNum;
				highestNum=mapList.get(word);
				key=word;
				
			}
			else if(mapList.get(word)>secHighestNum )
			{
				secHighestNum=mapList.get(word);
				key=word;
			}
		}
		System.out.println(key+" : "+secHighestNum);
		
	}
	public static void main(String[] args) {
		
		Program_8 program_8=new Program_8();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		program_8.getSecHighestNum(input);
		
		
		
	}

}
